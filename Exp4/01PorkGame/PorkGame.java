import java.util.Random;
import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;
public class PorkGame {
	private Card52 deck[];
	public Computer pc;
	public People people;
	String faces[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J","Q", "K" };
	String suits[] = { "黑桃", "红桃", "梅花", "方块" };
	public PorkGame() {
		deck = new Card52[52];
		people = new People();
		pc = new Computer();
	}
	public void genCard() {
		for (int i = 0; i < deck.length; i++) {
			deck[i] = new Card52(faces[i % 13], suits[i / 13]);
		}
	}
	public void shuffle() {
		Card52 temp;
		for (int first = 0; first < deck.length; first++) {
			int second = (int) (Math.random() * 52);
			temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	public static void judge(float human_Score,float pc_Score,int human_size,int pc_size ){
		if(human_Score>21)System.out.println("玩家输了");
		else if((human_Score>pc_Score)&&(human_Score<21))
				System.out.println("玩家赢了");
		else 	if((human_Score==pc_Score)&&(human_size>pc_size))
				System.out.println("玩家赢了");
		else 	if(pc_Score<=21)
				System.out.println("电脑赢了");
	}
	public static void humanPlay(PorkGame pork){
		pork.people.msg();
		for(int j=0;j<2;j++)pork.people.setPork(pork.deck[j]);
		System.out.println("玩家获得牌");
		pork.people.show();
		for (int i = 2; i < pork.deck.length-2; i++) {
				pork.people.setPork(pork.deck[i]);
				if(!pork.people.getPork())break;
		}
		pork.people.show();
		System.out.println("玩家得分："+pork.people.getScore());
	}
	public static void computerPlay(PorkGame pork){
		pork.pc.msg();
		for(int j=pork.people.getPorkArraySize();j<pork.people.getPorkArraySize()+2;j++)pork.pc.setPork(pork.deck[j]);
		System.out.println("电脑获得牌");
		pork.pc.show();
		for (int i = 2+pork.people.getPorkArraySize(); i < 52; i++) {
				pork.pc.setPork(pork.deck[i]);
				if(!pork.pc.getPork())break;
		}
		pork.pc.show();
		System.out.println("电脑得分："+pork.pc.getScore());

	}
	public static void main(String[] args) {
		PorkGame pork = new PorkGame();
		pork.genCard();
		pork.shuffle(); // 发牌
		humanPlay(pork);
		computerPlay(pork);
		judge(pork.people.getScore(),pork.pc.getScore(),pork.people.getPorkArraySize(),pork.pc.getPorkArraySize());
	}

	class People{//玩家
			private ArrayList <Card52> deck;
			public People(){
				deck = new ArrayList<Card52>();
			}
			public void setPork(String f, String s){
				deck.add(new Card52(f, s));
			}
			public void setPork(Card52 card){
				deck.add(new Card52(card));
			}
			public int getPorkArraySize(){
				return deck.size();
			}
			public void show(){
				System.out.println(deck);

			}
		  public void msg(){
				System.out.println("玩家阶段");
			}
			public float getScore(){
				float point = 0;
				float temp;
				for(int i=0;i<deck.size();i++){
					String facestr=deck.get(i).getFace();
					if(facestr.equals("A")) point+=1;
					else if(facestr.equals("J")|facestr.equals("Q")|facestr.equals("K")) point+=0.5;
					else{temp=Integer.parseInt(deck.get(i).getFace());point+=temp-Integer.parseInt("1")+1;}//			if(deck.get(i).getFace.equals("A"));
				}
				return point;
			}
			public boolean getPork(){
				 Scanner scanner=new Scanner(System.in);
				 System.out.println("是否继续要牌？(y/n):");
				 String YorN;
				 YorN=scanner.next();
				 System.out.println(YorN);
				 return(YorN.equals("y"));
			}
	}


	class Computer{//电脑
			private ArrayList <Card52> deck;
			public  Computer(){
				deck = new ArrayList<Card52>();
			}
			public void setPork(String f, String s){
				deck.add(new Card52(f, s));
			}
			public void setPork(Card52 card){
				deck.add(new Card52(card));
			}
			public int getPorkArraySize(){
				return deck.size();
			}
			public void msg(){
				System.out.println("电脑阶段");
			}
			public float getScore(){
				float point = 0;
				float temp;
				for(int i=0;i<deck.size();i++){
					//
					String facestr=deck.get(i).getFace();
					if(facestr.equals("A")) point+=1;
					else if(facestr.equals("J")|facestr.equals("Q")|facestr.equals("K")) point+=0.5;
					else{temp=Integer.parseInt(deck.get(i).getFace());point+=temp-Integer.parseInt("1")+1;}//			if(deck.get(i).getFace.equals("A"));
				}
				return point;
			}
			public boolean getPork(){
				 //Scanner scanner=new Scanner(System.in);
				 System.out.println("电脑要了一张牌:");
				 int i=(int) (Math.random() * 10);
				 show();
	 			 return (i>5);
			}
			public void show(){
				System.out.println(deck);
			}
	}


	class Card52 {
			private String face;
			private String suit;

			public Card52(String f, String s){
				face = f;
				suit = s;
			}
			public Card52(Card52 card){
				face = card.getFace();
				suit = card.getSuit();
			}
			protected String getSuit() {
				return suit;
			}
			protected String getFace() {
				return face;
			}
			public String toString() {
				return face + " of " + suit;
			}
		}



}
