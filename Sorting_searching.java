import java.util.*;
class Sorting_searching
{
    static void bubble_sort_ascending(int ar[])
    {
        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=0;j<ar.length-1;j++)
            {
                if(ar[j+1]<ar[j])
                {
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
    }
    static void bubble_sort_descending(int ar[])
    {
        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=0;j<ar.length-1;j++)
            {
                if(ar[j+1]>ar[j])
                {
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
    }
    static void selection_sort_ascending(int ar[])
    {
        for(int i=0;i<ar.length-1;i++)
        {
            int a=ar[i];
            int pos=i;
            for(int j=i;j<ar.length;j++)
            {
                if(a>ar[j])
                {
                    a=ar[j];
                    pos=j;
                }
            }
            int temp=ar[pos];
            ar[pos]=ar[i];
            ar[i]=temp;
        }
    }
    static void selection_sort_descending(int ar[])
    {
        for(int i=0;i<ar.length-1;i++)
        {
            int a=ar[i];
            int pos=i;
            for(int j=i;j<ar.length;j++)
            {
                if(a<ar[j])
                {
                    a=ar[j];
                    pos=j;
                }
            }
            int temp=ar[pos];
            ar[pos]=ar[i];
            ar[i]=temp;
        }
    }
    static void insertion_sort_ascending(int array[]) 
    {  
        int n = array.length;  
        for (int j = 1; j < n; j++) 
        {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) 
            {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        } 
    }
    static void insertion_sort_descending(int array[]) 
    {  
        int n = array.length;  
        for (int j = 1; j < n; j++) 
        {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] < key ) ) 
            {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        } 
    }
    static int binary_search(int ar[],int key)
    {
        int f=0;
        int l=ar.length-1;
        int m=(int)((f+l)/2);
        while(f<=l)
        {
            if(ar[m]==key)
            {
                return 1;
            }
            if(key>ar[m])
            {
                f=m+1;
            }
            if(key<ar[m])
            {
                l=m-1;  
            }
            m=(int)((f+l)/2);
        }
        return 0;
    }
    static int linear_search(int ar[],int key)
    {
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==key)
            {
                return 1;
            }
        }
        return 0;
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+" element :");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+", ");
        }
        System.out.println("");
        System.out.println("Press 1 to search");
        System.out.println("Press 2 to sort");
        int choice1=sc.nextInt();
        int counter;
        switch(choice1)
        {
            case 1:
            System.out.println("Enter the number to be searched");
            int search_num=sc.nextInt();
            System.out.println("Press 1 to search using binary search");
            System.out.println("Press 2 to search using linear search");
            int choice2=sc.nextInt();            
            switch(choice2)
            {
                case 1:
                counter=binary_search(a,search_num);
                if(counter==1)
                    System.out.println("The number is present");
                else
                    System.out.println("The number is not present");
                break;
                
                case 2:
                counter=linear_search(a,search_num);
                if(counter==1)
                    System.out.println("The number is present");
                else
                    System.out.println("The number is not present");
                break;
                default: 
                System.out.println("Wrong Input, Try Again");
            }
            break;
            case 2:
            System.out.println("Press 1 to sort in Ascending order using Bubble Sort");
            System.out.println("Press 2 to sort in Desending order using Bubble Sort");
            System.out.println("Press 3 to sort in Ascending order using Selection Sort");
            System.out.println("Press 4 to sort in Desending order using Selection Sort");
            System.out.println("Press 5 to sort in Ascending order using Insertion Sort");
            System.out.println("Press 6 to sort in Desending order using Insertion Sort");
            int choice3=sc.nextInt();
            switch(choice3)
            {
                case 1:
                bubble_sort_ascending(a);
                for(int i=0;i<n;i++)
                {
                    System.out.print(a[i]+", ");
                }
                break;
                case 2:
                bubble_sort_descending(a);
                for(int i=0;i<n;i++)
                {
                    System.out.print(a[i]+", ");
                }
                break;
                case 3:
                selection_sort_ascending(a);
                for(int i=0;i<n;i++)
                {
                    System.out.print(a[i]+", ");
                }
                break;
                case 4:
                selection_sort_descending(a);
                for(int i=0;i<n;i++)
                {
                    System.out.print(a[i]+", ");
                }
                break;
                case 5:
                insertion_sort_ascending(a);
                for(int i=0;i<n;i++)
                {
                    System.out.print(a[i]+", ");
                }
                break;
                case 6:
                insertion_sort_descending(a);
                for(int i=0;i<n;i++)
                {
                    System.out.print(a[i]+", ");
                }
                break;
                default: 
                System.out.println("Wrong Input, Try Again");
            }
            break;
            default: 
            System.out.println("Wrong Input, Try Again");
        }
    }
}
        





























    
    
                    
                
                
                
                
                
                
                
                
                
                
                
                
                
                
