package StepDefinitionFiles;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class testk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Map<Integer,String> m=new HashMap<Integer,String>();
		
		m.put(1, "value 1");
		m.put(2, "value 2");
		m.put(3, "vakue 3");
		
		
		
		for(Map.Entry<Integer,String> j:m.entrySet())
		{
			if(j.getKey()==2)
			{
			
				System.out.println(m.get(2));
			}
			
		}
				
				for(int k:m.keySet())
				{
					
					if(k==2)
					{
						
						System.out.println(m.get(1));
					}
				}
				
				
				
				
				
				
				
				
				
			
			
		
	}
	}


