package com.example.onlinearlayout;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView mTvResult;
    EditText mEdtNumber1, mEdtNumber2;
    Button mBtAdd, mBtSubtract, mBtMulti, mBtDivi, mBtReset;
    String mTextNumber1, mTextNumber2;
    float mNumber1, mNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ánh xạ
        mTvResult=findViewById(R.id.tvResult);
        mEdtNumber1=findViewById(R.id.edtEnterNumber1);
        mEdtNumber2=findViewById(R.id.edtEnterNumber2);
        mBtAdd=findViewById(R.id.btAdd);
        mBtSubtract=findViewById(R.id.btSubtract);
        mBtMulti=findViewById(R.id.btMulti);
        mBtDivi=findViewById(R.id.btDivi);
        mBtReset=findViewById(R.id.btReset);

        //button cộng
        mBtAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //khi nhấn button cộng thì không có quyền nhấn button khác cho đến khi thực hiện lại phép tính khác
                mTextNumber1=mEdtNumber1.getText().toString();
                mTextNumber2=mEdtNumber2.getText().toString();

                //kiểm tra xem người dùng đã nhập đủ dữ liệu chưa
                if (mTextNumber1.isEmpty() || mTextNumber2.isEmpty() ){
                    Toast.makeText(MainActivity.this, "PHẢI NHẬP ĐỦ 2 SỐ!", Toast.LENGTH_SHORT).show();
                    return;
                }

                mNumber1=Float.parseFloat(mTextNumber1);
                mNumber2=Float.parseFloat(mTextNumber2);

                mBtDivi.setEnabled(false);
                mBtMulti.setEnabled(false);
                mBtSubtract.setEnabled(false);

                mTvResult.setText(String.valueOf(mNumber1+mNumber2));
            }
        });

        //button trừ
        mBtSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBtAdd.setEnabled(false);
                mBtMulti.setEnabled(false);
                mBtDivi.setEnabled(false);

                //khi nhấn button cộng thì không có quyền nhấn button khác cho đến khi thực hiện lại phép tính khác
                mTextNumber1=mEdtNumber1.getText().toString();
                mTextNumber2=mEdtNumber2.getText().toString();

                //kiểm tra xem người dùng đã nhập đủ dữ liệu chưa
                if (mTextNumber1.isEmpty() || mTextNumber2.isEmpty() ){
                    Toast.makeText(MainActivity.this, "PHẢI NHẬP ĐỦ 2 SỐ!", Toast.LENGTH_SHORT).show();
                    return;
                }

                mNumber1=Float.parseFloat(mTextNumber1);
                mNumber2=Float.parseFloat(mTextNumber2);

                mTvResult.setText(String.valueOf(mNumber1-mNumber2));
            }
        });

        //button nhân
        mBtMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBtAdd.setEnabled(false);
                mBtSubtract.setEnabled(false);
                mBtDivi.setEnabled(false);

                //khi nhấn button cộng thì không có quyền nhấn button khác cho đến khi thực hiện lại phép tính khác
                mTextNumber1=mEdtNumber1.getText().toString();
                mTextNumber2=mEdtNumber2.getText().toString();

                //kiểm tra xem người dùng đã nhập đủ dữ liệu chưa
                if (mTextNumber1.isEmpty() || mTextNumber2.isEmpty() ){
                    Toast.makeText(MainActivity.this, "PHẢI NHẬP ĐỦ 2 SỐ!", Toast.LENGTH_SHORT).show();
                    return;
                }

                mNumber1=Float.parseFloat(mTextNumber1);
                mNumber2=Float.parseFloat(mTextNumber2);

                mTvResult.setText(String.valueOf(mNumber1*mNumber2));
            }
        });

        //button chia
        mBtDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBtAdd.setEnabled(false);
                mBtMulti.setEnabled(false);
                mBtSubtract.setEnabled(false);

                //khi nhấn button cộng thì không có quyền nhấn button khác cho đến khi thực hiện lại phép tính khác
                mTextNumber1=mEdtNumber1.getText().toString();
                mTextNumber2=mEdtNumber2.getText().toString();

                //kiểm tra xem người dùng đã nhập đủ dữ liệu chưa
                if (mTextNumber1.isEmpty() || mTextNumber2.isEmpty() ){
                    Toast.makeText(MainActivity.this, "PHẢI NHẬP ĐỦ 2 SỐ!", Toast.LENGTH_SHORT).show();
                    return;
                }

                mNumber1=Float.parseFloat(mTextNumber1);
                mNumber2=Float.parseFloat(mTextNumber2);

                if (mNumber2==0){
                    Toast.makeText(MainActivity.this, "Số thứ 2 phải khác 0 để chia", Toast.LENGTH_LONG).show();
                }else {
                    mTvResult.setText(String.valueOf(mNumber1/mNumber2));
                }

            }
        });

        //button Reset
        mBtReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // sự kiện click của các button được mở lại
                mBtAdd.setEnabled(true);
                mBtSubtract.setEnabled(true);
                mBtMulti.setEnabled(true);
                mBtDivi.setEnabled(true);
            }
        });
    }


}

