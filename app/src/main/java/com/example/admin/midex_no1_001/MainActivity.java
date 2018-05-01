package com.example.admin.midex_no1_001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int num1; //宣告一個整數變數num1，用來當產生亂數的值
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //使用亂數取得獎項
        num1 = (int)(Math.random()*4) +1; //1~4亂數取得數字
        //找到btn_ok元件，指定給btn
        Button btn = (Button) findViewById(R.id.btn_ok);
        //註冊Button的傾聽者物件
        btn.setOnClickListener(Get_Award);
    }
    //建立OnClick傾聽者物件
    View.OnClickListener Get_Award = new View.OnClickListener(){
        public void onClick(View v){
            TextView output = (TextView) findViewById(R.id.txv_awardResult); //找到txv_awardResult元件，指定給output
            EditText edtaward1 = (EditText) findViewById(R.id.edt_award1); //找到edt_award1元件，指定給edtaward1
            EditText edtaward2 = (EditText) findViewById(R.id.edt_award2); //找到edt_award2元件，指定給edtaward2
            EditText edtaward3 = (EditText) findViewById(R.id.edt_award3); //找到edt_award3元件，指定給edtaward3
            EditText edtaward4 = (EditText) findViewById(R.id.edt_award4); //找到edt_award4元件，指定給edtaward4

            switch (num1){
                case 1 :
                    output.setText("恭喜您獲得:"+edtaward1.getText().toString()); //亂數取得1時，TextView顯示獲得獎品一
                    break;
                case 2 :
                    output.setText("恭喜您獲得:"+edtaward2.getText().toString()); //亂數取得2時，TextView顯示獲得獎品二
                    break;
                case 3 :
                    output.setText("恭喜您獲得:"+edtaward3.getText().toString()); //亂數取得3時，TextView顯示獲得獎品三
                    break;
                case 4 :
                    output.setText("恭喜您獲得:"+edtaward4.getText().toString()); //亂數取得4時，TextView顯示獲得獎品四
                    break;
            }
        }
    };
}
