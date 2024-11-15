brute force approach

import java.util.ArrayList;

class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {6, 0, 8, 1, 3};
        ArrayList<Integer> ans = nextGreaterElements(arr);  
        System.out.println(ans);  
    }

    public static ArrayList<Integer> nextGreaterElements(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        
        // Iterate through each element of the array
        for (int i = 0; i < n; i++) {
            int nextGreater = -1;  
          
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    nextGreater = arr[j];  // Update with the next greater element
                    break;  // Exit the inner loop since we found the next greater element
                }
            }
            
            result.add(nextGreater);  // Add the result (either next greater or -1)
        }
        
        return result;  // Return the result list
    }
}

optimal approach (using monotonic stack)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

class nextGreaterElement{
    public static void main(String[] args) {
        int[] arr = {6,0,8,1,3,4};
        ArrayList<Integer> result = nextGreaterElements(arr);
        Collections.reverse(result);
        
        System.out.println(result);
    }



public static ArrayList<Integer> nextGreaterElements(int[] arr){
    ArrayList<Integer> ans = new ArrayList<>();

    Stack<Integer> st = new Stack<>();
    int n = arr.length;
    for(int i = n-1; i>= 0; i--){
        while(!st.isEmpty() && st.peek() <= arr[i]){
        st.pop();
        }
        if(st.isEmpty()){
            ans.add(-1);
        }
        else{
            ans.add(st.peek());
        }
        st.push(arr[i]);
    }
    return ans;
}
    

}
