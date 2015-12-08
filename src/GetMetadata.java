import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;

public class GetMetadata {
	
   @SuppressWarnings("deprecation")
public static void main(final String[] args) throws IOException, TikaException {
	
      //Assume that boy.jpg is in your current directory
      File file = new File("data/madhavi2015.docx");

     /* //Parser method parameters
      Parser parser = new AutoDetectParser();
      BodyContentHandler handler = new BodyContentHandler();
     
      FileInputStream inputstream = new FileInputStream(file);
      ParseContext context = new ParseContext();

      System.out.println("content "+ handler.toString());
      //System.out.println(context.toString());

      //getting the list of all meta data elements 
      
*/
      
         
         Tika tikanew = new Tika();
         Metadata metadata = new Metadata();
         String str = tikanew.parseToString(new FileInputStream(new File("data/madhavi2015.docx")), metadata);
         System.out.println(str);
         String[] metadataNames = metadata.names();
         for(String name : metadataNames) {		        
             System.out.println(name + ": " + metadata.get(name));
      }
   }
}