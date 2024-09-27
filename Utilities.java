public class Utilities {

    int indexOf(StringBuffer str,StringBuffer[] team){
        int index=0;
        for(int i=0;i<team.length;i++){
            if(team[i].equals(str)){
                index=i;
                break;
            }
        }
        return index;
    }
    int checkBigger(StringBuffer player1, StringBuffer player2,StringBuffer team[]){
        int b=-1;
        if(indexOf(player1,team)>indexOf(player2,team)){
            b=indexOf(player1,team);
        }
        else{
            b=indexOf(player2,team);
        }
        return b;
    }
    void removePtr(StringBuffer team[]){
        for (int i = 0; i < team.length; i++) {
            if(team[i].charAt(team[i].length()-1)=='*'){
                team[i].deleteCharAt(team[i].length()-1);
            }
        }
    }

}
