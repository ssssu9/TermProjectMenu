package org.techtown.termprojectmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RegionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region); // activity_region.xml 객체화

        /* '전주 시내(객사)' 버튼 클릭 이벤트 처리 */
        Button button = findViewById(R.id.button); // '전주 시내(객사)' 버튼의 id="@+id/button" 객체화
        button.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
            @Override
            public void onClick(View view) { // '전주 시내(객사)'에 관련된 음식 및 음식점을 보여주는 화면(GaeksaActivity)으로 전환하는 메소드
                Intent intent = new Intent(getApplicationContext(), GaeksaActivity.class); // 인텐트 생성 후, GaeksaActivity.class로 인텐트를 넘겨준다.
                startActivity(intent); // 해당 class로 인텐트 전달 -> 해당 class에서 객체화하는 xml로 화면 전환 수행
            }
        });

        /* '전북대 대학로' 버튼 클릭 이벤트 처리 */
        Button button2 = findViewById(R.id.button2); // '전북대 대학로' 버튼의 id="@+id/button2" 객체화
        button2.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
            @Override
            public void onClick(View view) { // '전북대 대학로'에 관련된 음식 및 음식점을 보여주는 화면(JbnuActivity)으로 전환하는 메소드
                Intent intent = new Intent(getApplicationContext(), JbnuActivity.class); // 인텐트 생성 후, JbnuActivity.class로 인텐트를 넘겨준다.
                startActivity(intent); // 해당 class로 인텐트 전달 -> 해당 class에서 객체화하는 xml로 화면 전환 수행
            }
        });

        /* '신시가지' 버튼 클릭 이벤트 처리 */
        Button button3 = findViewById(R.id.button3); // '신시가지' 버튼의 id="@+id/button3" 객체화
        button3.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
            @Override
            public void onClick(View view) { // '신시가지'에 관련된 음식 및 음식점을 보여주는 화면(SinsiActivity)으로 전환하는 메소드
                Intent intent = new Intent(getApplicationContext(), SinsiActivity.class); // 인텐트 생성 후, SinsiActivity.class로 인텐트를 넘겨준다.
                startActivity(intent); // 해당 class로 인텐트 전달 -> 해당 class에서 객체화하는 xml로 화면 전환 수행
            }
        });

        /* '그 외' 버튼 클릭 이벤트 처리 */
        Button button4 = findViewById(R.id.button4); // '그 외' 버튼의 id="@+id/button4" 객체화
        button4.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
            @Override
            public void onClick(View view) { // 그 외 지역에 관련된 음식 및 음식점을 보여주는 화면(EtcActivity)으로 전환하는 메소드
                Intent intent = new Intent(getApplicationContext(), EtcActivity.class); // 인텐트 생성 후, EtcActivity.class로 인텐트를 넘겨준다.
                startActivity(intent); // 해당 class로 인텐트 전달 -> 해당 class에서 객체화하는 xml로 화면 전환 수행
            }
        });
    }
}