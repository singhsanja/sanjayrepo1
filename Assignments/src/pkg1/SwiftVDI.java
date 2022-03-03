package pkg1;

public class SwiftVDI extends Swift
{
	public void modelType()
	{System.out.println("model is vdi");
	}
	public static void main(String[] args)
	{
		SwiftVDI s=new SwiftVDI();
		s.model();
		s.modelType();
		s.baseprice();
		
	}

}
