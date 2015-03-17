package systemsoul;

import java.io.File;
import java.util.Calendar;

public class Soul {

    public Soul() {
    }
    
    
      public String toStringDatas(){
        long maxMemory = Runtime.getRuntime().maxMemory();
        
        return "Available processors (cores): " + 
        Runtime.getRuntime().availableProcessors() +"\n"+"Free memory (bytes):" + 
        Runtime.getRuntime().freeMemory()+"\n"+"Maximum memory (bytes):"+(maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory)+"\n"+
                "Total memory available to JVM (bytes): " + 
        Runtime.getRuntime().totalMemory()+"\n" ;
    }
    
    public void SystemDataUse(){
        
         
    System.out.println("Available processors (cores): " + 
        Runtime.getRuntime().availableProcessors());

    System.out.println("Free memory (bytes): " + 
        Runtime.getRuntime().freeMemory());

    long maxMemory = Runtime.getRuntime().maxMemory();
 
    System.out.println("Maximum memory (bytes): " + 
        (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));

 
    System.out.println("Total memory available to JVM (bytes): " + 
        Runtime.getRuntime().totalMemory());

    File[] roots = File.listRoots();

    for (File root : roots) {
      System.out.println("File system root: " + root.getAbsolutePath());
      System.out.println("Total space (bytes): " + root.getTotalSpace());
      System.out.println("Free space (bytes): " + root.getFreeSpace());
      System.out.println("Usable space (bytes): " + root.getUsableSpace());
    }
  }
    
   
}
    

