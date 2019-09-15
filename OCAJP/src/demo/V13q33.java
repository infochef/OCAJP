package demo;

public class V13q33 {
	int ns;
	static int s;
	V13q33 (int ns)
	{
		if (s<ns)
		{
			s=ns;
			this.ns=ns;
		}
	}
	void doPrint() {
		System.out.println("ns="+ns+"s="+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V13q33 ref1=new V13q33(50);
		V13q33 ref2=new V13q33(125);
		V13q33 ref3=new V13q33(100);
		ref1.doPrint();
		ref2.doPrint();
		ref3.doPrint();
	}

}
