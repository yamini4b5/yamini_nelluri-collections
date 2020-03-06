package epam.collections;
import java.util.*;
public class CustomArrayList {
	
	public  Object customarraylist[];
	 int index = 0;
	public CustomArrayList() {
		customarraylist=new Object[10];
	}
	public Object fetching(int ind) {
	if(ind <index) {
	return customarraylist[ind];
	}
	else {
	throw new ArrayIndexOutOfBoundsException();
	}
	}
	public void adding(Object obj) {
	if(customarraylist.length-index<=6)
	resize();
	customarraylist[index++]=obj;
	}
	public int size() {
	return index;
	}
	private void resize() {
	customarraylist=Arrays.copyOf(customarraylist,customarraylist.length*2);
	}
	public String toString() {
	String s="[";
	for(int i=0;i<index-1;i++) {
	s+=customarraylist[i]+",";
	}
	s+=customarraylist[index-1]+"]";
	return s;
	}
	 public Object remove(int ind){
	       if(ind < index){
	           Object obj = customarraylist[ind];
	           customarraylist[ind] = null;
	           int tmp = ind;
	           while(tmp < ind){
	        	   customarraylist[tmp] = customarraylist[tmp+1];
	        	   customarraylist[tmp+1] = null;
	               tmp++;
	           }
	           index--;
	           return obj;
	       } else {
	           throw new ArrayIndexOutOfBoundsException();
	       }
	

}
}