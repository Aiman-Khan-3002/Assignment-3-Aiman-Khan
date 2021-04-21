package com.example.exno1;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity
{
    int ch=1;
    float font=30;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t= (TextView) findViewById(R.id.textView);
        Button b1= (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setTextSize(font);
                font = font + 5;
                if (font == 50)
                    font = 30;
            }
        });
        Button b2= (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ch) {
                    case 1:
                        t.setTextColor(Color.RED);
                        break;
                    case 2:
                        t.setTextColor(Color.GREEN);
                        break;
                    case 3:
                        t.setTextColor(Color.BLUE);
                        break;
                    case 4:
                        t.setTextColor(Color.CYAN);
                        break;
                    case 5:
                        t.setTextColor(Color.YELLOW);
                        break;
                    case 6:
                        t.setTextColor(Color.MAGENTA);
                        break;
                }
                ch++;
                if (ch == 7)
                    ch = 1;
            }
        });

        Button b3= (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ch2) {
                    case 1:
                        t.setTypeface(t.getTypeface(), Typeface.ITALIC);
                        break;
                    case 2:
                        t.setTypeface(t.getTypeface(), Typeface.BOLD_ITALIC);
                        break;
                    case 3:
                        t.setTypeface(t.getTypeface(), Typeface.BOLD);
                        break;

                }
                ch2++;
                if (ch2 == 4)
                    ch2 = 1;
            }
        });

        String currentDateTimeString = java.text.DateFormat.getDateTimeInstance().format(new Date());
        TextView tv2 = (TextView)findViewById(R.id.textView2);
        Button b4= (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(currentDateTimeString);
            }
        });

    }
}
