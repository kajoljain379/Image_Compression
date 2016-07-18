package review.image;

import java.io.File;
import java.io.IOException;
import review.image.Catalog_define;
import java.util.ArrayList;
import java.util.Map.Entry;
import org.im4java.core.ConvertCmd;
import org.im4java.core.IM4JavaException;
import org.im4java.core.IMOperation;
import org.apache.commons.io.*;
import review.image.Folder_choose;
 
 
public class Imagemagick 
{
	
	
	
	
	
	public void make_directory1(String s) throws IOException, InterruptedException, IM4JavaException 
	{    //catalogs();
		Catalog_define catalog =new Catalog_define();
		catalog.catalogs();
	
		try{
			
			/*InputStream in = new URL(s).openStream();
			String baseName = FilenameUtils.getBaseName(s);
		    Files.copy(in, Paths.get("/home/jabong/workspace1/kajol/Image/all_image/"+baseName+"1.jpg"));
		
	*/
			String baseName = FilenameUtils.getBaseName(s);
		new File(Folder_choose.selected_folder+"/Image/Imagemagick/"+baseName).mkdir();
		 ConvertCmd cmd = new ConvertCmd();
		 for (Entry<String, ArrayList<Integer>> entry : catalog.map.entrySet()) {
		 IMOperation op = new IMOperation(); 
		
		op.addImage(Folder_choose.selected_folder+"/Image/all_image/"+baseName+".jpg");
		op.resize(entry.getValue().get(0), entry.getValue().get(1));
		op.quality((double)entry.getValue().get(2));
		
		op.addImage(Folder_choose.selected_folder+"/Image/Imagemagick/"+baseName+"/"+baseName+entry.getKey()+".jpg");  
		cmd.run(op);  
		  }
		 
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}    
		
		
		
	
}

