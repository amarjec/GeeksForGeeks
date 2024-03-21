class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	     ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList<Node> queue=new ArrayList<Node>();
        boolean zigzag=false;
        queue.add(root);
        int size=queue.size();
        while(size!=0)
        {
            
            if(!zigzag)
            {
                for(int i=0;i<size;i++)
                {
                    arr.add(queue.get(i).data);
                }
                for(int i=0;i<size;i++)
                {
                    if(queue.get(0).left!=null)
                        queue.add(queue.get(0).left);
                    if(queue.get(0).right!=null)
                        queue.add(queue.get(0).right);
                    queue.remove(0);
                }
                zigzag=true;
            }
            else
            {
                for(int i=size-1;i>=0;i--)
                {
                    arr.add(queue.get(i).data);
                }
                for(int i=0;i<size;i++)
                {
                    if(queue.get(0).left!=null)
                        queue.add(queue.get(0).left);
                    if(queue.get(0).right!=null)
                        queue.add(queue.get(0).right);
                    queue.remove(0);
                }
                zigzag=false;
            }
            size=queue.size();
        }
        return arr;
	}
}
