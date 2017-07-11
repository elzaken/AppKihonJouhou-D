import java.util.Scanner;


public class KihonJouhou {


public static void main(String[] args){
    //mainを置く
    	int situ1 = situmon1();
    	int situ2 = situmon2();
    	int situ3 = situmon3();
    	int situ4 = situmon4();
    	int situ5 = situmon5();

    	//質問内容
    	//
    }


	public static  int situmon1(){
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("問題文");
        System.out.println("選択");
        answer = sc.nextInt();
		return answer;
	}

	public static int situmon2(){
		int answer = 0;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("問題２：公衆回線をあたかも自社内で構築した"
				+ "ネットワークのような使い勝手で利用できるサービスは？");
		System.out.println("選択肢１～４の中から正解を選んでください。");
		System.out.println("１：広域イーサネット");
		System.out.println("２：WAN");
		System.out.println("３：ISDN");
		System.out.println("４：VPN");
		System.out.println("入力：");
		answer = sc2.nextInt();
		System.out.println("正解は：４です");
		return answer;

	}


   public static int situmon3(){
	   int answer = 0;
		return answer;

	}
   public static int situmon4(){
	   int answer = 0;
		return answer;

    }
    public static int situmon5(){
    	int answer = 0;
		return answer;


    }

}
