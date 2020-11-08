package Problem1;

public class BinarySearch {
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target) {
        return binaryHelper(data,0,data.length-1,target);
    }

    public static int binaryHelper(int [] data,int start,int end, int target){
        if(start>end){
            return -1;
        }

        int mid= start+(end-start)/2;

        if(target== data[mid]){
            return mid;
        }

        else if(target<data[mid]){
            return binaryHelper(data,start,mid-1,target);
        }

        else{
            return binaryHelper(data,mid+1,end,target);
        }
    }
}
