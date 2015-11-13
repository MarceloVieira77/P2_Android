package SMS_P2;

import java.io.FileOutputStream;

import android.content.Context;
import android.util.Log;

public class Arquivos {

	private Context context;
	
	public Arquivos(Context ctx) {
		this.context = ctx;
	}
	
	public boolean writeFile(String text){
		
		try{
			FileOutputStream out = context.openFileOutput("projeto.txt", 
					Context.MODE_APPEND);
			out.write(text.getBytes());
			out.write("\n".getBytes());
			out.flush();
			out.close();
			return true;
		}catch (Exception e) {
			Log.i("ARQUIVOS", e.getMessage());
			return false;
		}
		
	}
	
}
