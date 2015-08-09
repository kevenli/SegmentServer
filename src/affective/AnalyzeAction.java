package affective;
import java.io.File;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.gta.affective.Segment;

public class AnalyzeAction {
	private String text;
	private float result;
	
	private static Segment segment = new Segment();
	
	public String execute() throws Exception {
        System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));  
        
        System.out.println(Segment.class.getClassLoader().getResource(""));  
  
        System.out.println(ClassLoader.getSystemResource(""));  
        System.out.println(AnalyzeAction.class.getResource(""));  
        System.out.println(AnalyzeAction.class.getResource("/"));
        //Class文件所在路径
        System.out.println(new File("/").getAbsolutePath());  
        System.out.println(System.getProperty("user.dir"));  
        
		result = segment.analysis(text);
		JSONObject jsonObject=new JSONObject();
        jsonObject.accumulate("status", "ok");
        jsonObject.accumulate("data", result);
		ServletActionContext.getRequest().setAttribute("data", jsonObject.toString());
		return "success";
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
