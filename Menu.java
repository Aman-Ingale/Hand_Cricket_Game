import java.util.Scanner;

public class Menu {
    Match m = new Match();
    Scanner sc = new Scanner(System.in);
    int n=0;

    void selectTeam(){
        System.out.println("Select Your team : ");
        for (int i = 0; i <m.teams.length; i++) {
            System.out.println(i+" : "+ m.teams[i]+"\n");
        }
        n = sc.nextInt();
        m.indexUser=n;
        switch (n) {
            case 0:
                clone(m.IND,m.team1);
                break;
            case 1:
                clone(m.AUS,m.team1);
                break;
            case 2:
                clone(m.PAK,m.team1);
                break;
            case 3:
                clone(m.NZ,m.team1);
                break;
            case 4:
                clone(m.WI,m.team1);
                break;
            case 5:
                clone(m.BAN,m.team1);
                break;
            case 6:
                clone(m.ENG,m.team1);
                break;
            case 7:
                clone(m.SL,m.team1);
                break;
            default:
                break;
        }
        System.out.println("Select Your Opponent team : ");
        for (int i = 0; i <m.teams.length; i++) {
            if(i==n){
                continue;
            }
            System.out.println(i+" : "+ m.teams[i]+"\n");
        }
        n=sc.nextInt();
        m.indexComp=n;
        switch (n) {
            case 0:
                clone(m.IND,m.team2);
                break;
            case 1:
                clone(m.AUS,m.team2);
                break;
            case 2:
                clone(m.PAK,m.team2);
                break;
            case 3:
                clone(m.NZ,m.team2);
                break;
            case 4:
                clone(m.WI,m.team2);
                break;
            case 5:
                clone(m.BAN,m.team2);
                break;
            case 6:
                clone(m.ENG,m.team2);
                break;
            case 7:
                clone(m.SL,m.team2);
                break;
            default:
                break;
        }
        m.toss();
    }
    void Dashboard(){
       System.out.println("Welcome to Hand Cricket Game!!\nPress 1 to Start Game\nPress 2 to Quit Game");
       
       try {
        n=sc.nextInt();
       } catch (Exception e) {
        System.out.println("Enter valid input");
        Dashboard();
       }
       if(n==1){
            selectTeam();
       }
       else if(n==2){
            System.exit(0);
       }
    
    }
    void clone(StringBuffer arr1[], StringBuffer arr2[]){
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
    }

}
