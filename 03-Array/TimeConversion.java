class TimeConversion{
    public static void main(String[] args){
        String[] timec="2:30".split(":");
        int hoursc=Integer.parseInt(timec[0]);
        int minc=Integer.parseInt(timec[1]);

        String[] time="4:40".split(":");
        int hours=Integer.parseInt(time[0]);
        int min=Integer.parseInt(time[1]);
        
        int count=0;
        count=hours-hoursc;
        int rem=Math.abs(min-minc);
        
            if(rem>14){
            count+=rem/15;
            rem%=15;
            }
            if(rem>4){
             count+=(rem/5);
             rem%=5;
            }
             count+=rem;
             System.err.println(count);
    
    }
}