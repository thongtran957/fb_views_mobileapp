package com.dmt.xuanbach.facebook3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ánh xạ
        mTv=(TextView) findViewById(R.id.btn_sign_up);
        //gạch chân chuỗi
        String Noidung= mTv.getText().toString();                                           //Lấy chuỗi từ mTv
        SpannableString spannableString= new SpannableString(Noidung);                      //Tạo đối tượng SpannableString để biểu diễn đối tượng cần định dạng là Noidung
        spannableString.setSpan(new UnderlineSpan(),0,Noidung.length(),0);         //Thực hiện chọn kiểu trang trí gạch chân (underlineSpan) cho đối tượng có độ dài từ 0 -> độ dài xâu Noidung
        mTv.setText(spannableString);                                                       //định lại chuỗi đã chỉnh sủa vào lại chuỗi của textview
    }
}
