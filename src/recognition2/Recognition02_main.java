package recognition2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

import com.ibm.watson.developer_cloud.service.security.IamOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.ClassifiedImages;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.ClassifyOptions;





public class Recognition02_main {
	public static void main(String[] args) {
		
		Recognition2_lib rlib = new Recognition2_lib();
		String file = "img/1899.jpg";
		rlib.hime(file);
		rlib.beef(file);
	}
}