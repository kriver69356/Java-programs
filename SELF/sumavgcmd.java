class sumavgcmd
{
    public static void main(String[] args) {
        int i;
        double avg=1, sum=0;
        double a[]={45,25,48,74};
        double n=a.length;
        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Addition= "+sum);
        avg=sum/n;
        System.out.println("Average= "+avg);
    }
}