public class Day2{
    //Max sum subarray using prefix
    public static void maxSubArraySum(int arr[]){
        int currsum=0;
        int largest=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=arr[i]+prefix[i-1];
    
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(prefix[i]);
        // }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum=0;
                currsum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(largest<currsum){
                    largest=currsum;
                }
            }
        }
        System.out.println("Largest SubArray is: "+largest);
    }
    //kadanes Algorithm
    public static void kadanes(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currsum=currsum+arr[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum=Math.max(maxsum,currsum);
        }
        System.out.println(maxsum);
    }
    //Trapped Rainwater
    public static int trappedRainWater(int height[]){
        int trappedWater=0;
        int n=height.length;
        //Calculate the left max Boundary
        int leftMaxBound[]=new int[n];
        leftMaxBound[0]=height[0];
        for(int i=1;i<n;i++){
            leftMaxBound[i]=Math.max(height[i],leftMaxBound[i-1]);
        }
        //Calculate the right max boundary
        int rightMaxBound[]=new int[n];
        rightMaxBound[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightMaxBound[i]=Math.max(height[i],rightMaxBound[i+1]);
        }
        //loop
        for(int i=0;i<n;i++){
            //calculate the waterLevel
            int waterLevel=Math.min(leftMaxBound[i],rightMaxBound[i]);
            //calculate the trapped water
             trappedWater+=waterLevel-height[i];
        }
        return trappedWater;

    }
    //buy and sell stocks
    public static int buyAndSellStocks(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;
             maxProfit=Math.max(maxProfit,profit);
            }else{
             buyprice=prices[i];   
            }
        }
        return maxProfit;
    }
    public static  void main(String [] args){
        int arr[]={2,4,6,8,10};
        int height[]={4,2,0,6,3,2,5};
        int prices[]={7,1,5,3,9,4};
        // maxSubArraySum(arr);
        // kadanes(arr);
        //System.out.println(trappedRainWater(height));
        System.out.println(buyAndSellStocks(prices));


    }
}