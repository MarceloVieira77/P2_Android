package SMS_P2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.SMS_P2.R;

public class Tela2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela2);
		
		
		Button btn1 = (Button) findViewById(R.tela2.btn);
		btn1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				
				EditText edtMsg = (EditText) findViewById(R.tela2.txtmsg);
				Arquivos arq = new Arquivos(getApplicationContext());
				arq.writeFile(edtMsg.getText().toString());
				
				Toast.makeText(getApplicationContext(), "Arquivo Gerado", 
						Toast.LENGTH_LONG).show();
				
			}
		});
		
		Button btn2 = (Button) findViewById(R.tela2.btn2);
		btn2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				finish();
			}
		});
		
	}
	
}
