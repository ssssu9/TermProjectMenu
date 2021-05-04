package org.techtown.termprojectmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ChoiceActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice2); // activity_choice2.xml 객체화

        /* '전주' 버튼 클릭 이벤트 처리 */
        Button btn_jeonju = findViewById(R.id.jeonju); // '전주' 버튼의 id="@+id/jeonju" 객체화
        btn_jeonju.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
            @Override
            public void onClick(View view) { // '전주' 지역에 관련된 구역을 선택할 수 있는 화면(RegionActivity)으로 전환되는 메소드
                Intent intent = new Intent(getApplicationContext(), RegionActivity.class); // 인텐트 생성 후, RegionActivity.class로 인텐트를 넘겨준다.
                startActivity(intent); // 해당 class로 인텐트 전달 -> 해당 class에서 객체화하는 xml로 화면 전환 수행
            }
        });

        /* '돌아가기' 버튼 클릭 이벤트 처리 */
        Button btn_start = findViewById(R.id.back_start); // '돌아가기' 버튼의 id="@+id/back_start" 객체화
        btn_start.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
            @Override
            public void onClick(View view) { // 처음 시작화면(MainActivity)으로 돌아가는 메소드
                Intent intent = new Intent(getApplicationContext(), MainActivity.class); // 인텐트 생성 후, MainActivity.class로 인텐트를 넘겨준다.
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP); // 같은 액티비티가 연달아 실행될 경우, 스택에 동일한 액티비티는 한 번만 쌓이도록 하는 플래그 설정
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // 스택에 쌓여있던 플래그 모두 삭제
                startActivity(intent); // 해당 class로 인텐트 전달 -> 해당 class에서 객체화하는 xml로 화면 전환 수행
                finish(); // 현재 class 객체 삭제
            }
        });
    }
}