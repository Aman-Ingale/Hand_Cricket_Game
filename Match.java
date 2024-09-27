import java.util.Random;
import java.util.Scanner;
public class Match {
    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();
    Utilities u = new Utilities();

    int user=0;
    int comp=0;
    int wickets=0;
    int runs=0;
    int balls=0;
    int Striker=0;
    int indexUser=0;
    int indexComp=0;

    StringBuffer team1[] = new StringBuffer[11];
    StringBuffer team2[] = new StringBuffer[11];

    String teams[] = {"IND","AUS","PAK","NZ","WI","BAN","ENG","SL"};
    
    StringBuffer IND[] = {
        new StringBuffer("Rohit Sharma"),
        new StringBuffer("Shubhman Gill"),
        new StringBuffer("Virat Kohli"),
        new StringBuffer("SuryaKumar Yadav"),
        new StringBuffer("Rishab Pant"),
        new StringBuffer("Hardik Pandya"),
        new StringBuffer("Ravindra Jadeja"),
        new StringBuffer("Axar Patel"),
        new StringBuffer("Kuldeep Yadav"),
        new StringBuffer("Arshdeep Singh"),
        new StringBuffer("Jasprit Bhumrah")
    };
    StringBuffer AUS[] = {
        new StringBuffer("David Warner"),
        new StringBuffer("Travis Head"),
        new StringBuffer("Mitchell Marsh"),
        new StringBuffer("Cameron Green"),
        new StringBuffer("Mathew Wade"),
        new StringBuffer("Glenn Maxwell"),
        new StringBuffer("Marcus Stoinis"),
        new StringBuffer("Pat Cummins"),
        new StringBuffer("Mitchell Starc"),
        new StringBuffer("Adam Zampa"),
        new StringBuffer("Josh Hazlewood")
    };
    StringBuffer NZ[] = {
        new StringBuffer("Tom Latham"),
        new StringBuffer("Will Young"),
        new StringBuffer("Kane Williamson"),
        new StringBuffer("Devon Conway"),
        new StringBuffer("Daryl Mitchell"),
        new StringBuffer("Tom Blundell"),
        new StringBuffer("Colin de Grandhomme"),
        new StringBuffer("Kyle Jamieson"),
        new StringBuffer("Tim Southee"),
        new StringBuffer("Ajaz Patel"),
        new StringBuffer("Trent Boult")
    };
    StringBuffer RSA[] = {
        new StringBuffer("Dean Elgar"),
        new StringBuffer("Aiden Markram"),
        new StringBuffer("Keegan Petersen"),
        new StringBuffer("Rassie van der Dussen"),
        new StringBuffer("Temba Bavuma"),
        new StringBuffer("Kyle Verreynne"),
        new StringBuffer("Kagiso Rabada"),
        new StringBuffer("Keshav Maharaj"),
        new StringBuffer("Mitchell Starc"),
        new StringBuffer("Duanne Olivier"),
        new StringBuffer("Lungi Ngidi")
    };
    StringBuffer PAK[] = {
        new StringBuffer("Abdullah Shafique"),
        new StringBuffer("Imam-ul-Haq"),
        new StringBuffer("Shan Masood"),
        new StringBuffer("Babar Azam"),
        new StringBuffer("Saud Shakeel"),
        new StringBuffer("Sarfaraz Ahmed"),
        new StringBuffer("Salman Agha"),
        new StringBuffer("Shaheen Shah Afridi"),
        new StringBuffer("Naseem Shah"),
        new StringBuffer("Noman Ali"),
        new StringBuffer("Abrar Ahmed")
    };
    StringBuffer WI[] = {
        new StringBuffer("Kraigg Brathwaite"),
        new StringBuffer("Tagenarine Chanderpaul"),
        new StringBuffer("Raymon Reifer"),
        new StringBuffer("Jermaine Blackwood"),
        new StringBuffer("Alick Athanaze"),
        new StringBuffer("Joshua Da Silva"),
        new StringBuffer("Jason Holder"),
        new StringBuffer("Alzarri Joseph"),
        new StringBuffer("Rahkeem Cornwall"),
        new StringBuffer("Kemar Roach"),
        new StringBuffer("Jomel Warrican")
    };
    StringBuffer BAN[] = {
        new StringBuffer("Shadman Islam"),
        new StringBuffer("Zakir Hasan"),
        new StringBuffer("Najmul Hossain Shanto"),
        new StringBuffer("Mominul Haque"),
        new StringBuffer("Mushfiqur Rahim"),
        new StringBuffer("Shakib Al Hasan"),
        new StringBuffer("Litton Das"),
        new StringBuffer("Mehidy Hasan Miraz"),
        new StringBuffer("Taskin Ahmed"),
        new StringBuffer("Hasan Mahmud"),
        new StringBuffer("Nahid Rana")
    };
    StringBuffer ENG[] = {
        new StringBuffer("Zak Crawley"),
        new StringBuffer("Ben Duckett"),
        new StringBuffer("Ollie Pope"),
        new StringBuffer("Joe Root"),
        new StringBuffer("Jonny Bairstow"),
        new StringBuffer("Ben Stokes"),
        new StringBuffer("Ben Foakes"),
        new StringBuffer("Tom Hartley"),
        new StringBuffer("Ollie Robinson"),
        new StringBuffer("James Anderson"),
        new StringBuffer("Shoaib Bashir")
    };
    StringBuffer SL[] = {
        new StringBuffer("Nishan Madushka"),
        new StringBuffer("Dimuth Karunaratne"),
        new StringBuffer("Kusal Mendis"),
        new StringBuffer("Angelo Mathews"),
        new StringBuffer("Sadeera Samarawickrama"),
        new StringBuffer("Dinesh Chandimal"),
        new StringBuffer("Dhananjaya de Silva"),
        new StringBuffer("Ramesh Mendis"),
        new StringBuffer("Prabath Jayasuriya"),
        new StringBuffer("Kasun Rajitha"),
        new StringBuffer("Vishwa Fernando")
    };


    int team1score[]= new int[11];
    int team2score[]= new int[11];
    StringBuffer Player1= new StringBuffer();
    int nonStriker=0;
    StringBuffer Player2= new StringBuffer();
    int ptr;
    void toss(){
        System.out.println("Start Match!!\n"+teams[indexUser]+" vs "+teams[indexComp]+"\nIt's time for toss!!");
        System.out.print("Enter 0:head 1:tails :- ");
        try {
            int tossUser = sc.nextInt();
            int coin = rnd.nextInt(2);
            if(tossUser==coin){
                System.out.println("You won the toss!\nEnter 1:Bating 2:Bowling");
                int elct = sc.nextInt();
                switch (elct) {
                    case 1:
                    System.out.println("You are Batting first : ");
                        Player1=team1[0];
                        Player2=team1[1];
                        Batting();
                        return;
                    case 2:
                    System.out.println("You are Bowling first : ");
                        Player1=team2[0];
                        Player2=team2[1];
                        Bowling();
                        return;
                    default:
                        break;
                }
            }
            else if(tossUser>2){
                throw new Exception();
            }
            else{
                System.out.println("You lost the toss");
                int temp = rnd.nextInt(2);
                switch(temp){
                    case 0:
                    System.out.println("You are Batting first.");
                    Player1=team1[0];
                    Player2=team1[1];
                    Batting();
                    return;
                    case 1:
                    System.out.println("You are Bowling first.");
                    Player1=team2[0];
                    Player2=team2[1];
                    Bowling();
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("Enter valid choice!!(toss)");
        }
    }
    void Batting(){
        //batting first -> Defending
        runs=0;
        wickets=0;
        balls=0;
        comp=0;
        user=0;
        System.out.println("comp : "+comp+"\t | \tuser : "+user+"\n"+teams[indexUser]+" | Score : "+runs+"/"+wickets+"\n"+Player1+" : "+Striker+"\n"+Player2+" : "+nonStriker);
        while(true){
            balls++;
            System.out.println();
            
            comp = rnd.nextInt(7);
            try {
                System.out.print("Your turn : ");
                int user = sc.nextInt();
                if(user==comp){
                    wickets++;
                    
                    if(ptr==0){
                        // team1score[indexOf(Player1,team1)]=Striker;
                        // myteam.put(Player1,Striker);
                        
                        if(wickets<10){
                            Player1=team1[u.checkBigger(Player1, Player2,team1)+1];
                            Striker=0;
                            


                        }                 
                    }
                    else{
                        // team1score[indexOf(Player2,team1)]=nonStriker;
                        // myteam.put(Player2,nonStriker);
                        if(wickets<10){
                            Player2=team1[u.checkBigger(Player1, Player2,team1)+1];
                            nonStriker=0;
                            

                        } 

                    }
                    
                }
                else if(user>6){
                    //throw new Exception();
                    System.out.println("Enter choice b/w [0,1,2,3,4,5,6].");
                    continue;
                }
                else{
                    if(ptr==0){
                        Striker=Striker+user;
                        //myteam.put(Player1,Striker);
                        team1score[u.indexOf(Player1,team1)]=Striker;
                        
                    }
                    else{
                        nonStriker = nonStriker+user;
                        //myteam.put(Player2,nonStriker);
                        team1score[u.indexOf(Player2,team1)]=nonStriker;
                    }
                    if(user%2!=0){
                        changeptr();
                    }
                    runs=runs+user;
                }
                System.out.println("comp : "+comp+"\t | \tuser : "+user+"\n"+teams[indexUser]+" | Score : "+runs+"/"+wickets+"\n"+Player1+" : "+Striker+"\n"+Player2+" : "+nonStriker);
            } catch (Exception e) {
                System.out.println("Enter valid choice");
                toss();
            }
            if(wickets==10){
                // team1score[indexOf(Player1,team1)]=Striker; 
                // team1score[indexOf(Player2,team1)]=nonStriker;
                // myteam.put(Player1,Striker);
                // myteam.put(Player2,nonStriker);
                // for (int i = 0; i <team1.length; i++) {
                //     System.out.println(myteam.get(team1[i]));
                // }
                u.removePtr(team1);
                System.out.println();
                for (int i = 0; i <team1score.length; i++) {
                    System.out.println(team1[i].toString()+": "+team1score[i]);
                }
                int target = runs+1;
                System.out.println("You need to defend "+target+" runs");
                Bowling(target);
                return;
            }
            

        }
    }
    void Bowling(int target){
        //Defending target
        wickets=0;
        runs=0;
        balls=0;
        user=0;
        comp=0;
        Player1=team2[0];
        Striker=0;
        Player2=team2[1];
        nonStriker=0;
        System.out.println("comp : "+comp+"\t | \tuser : "+user+teams[indexComp]+"\n | Score : "+runs+"/"+wickets+"\n"+Player1+" : "+Striker+"\n"+Player2+" : "+nonStriker+"\nTarget : "+target+"\n"+(target-runs)+"to win, "+(10-wickets)+"wickets left.");
        while(true){
            System.out.println();
            comp = rnd.nextInt(7);
            try {
                System.out.print("Your turn : ");
                int user = sc.nextInt();
                if(user==comp){
                    wickets++;
                    if(ptr==0){
                        // team2score[indexOf(Player2,team2)]=Striker;
                        // oopteam.put(Player2,Striker);
                        
                        if(wickets<10){
                            Player1=team2[u.checkBigger(Player1, Player2,team2)+1];
                            Striker=0;

                        }
                    }
                    else{
                        // team2score[indexOf(Player2,team2)]=nonStriker;
                        // oopteam.put(Player2,nonStriker);
                       
                        if(wickets<10){
                            Player2=team2[u.checkBigger(Player1, Player2,team2)+1];
                            nonStriker=0;
                        }
                    }
                }
                else if(user>6){
                    //throw new Exception();
                    System.out.println("Enter choice b/w [0,1,2,3,4,5,6].");
                    continue;
                }
                else{
                    if(ptr==0){
                        Striker=Striker+comp;
                        team2score[u.indexOf(Player1,team2)]=Striker;
                    }
                    else{
                        nonStriker = nonStriker+comp;
                        team2score[u.indexOf(Player2,team2)]=nonStriker;
                    }
                    if(comp%2!=0){
                        changeptr();
                    }
                    runs=runs+comp;
                }
                System.out.println("comp : "+comp+"\t | \tuser : "+user+teams[indexComp]+"\n | Score : "+runs+"/"+wickets+"\n"+Player1+" : "+Striker+"\n"+Player2+" : "+nonStriker+"\nTarget : "+target+"\n"+(target-runs)+"to win, "+(10-wickets)+"wickets left.");
            } catch (Exception e) {
                System.out.println("Enter a valid choice"+e);
                toss();
                return;
            }
            if(runs<=target && wickets==10){
                // team1score[indexOf(Player1,team1)]=Striker;
                // team1score[indexOf(Player2,team1)]=nonStriker;
                // myteam.put(Player1,Striker);
                // myteam.put(Player2,nonStriker);
                System.out.println("--------------------------");
                System.out.println("1st innings(user) :"+"\nScore : "+(target-1)+"/10");
                System.out.println();
                u.removePtr(team1);
                for (int i = 0; i <team1score.length; i++) {
                    System.out.println(team1[i].toString()+": "+team1score[i]);
                }
                System.out.println("\n2nd innings(comp) : \nScore : "+runs+"/"+wickets);
                System.out.println();
                u.removePtr(team2);
                for (int i = 0; i <team2score.length; i++) {
                    System.out.println(team2[i].toString()+": "+team2score[i]);
                }
                System.out.println
                ("\nYou won by "+(target-runs)+"runs\n--------------------------");
                return;
            }
            else if(runs>=target && wickets!=10){
                // team1score[indexOf(Player1,team1)]=Striker;
                // team1score[indexOf(Player2,team1)]=nonStriker;
                // myteam.put(Player1,Striker);
                // myteam.put(Player2,nonStriker);
                System.out.println("--------------------------");
                System.out.println("1st innings(user) :"+"\nScore : "+(target-1)+"/10");
                System.out.println();
                u.removePtr(team1);
                for (int i = 0; i <team1score.length; i++) {
                    System.out.println(team1[i].toString()+": "+team1score[i]);
                }
                System.out.println("\n2nd innings(comp) : \nScore : "+runs+"/"+wickets);
                System.out.println();
                u.removePtr(team2);
                for (int i = 0; i <team2score.length; i++) {
                    System.out.println(team2[i].toString()+": "+team2score[i]);
                }
                System.out.println("\nOpponent won by "+(10-wickets)+"wickets\n--------------------------");
                return;
            }
            

        }
    }
    void Bowling(){
        //bowling first -> Chasing
        runs=0;
        wickets=0;
        balls=0;
        user=0;
        comp=0;
        System.out.println("comp : "+comp+"\t | \tuser : "+user+"\n"+teams[indexComp]+" | Score : "+runs+"/"+wickets+"\n"+Player1+" : "+Striker+"\n"+Player2+" : "+nonStriker);
        while(true){
            try {

            System.out.println();
            comp = rnd.nextInt(7);

                System.out.print("Your turn : ");
                int user = sc.nextInt();
                if(user==comp){
                    wickets++;
                    if(ptr==0){
                        // team2score[indexOf(Player1,team2)]=Striker;
                        //oopteam.put(Player1,Striker);
                        
                        if(wickets<10){
                            Player1=team2[u.checkBigger(Player1, Player2,team2)+1];
                            Striker=0;
                        }
                    }
                    else{
                        // team2score[indexOf(Player2,team2)]=nonStriker;
                        
                        if(wickets<10){
                            Player2=team2[u.checkBigger(Player1, Player2,team2)+1];
                            nonStriker=0;
                            
                        }
                        
                    }
                    
                }
                else if(user>6){
                    //throw new Exception();
                    System.out.println("Enter choice b/w [0,1,2,3,4,5,6].");
                    continue;
                }
                else{
                    if(ptr==0){
                        Striker=Striker+comp;
                        //myteam.put(Player1,Striker);
                        team2score[u.indexOf(Player1,team2)]=Striker;
                    }
                    else{
                        nonStriker = nonStriker+comp;
                        //myteam.put(Player2,nonStriker);
                        team2score[u.indexOf(Player2,team2)]=nonStriker;
                    }
                    if(comp%2!=0){
                        changeptr();
                    }
                    runs=runs+comp;
                }
                System.out.println("comp : "+comp+"\t | \tuser : "+user+"\n"+teams[indexComp]+" | Score : "+runs+"/"+wickets+"\n"+Player1+" : "+Striker+"\n"+Player2+" : "+nonStriker);
            } catch (Exception e) {
                System.out.println("Enter a valid choice"+e);
                toss();
                return;
            }
            if(wickets==10){
                // team1score[indexOf(Player1,team1)]=Striker; 
                // team1score[indexOf(Player2,team1)]=nonStriker;
                // myteam.put(Player1,Striker);
                // myteam.put(Player2,nonStriker);
                // for (int i = 0; i <team2.length; i++) {
                //     System.out.println(oopteam.get(team2[i]));
                // }
                System.out.println();
                u.removePtr(team2);
                for (int i = 0; i <team2score.length; i++) {
                    System.out.println(team2[i].toString()+": "+team2score[i]);
                }
                int target = runs+1;
                System.out.println("You need to chase "+target+" runs");
                Batting(target);
                return;
            }
        }  
    }
    void Batting(int target){
        //Chasing target
        wickets=0;
        runs=0;
        balls=0;
        Player1=team1[0];
        Striker=0;
        Player2=team1[1];
        nonStriker=0;
        user=0;
        comp=0;
        System.out.println("comp : "+comp+"\t | \tuser : "+user+"\n"+teams[indexUser]+" | Score : "+runs+"/"+wickets+"\n"+Player1+" : "+Striker+"\n"+Player2+" : "+nonStriker+"\nTarget : "+target+"\n"+(target-runs)+"runs to win, "+(10-wickets)+" wickets left.");
        while(true){
            System.out.println();
            comp = rnd.nextInt(7);
            try {
                System.out.print("Your turn : ");
                int user = sc.nextInt();
                if(user==comp){
                    wickets++;
                    if(ptr==0){
                        // team1score[indexOf(Player1,team1)]=Striker;
                        // myteam.put(Player1,Striker);
                        // myteam.put(Player1,Striker);
                        if(wickets<10){
                            Player1=team1[u.checkBigger(Player1, Player2,team1)+1];
                            Striker=0;

                        }
                    }
                    else{
                        // team1score[indexOf(Player2,team1)]=nonStriker;
                        // myteam.put(Player2,nonStriker);
                        // myteam.put(Player1,nonStriker);
                        if(wickets<10){
                            Player2=team1[u.checkBigger(Player1, Player2,team1)+1];
                            nonStriker=0;

                        }
                    }
                    
                }
                else if(user>6){
                    //throw new Exception();
                    System.out.println("Enter choice b/w [0,1,2,3,4,5,6].");
                    continue;
                }
                else{
                    if(ptr==0){
                        Striker=Striker+user;
                        team1score[u.indexOf(Player1,team1)]=Striker;
                    }
                    else{
                        nonStriker = nonStriker+user;
                        team1score[u.indexOf(Player2,team1)]=nonStriker;
                    }
                    if(user%2!=0){
                        changeptr();
                    }
                    runs=runs+user;
                }
                System.out.println("comp : "+comp+"\t | \tuser : "+user+"\n"+teams[indexUser]+" | Score : "+runs+"/"+wickets+"\n"+Player1+" : "+Striker+"\n"+Player2+" : "+nonStriker+"\nTarget : "+target+"\n"+(target-runs)+"runs to win, "+(10-wickets)+" wickets left.");
            } catch (Exception e) {
                System.out.println("Enter a valid choice");
                toss();
                return;
            }
            if(runs>=target && wickets!=10){

                System.out.println("1st innings(comp) :"+"Score : "+(target-1)+"/10");
                System.out.println();
                u.removePtr(team1);
                for (int i = 0; i <team2score.length; i++) {
                    System.out.println(team2[i].toString()+": "+team2score[i]);
                }
                System.out.println("\n2nd innings(user) : \nScore : "+runs+"/"+wickets);
                System.out.println();
                u.removePtr(team2);
                for (int i = 0; i <team1score.length; i++) {
                    System.out.println(team1[i].toString()+": "+team1score[i]);
                }
                System.out.println("\nYou Won by "+(10-wickets)+" wickets\n--------------------------");
                return;
            }
            else if(runs<=target && wickets==10){
                // if(ptr==0){
                //     team1score[indexOf(Player1,team1)]=Striker;                
                // }
                // else{
                //     team1score[indexOf(Player2,team1)]=nonStriker;

                // }
                // myteam.put(Player1,Striker);
                // myteam.put(Player2,nonStriker);
                System.out.println("--------------------------");
                System.out.println("1st innings(user) :"+"\nScore : "+(target-1)+"/10");
                System.out.println();
                u.removePtr(team1);
                for (int i = 0; i <team1score.length; i++) {
                    System.out.println(team1[i].toString()+": "+team1score[i]);
                }
                System.out.println("\n2nd innings(comp) : \nScore : "+runs+"/"+wickets);
                System.out.println();
                u.removePtr(team2);
                for (int i = 0; i <team2score.length; i++) {
                    System.out.println(team2[i].toString()+": "+team2score[i]);
                }
                
                System.out.println("\nOpponent won by "+(target-runs)+"runs\n--------------------------");
                return;
            }

        }
    }
    void changeptr(){
        if(ptr==1){
            ptr=0;

            if((Player1.charAt(Player1.length()-1)!='*')){
                Player1.append("*");
                if(Player2.charAt(Player2.length()-1)=='*'){
                    Player2.deleteCharAt(Player2.length()-1);
                }
            }
        }
        else if(ptr==0){
            ptr=1;
            if((Player2.charAt(Player2.length()-1)!='*')){
                Player2.append("*");
                if(Player1.charAt(Player1.length()-1)=='*'){
                    Player1.deleteCharAt(Player1.length()-1);
                }
            }
        }

    }
}
