public class run {
    String playername;
    int position;
    int score;
    int coin;
    int lap;

    void dash(){
        System.out.println("Dash....");
    }

    void jump(){
        System.out.println("Jump...");
    }

    void hit(run run){
        System.out.println("Eat this...");
        score +=100;
    }

    void skill(run run){
        System.out.println("Amakakeru ryu no hirameki!!!");
        score +=500;
    }

    void balap(run run){
        position -=1;
    }

    void lewat (run run){
        position +=1;
    }

    void coin(){
        coin +=1;
}
}
