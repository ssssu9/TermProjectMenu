package org.techtown.termprojectmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.google.android.material.tabs.TabLayout;

public class JbnuActivity extends AppCompatActivity {

    Toolbar toolbar; // 선택한 구역 이름을 보여줄 Toolbar 선언

    // 한식 탭에 들어갈 프래그먼트 선언
    Jbnu_hansik1 fragment_jbnu_hansik1;
    Jbnu_hansik2 fragment_jbnu_hansik2;
    Jbnu_hansik3 fragment_jbnu_hansik3;
    Jbnu_hansik4 fragment_jbnu_hansik4;
    Jbnu_hansik5 fragment_jbnu_hansik5;
    Jbnu_hansik6 fragment_jbnu_hansik6;
    Jbnu_hansik7 fragment_jbnu_hansik7;

    // 분식 탭에 들어갈 프래그먼트 선언
    Jbnu_bunsik1 fragment_jbnu_bunsik1;
    Jbnu_bunsik2 fragment_jbnu_bunsik2;
    Jbnu_bunsik3 fragment_jbnu_bunsik3;
    Jbnu_bunsik4 fragment_jbnu_bunsik4;
    Jbnu_bunsik5 fragment_jbnu_bunsik5;
    Jbnu_bunsik6 fragment_jbnu_bunsik6;

    // 일식 탭에 들어갈 프래그먼트 선언
    Jbnu_ilsik1 fragment_jbnu_ilsik1;
    Jbnu_ilsik2 fragment_jbnu_ilsik2;
    Jbnu_ilsik3 fragment_jbnu_ilsik3;
    Jbnu_ilsik4 fragment_jbnu_ilsik4;
    Jbnu_ilsik5 fragment_jbnu_ilsik5;
    Jbnu_ilsik6 fragment_jbnu_ilsik6;

    // 중식 탭에 들어갈 프래그먼트 선언
    Jbnu_joongsik1 fragment_jbnu_joongsik1;
    Jbnu_joongsik2 fragment_jbnu_joongsik2;
    Jbnu_joongsik3 fragment_jbnu_joongsik3;
    Jbnu_joongsik4 fragment_jbnu_joongsik4;

    // 양식 탭에 들어갈 프래그먼트 선언
    Jbnu_yangsik1 fragment_jbnu_yangsik1;
    Jbnu_yangsik2 fragment_jbnu_yangsik2;
    Jbnu_yangsik3 fragment_jbnu_yangsik3;
    Jbnu_yangsik4 fragment_jbnu_yangsik4;

    // 야식 탭에 들어갈 프래그먼트 선언
    Jbnu_yasik1 fragment_jbnu_yasik1;
    Jbnu_yasik2 fragment_jbnu_yasik2;
    Jbnu_yasik3 fragment_jbnu_yasik3;
    Jbnu_yasik4 fragment_jbnu_yasik4;

    // 패스트푸드 탭에 들어갈 프래그먼트 선언
    Jbnu_fastfood1 fragment_jbnu_fastfood1;
    Jbnu_fastfood2 fragment_jbnu_fastfood2;
    Jbnu_fastfood3 fragment_jbnu_fastfood3;
    Jbnu_fastfood4 fragment_jbnu_fastfood4;
    Jbnu_fastfood5 fragment_jbnu_fastfood5;

    Fragment selected = null; // 선택된 프래그먼트를 나타내는 변수 선언

    TextView titleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeonju); // activity_jeonju.xml 객체화

        titleText = findViewById(R.id.titleText);
        titleText.setText("전북대 대학로");
        toolbar = findViewById(R.id.toolbar_jeonju); // Toolbar 객체화
        setSupportActionBar(toolbar); // 객체화한 Toolbar를 화면에 보여주는 메소드

        // 한식 프래그먼트 생성
        fragment_jbnu_hansik1 = new Jbnu_hansik1();
        fragment_jbnu_hansik2 = new Jbnu_hansik2();
        fragment_jbnu_hansik3 = new Jbnu_hansik3();
        fragment_jbnu_hansik4 = new Jbnu_hansik4();
        fragment_jbnu_hansik5 = new Jbnu_hansik5();
        fragment_jbnu_hansik6 = new Jbnu_hansik6();
        fragment_jbnu_hansik7 = new Jbnu_hansik7();

        // 분식 프래그먼트 생성
        fragment_jbnu_bunsik1 = new Jbnu_bunsik1();
        fragment_jbnu_bunsik2 = new Jbnu_bunsik2();
        fragment_jbnu_bunsik3 = new Jbnu_bunsik3();
        fragment_jbnu_bunsik4 = new Jbnu_bunsik4();
        fragment_jbnu_bunsik5 = new Jbnu_bunsik5();
        fragment_jbnu_bunsik6 = new Jbnu_bunsik6();

        // 일식 프래그먼트 생성
        fragment_jbnu_ilsik1 = new Jbnu_ilsik1();
        fragment_jbnu_ilsik2 = new Jbnu_ilsik2();
        fragment_jbnu_ilsik3 = new Jbnu_ilsik3();
        fragment_jbnu_ilsik4 = new Jbnu_ilsik4();
        fragment_jbnu_ilsik5 = new Jbnu_ilsik5();
        fragment_jbnu_ilsik6 = new Jbnu_ilsik6();

        // 중식 프래그먼트 생성
        fragment_jbnu_joongsik1 = new Jbnu_joongsik1();
        fragment_jbnu_joongsik2 = new Jbnu_joongsik2();
        fragment_jbnu_joongsik3 = new Jbnu_joongsik3();
        fragment_jbnu_joongsik4 = new Jbnu_joongsik4();

        // 양식 프래그먼트 생성
        fragment_jbnu_yangsik1 = new Jbnu_yangsik1();
        fragment_jbnu_yangsik2 = new Jbnu_yangsik2();
        fragment_jbnu_yangsik3 = new Jbnu_yangsik3();
        fragment_jbnu_yangsik4 = new Jbnu_yangsik4();

        // 야식 프래그먼트 생성
        fragment_jbnu_yasik1 = new Jbnu_yasik1();
        fragment_jbnu_yasik2 = new Jbnu_yasik2();
        fragment_jbnu_yasik3 = new Jbnu_yasik3();
        fragment_jbnu_yasik4 = new Jbnu_yasik4();

        // 패스트푸드 프래그먼트 생성
        fragment_jbnu_fastfood1 = new Jbnu_fastfood1();
        fragment_jbnu_fastfood2 = new Jbnu_fastfood2();
        fragment_jbnu_fastfood3 = new Jbnu_fastfood3();
        fragment_jbnu_fastfood4 = new Jbnu_fastfood4();
        fragment_jbnu_fastfood5 = new Jbnu_fastfood5();

        // 각 탭에 들어갈 프래그먼트를 Fragment 자료형 배열로 구분한 후, final로 선언하여 배열의 내용이 변경되지 않도록 한다.
        final Fragment[] hansik = {fragment_jbnu_hansik1, fragment_jbnu_hansik2, fragment_jbnu_hansik3, fragment_jbnu_hansik4, fragment_jbnu_hansik5, fragment_jbnu_hansik6, fragment_jbnu_hansik7};
        final Fragment[] bunsik = {fragment_jbnu_bunsik1, fragment_jbnu_bunsik2, fragment_jbnu_bunsik3, fragment_jbnu_bunsik4, fragment_jbnu_bunsik5, fragment_jbnu_bunsik6};
        final Fragment[] ilsik = {fragment_jbnu_ilsik1, fragment_jbnu_ilsik2, fragment_jbnu_ilsik3, fragment_jbnu_ilsik4, fragment_jbnu_ilsik5, fragment_jbnu_ilsik6};
        final Fragment[] joogsik = {fragment_jbnu_joongsik1, fragment_jbnu_joongsik2, fragment_jbnu_joongsik3, fragment_jbnu_joongsik4};
        final Fragment[] yangsik = {fragment_jbnu_yangsik1, fragment_jbnu_yangsik2, fragment_jbnu_yangsik3, fragment_jbnu_yangsik4};
        final Fragment[] yasik = {fragment_jbnu_yasik1, fragment_jbnu_yasik2, fragment_jbnu_yasik3, fragment_jbnu_yasik4};
        final Fragment[] fastfood = {fragment_jbnu_fastfood1, fragment_jbnu_fastfood2, fragment_jbnu_fastfood3, fragment_jbnu_fastfood4, fragment_jbnu_fastfood5};

        TabLayout tabs = findViewById(R.id.tabs); // 상단탭을 만들기 위한 탭 객체화
        // 상단탭에 7가지 음식 분야 추가
        tabs.addTab(tabs.newTab().setText("한식"));
        tabs.addTab(tabs.newTab().setText("분식"));
        tabs.addTab(tabs.newTab().setText("일식"));
        tabs.addTab(tabs.newTab().setText("중식"));
        tabs.addTab(tabs.newTab().setText("양식"));
        tabs.addTab(tabs.newTab().setText("야식"));
        tabs.addTab(tabs.newTab().setText("패스트푸드"));

        getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_jbnu_hansik1).commit(); // activity_jeonju.xml이 보여졌을 때 처음 프레임 레이아웃에 보여지는 프래그먼트 설정
        /* '다음' 버튼 클릭 이벤트 처리 -> 탭이 선택된 것이 아닌 처음 보여지는 화면에서의 동작 처리 */
        Button btn_next = findViewById(R.id.next); // '다음' 버튼의 id="@+id/next" 객체화
        btn_next.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
            int cnt = 0; // 버튼이 눌린 횟수 카운트
            @Override
            public void onClick(View view) { // 프래그먼트 전환 메소드, 카운트 값에 따라 배열 안의 프래그먼트 순환
                cnt++; // 버튼이 눌릴 때마다 카운트 1씩 증가 -> 카운트 값에 따라 배열 안의 프래그먼트 순서대로 보여지는 역할

                if (cnt == 7) { // 배열 안의 프래그먼트가 끝났을 경우
                    cnt = 0; // 카운트를 0으로 초기화
                    selected = hansik[cnt]; // 배열의 맨 처음 프래그먼트를 선택하여 다시 처음으로 돌아간다.
                } else { // 배열 안의 프래그먼트가 존재할 경우
                    selected = hansik[cnt]; // 해당 번호에 맞는 프래그먼트 선택
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, selected).commit(); // if문을 통해 선택된 프래그먼트를 프레임 레이아웃에 중첩시켜 보여준다.
            }
        });

        /* '결정' 버튼 클릭 이벤트 처리 */
        Button btn_ok = findViewById(R.id.ok); // '결정' 버튼의 id="@+id/ok" 객체화
        btn_ok.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
            @Override
            public void onClick(View view) { // 해당 메뉴를 결정했을 경우, 결정을 완료했다는 메세지를 출력하는 화면(SelectedActivity)으로 전환하는 메소드
                Intent intent = new Intent(getApplicationContext(), SelectedActivity.class); // 인텐트 생성 후, SelectedActivity.class로 인텐트를 넘겨준다.
                startActivity(intent); // 해당 class로 인텐트 전달 -> 해당 class에서 객체화하는 xml로 화면 전환 수행
                finish(); // 현재 class 객체 삭제
            }
        });

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                if (position == 0) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_jbnu_hansik1).commit();

                    /* '다음' 버튼 클릭 이벤트 처리 */
                    Button btn_next = findViewById(R.id.next); // '다음' 버튼의 id="@+id/next" 객체화
                    btn_next.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
                        int cnt = 0; // 버튼이 눌린 횟수 카운트
                        @Override
                        public void onClick(View view) { // 프래그먼트 전환 메소드, 카운트 값에 따라 배열 안의 프래그먼트 순환
                            cnt++; // 버튼이 눌릴 때마다 카운트 1씩 증가 -> 카운트 값에 따라 배열 안의 프래그먼트 순서대로 보여지는 역할

                            if (cnt == 7) { // 배열 안의 프래그먼트가 끝났을 경우
                                cnt = 0; // 카운트를 0으로 초기화
                                selected = hansik[cnt]; // 배열의 맨 처음 프래그먼트를 선택하여 다시 처음으로 돌아간다.
                            } else { // 배열 안의 프래그먼트가 존재할 경우
                                selected = hansik[cnt]; // 해당 번호에 맞는 프래그먼트 선택
                            }

                            getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, selected).commit(); // if문을 통해 선택된 프래그먼트를 프레임 레이아웃에 중첩시켜 보여준다.
                        }
                    });

                    /* '결정' 버튼 클릭 이벤트 처리 */
                    Button btn_ok = findViewById(R.id.ok); // '결정' 버튼의 id="@+id/ok" 객체화
                    btn_ok.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
                        @Override
                        public void onClick(View view) { // 해당 메뉴를 결정했을 경우, 결정을 완료했다는 메세지를 출력하는 화면(SelectedActivity)으로 전환하는 메소드
                            Intent intent = new Intent(getApplicationContext(), SelectedActivity.class); // 인텐트 생성 후, SelectedActivity.class로 인텐트를 넘겨준다.
                            startActivity(intent); // 해당 class로 인텐트 전달 -> 해당 class에서 객체화하는 xml로 화면 전환 수행
                            finish(); // 현재 class 객체 삭제
                        }
                    });
                }

                else if (position == 1) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_jbnu_bunsik1).commit();

                    /* '다음' 버튼 클릭 이벤트 처리 */
                    Button btn_next = findViewById(R.id.next); // '다음' 버튼의 id="@+id/next" 객체화
                    btn_next.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
                        int cnt = 0; // 버튼이 눌린 횟수 카운트
                        @Override
                        public void onClick(View view) { // 프래그먼트 전환 메소드, 카운트 값에 따라 배열 안의 프래그먼트 순환
                            cnt++; // 버튼이 눌릴 때마다 카운트 1씩 증가 -> 카운트 값에 따라 배열 안의 프래그먼트 순서대로 보여지는 역할

                            if (cnt == 6) { // 배열 안의 프래그먼트가 끝났을 경우
                                cnt = 0; // 카운트를 0으로 초기화
                                selected = bunsik[cnt]; // 배열의 맨 처음 프래그먼트를 선택하여 다시 처음으로 돌아간다.
                            } else { // 배열 안의 프래그먼트가 존재할 경우
                                selected = bunsik[cnt]; // 해당 번호에 맞는 프래그먼트 선택
                            }

                            getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, selected).commit(); // if문을 통해 선택된 프래그먼트를 프레임 레이아웃에 중첩시켜 보여준다.
                        }
                    });

                    /* '결정' 버튼 클릭 이벤트 처리 */
                    Button btn_ok = findViewById(R.id.ok); // '결정' 버튼의 id="@+id/ok" 객체화
                    btn_ok.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
                        @Override
                        public void onClick(View view) { // 해당 메뉴를 결정했을 경우, 결정을 완료했다는 메세지를 출력하는 화면(SelectedActivity)으로 전환하는 메소드
                            Intent intent = new Intent(getApplicationContext(), SelectedActivity.class); // 인텐트 생성 후, SelectedActivity.class로 인텐트를 넘겨준다.
                            startActivity(intent); // 해당 class로 인텐트 전달 -> 해당 class에서 객체화하는 xml로 화면 전환 수행
                            finish(); // 현재 class 객체 삭제
                        }
                    });
                }

                else if (position == 2) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_jbnu_ilsik1).commit();

                    /* '다음' 버튼 클릭 이벤트 처리 */
                    Button btn_next = findViewById(R.id.next); // '다음' 버튼의 id="@+id/next" 객체화
                    btn_next.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
                        int cnt = 0; // 버튼이 눌린 횟수 카운트
                        @Override
                        public void onClick(View view) { // 프래그먼트 전환 메소드, 카운트 값에 따라 배열 안의 프래그먼트 순환
                            cnt++; // 버튼이 눌릴 때마다 카운트 1씩 증가 -> 카운트 값에 따라 배열 안의 프래그먼트 순서대로 보여지는 역할

                            if (cnt == 6) { // 배열 안의 프래그먼트가 끝났을 경우
                                cnt = 0; // 카운트를 0으로 초기화
                                selected = ilsik[cnt]; // 배열의 맨 처음 프래그먼트를 선택하여 다시 처음으로 돌아간다.
                            } else { // 배열 안의 프래그먼트가 존재할 경우
                                selected = ilsik[cnt]; // 해당 번호에 맞는 프래그먼트 선택
                            }

                            getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, selected).commit(); // if문을 통해 선택된 프래그먼트를 프레임 레이아웃에 중첩시켜 보여준다.
                        }
                    });

                    /* '결정' 버튼 클릭 이벤트 처리 */
                    Button btn_ok = findViewById(R.id.ok); // '결정' 버튼의 id="@+id/ok" 객체화
                    btn_ok.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
                        @Override
                        public void onClick(View view) { // 해당 메뉴를 결정했을 경우, 결정을 완료했다는 메세지를 출력하는 화면(SelectedActivity)으로 전환하는 메소드
                            Intent intent = new Intent(getApplicationContext(), SelectedActivity.class); // 인텐트 생성 후, SelectedActivity.class로 인텐트를 넘겨준다.
                            startActivity(intent); // 해당 class로 인텐트 전달 -> 해당 class에서 객체화하는 xml로 화면 전환 수행
                            finish(); // 현재 class 객체 삭제
                        }
                    });
                }
                else if (position == 3) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_jbnu_joongsik1).commit();

                    /* '다음' 버튼 클릭 이벤트 처리 */
                    Button btn_next = findViewById(R.id.next); // '다음' 버튼의 id="@+id/next" 객체화
                    btn_next.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
                        int cnt = 0; // 버튼이 눌린 횟수 카운트
                        @Override
                        public void onClick(View view) { // 프래그먼트 전환 메소드, 카운트 값에 따라 배열 안의 프래그먼트 순환
                            cnt++; // 버튼이 눌릴 때마다 카운트 1씩 증가 -> 카운트 값에 따라 배열 안의 프래그먼트 순서대로 보여지는 역할

                            if (cnt == 4) { // 배열 안의 프래그먼트가 끝났을 경우
                                cnt = 0; // 카운트를 0으로 초기화
                                selected = joogsik[cnt]; // 배열의 맨 처음 프래그먼트를 선택하여 다시 처음으로 돌아간다.
                            } else { // 배열 안의 프래그먼트가 존재할 경우
                                selected = joogsik[cnt]; // 해당 번호에 맞는 프래그먼트 선택
                            }

                            getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, selected).commit(); // if문을 통해 선택된 프래그먼트를 프레임 레이아웃에 중첩시켜 보여준다.
                        }
                    });

                    /* '결정' 버튼 클릭 이벤트 처리 */
                    Button btn_ok = findViewById(R.id.ok); // '결정' 버튼의 id="@+id/ok" 객체화
                    btn_ok.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
                        @Override
                        public void onClick(View view) { // 해당 메뉴를 결정했을 경우, 결정을 완료했다는 메세지를 출력하는 화면(SelectedActivity)으로 전환하는 메소드
                            Intent intent = new Intent(getApplicationContext(), SelectedActivity.class); // 인텐트 생성 후, SelectedActivity.class로 인텐트를 넘겨준다.
                            startActivity(intent); // 해당 class로 인텐트 전달 -> 해당 class에서 객체화하는 xml로 화면 전환 수행
                            finish(); // 현재 class 객체 삭제
                        }
                    });
                }
                else if (position == 4) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_jbnu_yangsik1).commit();

                    /* '다음' 버튼 클릭 이벤트 처리 */
                    Button btn_next = findViewById(R.id.next); // '다음' 버튼의 id="@+id/next" 객체화
                    btn_next.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
                        int cnt = 0; // 버튼이 눌린 횟수 카운트
                        @Override
                        public void onClick(View view) { // 프래그먼트 전환 메소드, 카운트 값에 따라 배열 안의 프래그먼트 순환
                            cnt++; // 버튼이 눌릴 때마다 카운트 1씩 증가 -> 카운트 값에 따라 배열 안의 프래그먼트 순서대로 보여지는 역할

                            if (cnt == 4) { // 배열 안의 프래그먼트가 끝났을 경우
                                cnt = 0; // 카운트를 0으로 초기화
                                selected = yangsik[cnt]; // 배열의 맨 처음 프래그먼트를 선택하여 다시 처음으로 돌아간다.
                            } else { // 배열 안의 프래그먼트가 존재할 경우
                                selected = yangsik[cnt]; // 해당 번호에 맞는 프래그먼트 선택
                            }

                            getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, selected).commit(); // if문을 통해 선택된 프래그먼트를 프레임 레이아웃에 중첩시켜 보여준다.
                        }
                    });

                    /* '결정' 버튼 클릭 이벤트 처리 */
                    Button btn_ok = findViewById(R.id.ok); // '결정' 버튼의 id="@+id/ok" 객체화
                    btn_ok.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
                        @Override
                        public void onClick(View view) { // 해당 메뉴를 결정했을 경우, 결정을 완료했다는 메세지를 출력하는 화면(SelectedActivity)으로 전환하는 메소드
                            Intent intent = new Intent(getApplicationContext(), SelectedActivity.class); // 인텐트 생성 후, SelectedActivity.class로 인텐트를 넘겨준다.
                            startActivity(intent); // 해당 class로 인텐트 전달 -> 해당 class에서 객체화하는 xml로 화면 전환 수행
                            finish(); // 현재 class 객체 삭제
                        }
                    });
                }
                else if (position == 5) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_jbnu_yasik1).commit();

                    /* '다음' 버튼 클릭 이벤트 처리 */
                    Button btn_next = findViewById(R.id.next); // '다음' 버튼의 id="@+id/next" 객체화
                    btn_next.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
                        int cnt = 0; // 버튼이 눌린 횟수 카운트
                        @Override
                        public void onClick(View view) { // 프래그먼트 전환 메소드, 카운트 값에 따라 배열 안의 프래그먼트 순환
                            cnt++; // 버튼이 눌릴 때마다 카운트 1씩 증가 -> 카운트 값에 따라 배열 안의 프래그먼트 순서대로 보여지는 역할

                            if (cnt == 4) { // 배열 안의 프래그먼트가 끝났을 경우
                                cnt = 0; // 카운트를 0으로 초기화
                                selected = yasik[cnt]; // 배열의 맨 처음 프래그먼트를 선택하여 다시 처음으로 돌아간다.
                            } else { // 배열 안의 프래그먼트가 존재할 경우
                                selected = yasik[cnt]; // 해당 번호에 맞는 프래그먼트 선택
                            }

                            getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, selected).commit(); // if문을 통해 선택된 프래그먼트를 프레임 레이아웃에 중첩시켜 보여준다.
                        }
                    });

                    /* '결정' 버튼 클릭 이벤트 처리 */
                    Button btn_ok = findViewById(R.id.ok); // '결정' 버튼의 id="@+id/ok" 객체화
                    btn_ok.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
                        @Override
                        public void onClick(View view) { // 해당 메뉴를 결정했을 경우, 결정을 완료했다는 메세지를 출력하는 화면(SelectedActivity)으로 전환하는 메소드
                            Intent intent = new Intent(getApplicationContext(), SelectedActivity.class); // 인텐트 생성 후, SelectedActivity.class로 인텐트를 넘겨준다.
                            startActivity(intent); // 해당 class로 인텐트 전달 -> 해당 class에서 객체화하는 xml로 화면 전환 수행
                            finish(); // 현재 class 객체 삭제
                        }
                    });
                }
                else if (position == 6) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_jbnu_fastfood1).commit();

                    /* '다음' 버튼 클릭 이벤트 처리 */
                    Button btn_next = findViewById(R.id.next); // '다음' 버튼의 id="@+id/next" 객체화
                    btn_next.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
                        int cnt = 0; // 버튼이 눌린 횟수 카운트
                        @Override
                        public void onClick(View view) { // 프래그먼트 전환 메소드, 카운트 값에 따라 배열 안의 프래그먼트 순환
                            cnt++; // 버튼이 눌릴 때마다 카운트 1씩 증가 -> 카운트 값에 따라 배열 안의 프래그먼트 순서대로 보여지는 역할

                            if (cnt == 5) { // 배열 안의 프래그먼트가 끝났을 경우
                                cnt = 0; // 카운트를 0으로 초기화
                                selected = fastfood[cnt]; // 배열의 맨 처음 프래그먼트를 선택하여 다시 처음으로 돌아간다.
                            } else { // 배열 안의 프래그먼트가 존재할 경우
                                selected = fastfood[cnt]; // 해당 번호에 맞는 프래그먼트 선택
                            }

                            getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, selected).commit(); // if문을 통해 선택된 프래그먼트를 프레임 레이아웃에 중첩시켜 보여준다.
                        }
                    });

                    /* '결정' 버튼 클릭 이벤트 처리 */
                    Button btn_ok = findViewById(R.id.ok); // '결정' 버튼의 id="@+id/ok" 객체화
                    btn_ok.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
                        @Override
                        public void onClick(View view) { // 해당 메뉴를 결정했을 경우, 결정을 완료했다는 메세지를 출력하는 화면(SelectedActivity)으로 전환하는 메소드
                            Intent intent = new Intent(getApplicationContext(), SelectedActivity.class); // 인텐트 생성 후, SelectedActivity.class로 인텐트를 넘겨준다.
                            startActivity(intent); // 해당 class로 인텐트 전달 -> 해당 class에서 객체화하는 xml로 화면 전환 수행
                            finish(); // 현재 class 객체 삭제
                        }
                    });
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}