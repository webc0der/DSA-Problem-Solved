package com.Datastructure_Alogorithm.problems_solved;

public class ImplementaionOfStack {

	int size;
	int stackArr[];
	int top;

	ImplementaionOfStack(int size){
		this.size = size;
		this.stackArr = new int[size];
		this.top = -1;
	}

	public void push(int element) {

		if(!isFull()) {
			top++;
			stackArr[top] = element;
			System.out.println("pushed element: "+element);
		} else System.out.println("stack is full");
	}

	public void pop() {

		if(!isEmpty()) {
			System.out.println("element poped is: "+stackArr[top--]);
		} else System.out.println("stack is empty");
	}

	public void peek() {
		if(!this.isEmpty()) System.out.println("the peek item is: "+stackArr[top]);
		else System.out.println("Stack is Empty");
	}

	public boolean isFull() {
		return (size-1 == top);

	}

	public boolean isEmpty() {
		return (top == -1);

	}

	public static void main(String[] args) {
		ImplementaionOfStack implementaionOfStack = new ImplementaionOfStack(10);

		implementaionOfStack.pop();
		System.out.println("=================");
		implementaionOfStack.push(10);
		implementaionOfStack.push(30);
		implementaionOfStack.push(50);
		implementaionOfStack.push(40);
		implementaionOfStack.push(20);
		implementaionOfStack.push(60);
		implementaionOfStack.push(70);
		implementaionOfStack.push(80);
		implementaionOfStack.push(90);
		implementaionOfStack.push(100);
		implementaionOfStack.push(120);
		System.out.println("=================");
		implementaionOfStack.pop();
		implementaionOfStack.pop();
		implementaionOfStack.pop();
		implementaionOfStack.pop();
		implementaionOfStack.pop();
		implementaionOfStack.pop();
		implementaionOfStack.pop();
		implementaionOfStack.pop();
		implementaionOfStack.pop();
		implementaionOfStack.pop();
		implementaionOfStack.pop();
		System.out.println("=================");
	}
}
