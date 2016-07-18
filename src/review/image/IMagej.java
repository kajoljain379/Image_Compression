package review.image;


import ij.*;
import ij.process.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.io.File;
import review.image.Catalog_define;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map.Entry;
import org.apache.commons.io.*;
import review.image.Folder_choose;


public class IMagej {
	public void make_directory(String s) throws IOException, InterruptedException
	{    
		Catalog_define catalog =new Catalog_define();
		catalog.catalogs();
	
		try{
			
			String baseName = FilenameUtils.getBaseName(s);
		new File(Folder_choose.selected_folder+"/Image/imagej/"+baseName).mkdir();
		
		 for (Entry<String, ArrayList<Integer>> entry : catalog.map.entrySet()) {
			 ImagePlus imp = IJ.openImage(Folder_choose.selected_folder+"/Image/all_image/"+baseName+".jpg");
			 ImageProcessor ip = imp.getProcessor();
			 ip.setInterpolationMethod(ImageProcessor.BILINEAR);
			 
			 ip = ip.resize(entry.getValue().get(0), entry.getValue().get(1));
			 BufferedImage croppedImage = ip.getBufferedImage();
			 ImageIO.write(croppedImage, "jpg", new File(Folder_choose.selected_folder+"/Image/imagej/"+baseName+"/"+baseName+entry.getKey()+".jpg"));
		
			 
	    }
	}
		catch(Exception e)
		{
			
		}
	}
}
