package jsonSearch;

import java.util.Iterator;

import net.sf.json.JSONObject;

public class Demo01 {
	public static void main(String[] args) {
		//String s="{\"Gaungdong\":[\"11111\",\"22222\",\"33333\"],\"Hunan\":\"Changsha\",\"Gansu\":\"Guilin\"}";
		//String s="{Lg2:[{id:\"1\",name:\"tom\"},{id:2,name:\"jerry\"}, {id:3,name:\"herry\"}]}";
		String s="{A:[{A1:{AA2:\"a\"}},{B1:{BB2:\"b\"}}]}";
		getValue(s,"");
		/*String str="{\"A1\":{\"AA2\":\"a\"}},{\"B1\":{\"BB2\":\"b\"}}";
		JSONObject jsonObject = JSONObject.fromObject(str);
		Iterator it = jsonObject.keys();
		while(it.hasNext()){
			String key = (String) it.next();
			String value=jsonObject.getString(key);
			System.out.println(key+","+value);
		}*/
	}
	public static void getValue(String str,String k){
		JSONObject  jsonObject = JSONObject.fromObject(str);
		Iterator iterator = jsonObject.keys();
		while(iterator.hasNext()){
			String key=(String) iterator.next();
			String value=jsonObject.getString(key);
			String key2=k+"_"+key;
			System.out.println(key2+","+value);
			if(value.split(":").length>1){
				if(value.indexOf("[")==0){
					value=value.substring(1, value.length()-1);
				}
				if(value.indexOf(",")>0){
					String[] vals = value.split(",");
					for(int i=0;i<value.split(",").length;i++){
						System.out.println(vals[i]);
						getValue(vals[i],key2);
					}
				}else{
					getValue(value,key2);
				}
				//getValue(value, key2);
			}
		}
		
	}
}
