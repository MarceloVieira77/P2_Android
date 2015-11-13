package SMS_P2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.SMS_P2.R;

public class Tela1 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btn = (Button) findViewById(R.main.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				
				EditText edtNome = (EditText) findViewById(R.main.txtnome);
				EditText edtNumero = (EditText) findViewById(R.main.txttel);
				EditText edtMsg = (EditText) findViewById(R.main.txtmsg);
				
				String resp = edtNome.getText().toString() + ", " + 
						edtNumero.getText().toString() + ", " + 
						edtMsg.getText().toString();
				
				Toast.makeText(getApplicationContext(), resp, Toast.LENGTH_LONG)
						.show();
				
				SmsManager sms = SmsManager.getDefault();
				sms.sendTextMessage(edtNumero.getText().toString(), null, 
						resp, null, null);
				
				Toast.makeText(getApplicationContext(), "SMS ENVIADO", Toast.LENGTH_LONG)
				.show();
				
			}
		});
        
        Button btn2 = (Button) findViewById(R.main.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent intencao = new Intent(getApplicationContext(), Tela2.class);
				startActivity(intencao);
			}
		});
        
    }
}