public class Main {
    public static void main(String[] args) {
        run player1 = new run();
        run player2 = new run();
        run player3 = new run();
        run player4 = new run();


        player1.playername = "Player 1";
        player1.score=100;
        player1.position=4;
        player1.lap=1;
        player1.coin=4;

        player2.playername = "Player 2";
        player2.score=405;
        player2.position=3;
        player2.lap=1;
        player2.coin=7;

        player3.playername = "Player 3";
        player3.score=1045;
        player3.position=1;
        player3.lap=1;
        player3.coin=4;

        player4.playername = "Player 4";
        player4.score=985;
        player4.position=2;
        player4.lap=1;
        player4.coin=4;

        player1.dash();
        player1.jump();
        System.out.println(player1.score);
        player1.hit(player2);
        System.out.println(player1.score);

        System.out.println(player4.coin);
        player4.coin();
        System.out.println(player4.coin);
        System.out.println("Player 4 position :"+player4.position);
        player4.balap(player3);
        player3.lewat(player4);
        System.out.println("Player 4 position :"+player4.position);
        System.out.println("Player 3 position :"+player3.position);



    }
}
