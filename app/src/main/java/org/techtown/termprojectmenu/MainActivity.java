package org.techtown.termprojectmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // activity_main.xml 객체화

        Button btn_choice1 = findViewById(R.id.button);
        btn_choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChoiceActivity1.class); // 인텐트 생성 후, ChoiceActivity1.class로 인텐트를 넘겨준다.
                startActivity(intent); // 해당 class로 인텐트 전달 -> 해당 class에서 객체화하는 xml로 화면 전환 수행
            }
        });

        /* '지역 고르기' 버튼 클릭 이벤트 처리 */
        Button btn_choice2 = findViewById(R.id.button2); // '지역 고르기' 버튼의 id="@+id/button2" 객체화
        btn_choice2.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
            @Override
            public void onClick(View view) { // 원하는 지역을 선택할 수 있는 화면(ChoiceActivity)으로 전환되는 메소드
                Intent intent = new Intent(getApplicationContext(), ChoiceActivity2.class); // 인텐트 생성 후, ChoiceActivity2.class로 인텐트를 넘겨준다.
                startActivity(intent); // 해당 class로 인텐트 전달 -> 해당 class에서 객체화하는 xml로 화면 전환 수행
            }
        });
    }
}