package org.techtown.termprojectmenu;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.google.android.material.tabs.TabLayout;

public class GaeksaActivity extends AppCompatActivity {

    Toolbar toolbar; // 선택한 구역 이름을 보여줄 Toolbar 선언

    // 한식 탭에 들어갈 프래그먼트 선언
    Gaeksa_hansik1 fragment_gaeksa_hansik1;
    Gaeksa_hansik2 fragment_gaeksa_hansik2;
    Gaeksa_hansik3 fragment_gaeksa_hansik3;
    Gaeksa_hansik4 fragment_gaeksa_hansik4;
    Gaeksa_hansik5 fragment_gaeksa_hansik5;
    Gaeksa_hansik6 fragment_gaeksa_hansik6;
    Gaeksa_hansik7 fragment_gaeksa_hansik7;

    // 분식 탭에 들어갈 프래그먼트 선언
    Gaeksa_bunsik1 fragment_gaeksa_bunsik1;
    Gaeksa_bunsik2 fragment_gaeksa_bunsik2;
    Gaeksa_bunsik3 fragment_gaeksa_bunsik3;
    Gaeksa_bunsik4 fragment_gaeksa_bunsik4;
    Gaeksa_bunsik5 fragment_gaeksa_bunsik5;
    Gaeksa_bunsik6 fragment_gaeksa_bunsik6;
    Gaeksa_bunsik7 fragment_gaeksa_bunsik7;
    Gaeksa_bunsik8 fragment_gaeksa_bunsik8;

    // 일식 탭에 들어갈 프래그먼트 선언
    Gaeksa_ilsik1 fragment_gaeksa_ilsik1;
    Gaeksa_ilsik2 fragment_gaeksa_ilsik2;
    Gaeksa_ilsik3 fragment_gaeksa_ilsik3;
    Gaeksa_ilsik4 fragment_gaeksa_ilsik4;
    Gaeksa_ilsik5 fragment_gaeksa_ilsik5;
    Gaeksa_ilsik6 fragment_gaeksa_ilsik6;

    // 중식 탭에 들어갈 프래그먼트 선언
    Gaeksa_joongsik1 fragment_gaeksa_joongsik1;
    Gaeksa_joongsik2 fragment_gaeksa_joongsik2;
    Gaeksa_joongsik3 fragment_gaeksa_joongsik3;
    Gaeksa_joongsik4 fragment_gaeksa_joongsik4;

    // 양식 탭에 들어갈 프래그먼트 선언
    Gaeksa_yangsik1 fragment_gaeksa_yangsik1;
    Gaeksa_yangsik2 fragment_gaeksa_yangsik2;
    Gaeksa_yangsik3 fragment_gaeksa_yangsik3;
    Gaeksa_yangsik4 fragment_gaeksa_yangsik4;

    // 야식 탭에 들어갈 프래그먼트 선언
    Gaeksa_yasik1 fragment_gaeksa_yasik1;
    Gaeksa_yasik2 fragment_gaeksa_yasik2;
    Gaeksa_yasik3 fragment_gaeksa_yasik3;
    Gaeksa_yasik4 fragment_gaeksa_yasik4;
    Gaeksa_yasik5 fragment_gaeksa_yasik5;

    // 패스트푸드 탭에 들어갈 프래그먼트 선언
    Gaeksa_fastfood1 fragment_gaeksa_fastfood1;
    Gaeksa_fastfood2 fragment_gaeksa_fastfood2;
    Gaeksa_fastfood3 fragment_gaeksa_fastfood3;
    Gaeksa_fastfood4 fragment_gaeksa_fastfood4;
    Gaeksa_fastfood5 fragment_gaeksa_fastfood5;

    Fragment selected = null; // 선택된 프래그먼트를 나타내는 변수 선언

    TextView titleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeonju); // activity_jeonju.xml 객체화

        titleText = findViewById(R.id.titleText);
        titleText.setText("전주 시내(객사)");
        toolbar = findViewById(R.id.toolbar_jeonju); // Toolbar 객체화
        setSupportActionBar(toolbar); // 객체화한 Toolbar를 화면에 보여주는 메소드

        // 한식 프래그먼트 생성
        fragment_gaeksa_hansik1 = new Gaeksa_hansik1();
        fragment_gaeksa_hansik2 = new Gaeksa_hansik2();
        fragment_gaeksa_hansik3 = new Gaeksa_hansik3();
        fragment_gaeksa_hansik4 = new Gaeksa_hansik4();
        fragment_gaeksa_hansik5 = new Gaeksa_hansik5();
        fragment_gaeksa_hansik6 = new Gaeksa_hansik6();
        fragment_gaeksa_hansik7 = new Gaeksa_hansik7();

        // 분식 프래그먼트 생성
        fragment_gaeksa_bunsik1 = new Gaeksa_bunsik1();
        fragment_gaeksa_bunsik2 = new Gaeksa_bunsik2();
        fragment_gaeksa_bunsik3 = new Gaeksa_bunsik3();
        fragment_gaeksa_bunsik4 = new Gaeksa_bunsik4();
        fragment_gaeksa_bunsik5 = new Gaeksa_bunsik5();
        fragment_gaeksa_bunsik6 = new Gaeksa_bunsik6();
        fragment_gaeksa_bunsik7 = new Gaeksa_bunsik7();
        fragment_gaeksa_bunsik8 = new Gaeksa_bunsik8();

        // 일식 프래그먼트 생성
        fragment_gaeksa_ilsik1 = new Gaeksa_ilsik1();
        fragment_gaeksa_ilsik2 = new Gaeksa_ilsik2();
        fragment_gaeksa_ilsik3 = new Gaeksa_ilsik3();
        fragment_gaeksa_ilsik4 = new Gaeksa_ilsik4();
        fragment_gaeksa_ilsik5 = new Gaeksa_ilsik5();
        fragment_gaeksa_ilsik6 = new Gaeksa_ilsik6();

        // 중식 프래그먼트 생성
        fragment_gaeksa_joongsik1 = new Gaeksa_joongsik1();
        fragment_gaeksa_joongsik2 = new Gaeksa_joongsik2();
        fragment_gaeksa_joongsik3 = new Gaeksa_joongsik3();
        fragment_gaeksa_joongsik4 = new Gaeksa_joongsik4();

        // 양식 프래그먼트 생성
        fragment_gaeksa_yangsik1 = new Gaeksa_yangsik1();
        fragment_gaeksa_yangsik2 = new Gaeksa_yangsik2();
        fragment_gaeksa_yangsik3 = new Gaeksa_yangsik3();
        fragment_gaeksa_yangsik4 = new Gaeksa_yangsik4();

        // 야식 프래그먼트 생성
        fragment_gaeksa_yasik1 = new Gaeksa_yasik1();
        fragment_gaeksa_yasik2 = new Gaeksa_yasik2();
        fragment_gaeksa_yasik3 = new Gaeksa_yasik3();
        fragment_gaeksa_yasik4 = new Gaeksa_yasik4();
        fragment_gaeksa_yasik5 = new Gaeksa_yasik5();

        // 패스트푸드 프래그먼트 생성
        fragment_gaeksa_fastfood1 = new Gaeksa_fastfood1();
        fragment_gaeksa_fastfood2 = new Gaeksa_fastfood2();
        fragment_gaeksa_fastfood3 = new Gaeksa_fastfood3();
        fragment_gaeksa_fastfood4 = new Gaeksa_fastfood4();
        fragment_gaeksa_fastfood5 = new Gaeksa_fastfood5();

        // 각 탭에 들어갈 프래그먼트를 Fragment 자료형 배열로 구분한 후, final로 선언하여 배열의 내용이 변경되지 않도록 한다.
        final Fragment[] hansik = {fragment_gaeksa_hansik1, fragment_gaeksa_hansik2, fragment_gaeksa_hansik3, fragment_gaeksa_hansik4, fragment_gaeksa_hansik5, fragment_gaeksa_hansik6, fragment_gaeksa_hansik7};
        final Fragment[] bunsik = {fragment_gaeksa_bunsik1, fragment_gaeksa_bunsik2, fragment_gaeksa_bunsik3, fragment_gaeksa_bunsik4, fragment_gaeksa_bunsik5, fragment_gaeksa_bunsik6, fragment_gaeksa_bunsik7, fragment_gaeksa_bunsik8};
        final Fragment[] ilsik = {fragment_gaeksa_ilsik1, fragment_gaeksa_ilsik2, fragment_gaeksa_ilsik3, fragment_gaeksa_ilsik4, fragment_gaeksa_ilsik5, fragment_gaeksa_ilsik6};
        final Fragment[] joogsik = {fragment_gaeksa_joongsik1, fragment_gaeksa_joongsik2, fragment_gaeksa_joongsik3, fragment_gaeksa_joongsik4};
        final Fragment[] yangsik = {fragment_gaeksa_yangsik1, fragment_gaeksa_yangsik2, fragment_gaeksa_yangsik3, fragment_gaeksa_yangsik4};
        final Fragment[] yasik = {fragment_gaeksa_yasik1, fragment_gaeksa_yasik2, fragment_gaeksa_yasik3, fragment_gaeksa_yasik4, fragment_gaeksa_yasik5};
        final Fragment[] fastfood = {fragment_gaeksa_fastfood1, fragment_gaeksa_fastfood2, fragment_gaeksa_fastfood3, fragment_gaeksa_fastfood4, fragment_gaeksa_fastfood5};

        TabLayout tabs = findViewById(R.id.tabs); // 상단탭을 만들기 위한 탭 객체화
        // 상단탭에 7가지 음식 분야 추가
        tabs.addTab(tabs.newTab().setText("한식"));
        tabs.addTab(tabs.newTab().setText("분식"));
        tabs.addTab(tabs.newTab().setText("일식"));
        tabs.addTab(tabs.newTab().setText("중식"));
        tabs.addTab(tabs.newTab().setText("양식"));
        tabs.addTab(tabs.newTab().setText("야식"));
        tabs.addTab(tabs.newTab().setText("패스트푸드"));

        getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_gaeksa_hansik1).commit(); // activity_jeonju.xml이 보여졌을 때 처음 프레임 레이아웃에 보여지는 프래그먼트 설정
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
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_gaeksa_hansik1).commit();

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
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_gaeksa_bunsik1).commit();

                    /* '다음' 버튼 클릭 이벤트 처리 */
                    Button btn_next = findViewById(R.id.next); // '다음' 버튼의 id="@+id/next" 객체화
                    btn_next.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
                        int cnt = 0; // 버튼이 눌린 횟수 카운트
                        @Override
                        public void onClick(View view) { // 프래그먼트 전환 메소드, 카운트 값에 따라 배열 안의 프래그먼트 순환
                            cnt++; // 버튼이 눌릴 때마다 카운트 1씩 증가 -> 카운트 값에 따라 배열 안의 프래그먼트 순서대로 보여지는 역할

                            if (cnt == 8) { // 배열 안의 프래그먼트가 끝났을 경우
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
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_gaeksa_ilsik1).commit();

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
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_gaeksa_joongsik1).commit();

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
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_gaeksa_yangsik1).commit();

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
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_gaeksa_yasik1).commit();

                    /* '다음' 버튼 클릭 이벤트 처리 */
                    Button btn_next = findViewById(R.id.next); // '다음' 버튼의 id="@+id/next" 객체화
                    btn_next.setOnClickListener(new View.OnClickListener() { // 버튼 눌렀을 경우 이벤트 처리
                        int cnt = 0; // 버튼이 눌린 횟수 카운트
                        @Override
                        public void onClick(View view) { // 프래그먼트 전환 메소드, 카운트 값에 따라 배열 안의 프래그먼트 순환
                            cnt++; // 버튼이 눌릴 때마다 카운트 1씩 증가 -> 카운트 값에 따라 배열 안의 프래그먼트 순서대로 보여지는 역할

                            if (cnt == 5) { // 배열 안의 프래그먼트가 끝났을 경우
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
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_gaeksa_fastfood1).commit();

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