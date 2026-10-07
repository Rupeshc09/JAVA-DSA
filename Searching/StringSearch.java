class StringSearch{
    public static void main(String[] args) {
        String[] str={"jej","abc","jdjd"};
        for (int i = 0; i < str.length; i++) {
            if(str[i]=="abc"){
                System.err.println("found st index : "+i);
                break;
            }
        }
    }
}