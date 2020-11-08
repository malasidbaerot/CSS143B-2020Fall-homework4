package Problem1;

import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack <Integer> stack){
        if(stack.isEmpty())
        {
            return;
        }

        int temp=stack.pop();
        reverseStack(stack);
        insertB(stack,temp);

    }

    public static void insertB(Stack <Integer> stack, int element){
        if(stack.isEmpty()){
            stack.push(element);
            return;
        }
        int top=stack.pop();
        insertB(stack,element);
        stack.push(top);
    }
}