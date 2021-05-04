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

public class SinsiActivity extends AppCompatActivity {

    Toolbar toolbar; // 선택한 구역 이름을 보여줄 Toolbar 선언

    // 한식 탭에 들어갈 프래그먼트 선언
    Sinsi_hansik1 fragment_sinsi_hansik1;
    Sinsi_hansik2 fragment_sinsi_hansik2;
    Sinsi_hansik3 fragment_sinsi_hansik3;
    Sinsi_hansik4 fragment_sinsi_hansik4;
    Sinsi_hansik5 fragment_sinsi_hansik5;
    Sinsi_hansik6 fragment_sinsi_hansik6;
    Sinsi_hansik7 fragment_sinsi_hansik7;

    // 분식 탭에 들어갈 프래그먼트 선언
    Sinsi_bunsik1 fragment_sinsi_bunsik1;
    Sinsi_bunsik2 fragment_sinsi_bunsik2;
    Sinsi_bunsik3 fragment_sinsi_bunsik3;
    Sinsi_bunsik4 fragment_sinsi_bunsik4;
    Sinsi_bunsik5 fragment_sinsi_bunsik5;
    Sinsi_bunsik6 fragment_sinsi_bunsik6;

    // 일식 탭에 들어갈 프래그먼트 선언
    Sinsi_ilsik1 fragment_sinsi_ilsik1;
    Sinsi_ilsik2 fragment_sinsi_ilsik2;
    Sinsi_ilsik3 fragment_sinsi_ilsik3;
    Sinsi_ilsik4 fragment_sinsi_ilsik4;
    Sinsi_ilsik5 fragment_sinsi_ilsik5;
    Sinsi_ilsik6 fragment_sinsi_ilsik6;

    // 중식 탭에 들어갈 프래그먼트 선언
    Sinsi_joongsik1 fragment_sinsi_joongsik1;
    Sinsi_joongsik2 fragment_sinsi_joongsik2;
    Sinsi_joongsik3 fragment_sinsi_joongsik3;
    Sinsi_joongsik4 fragment_sinsi_joongsik4;

    // 양식 탭에 들어갈 프래그먼트 선언
    Sinsi_yangsik1 fragment_sinsi_yangsik1;
    Sinsi_yangsik2 fragment_sinsi_yangsik2;
    Sinsi_yangsik3 fragment_sinsi_yangsik3;
    Sinsi_yangsik4 fragment_sinsi_yangsik4;

    // 야식 탭에 들어갈 프래그먼트 선언
    Sinsi_yasik1 fragment_sinsi_yasik1;
    Sinsi_yasik2 fragment_sinsi_yasik2;
    Sinsi_yasik3 fragment_sinsi_yasik3;
    Sinsi_yasik4 fragment_sinsi_yasik4;

    // 패스트푸드 탭에 들어갈 프래그먼트 선언
    Sinsi_fastfood1 fragment_sinsi_fastfood1;
    Sinsi_fastfood2 fragment_sinsi_fastfood2;
    Sinsi_fastfood3 fragment_sinsi_fastfood3;
    Sinsi_fastfood4 fragment_sinsi_fastfood4;
    Sinsi_fastfood5 fragment_sinsi_fastfood5;

    Fragment selected = null; // 선택된 프래그먼트를 나타내는 변수 선언

    TextView titleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeonju); // activity_jeonju.xml 객체화

        titleText = findViewById(R.id.titleText);
        titleText.setText("신시가지");
        toolbar = findViewById(R.id.toolbar_jeonju); // Toolbar 객체화
        setSupportActionBar(toolbar); // 객체화한 Toolbar를 화면에 보여주는 메소드

        // 한식 프래그먼트 생성
        fragment_sinsi_hansik1 = new Sinsi_hansik1();
        fragment_sinsi_hansik2 = new Sinsi_hansik2();
        fragment_sinsi_hansik3 = new Sinsi_hansik3();
        fragment_sinsi_hansik4 = new Sinsi_hansik4();
        fragment_sinsi_hansik5 = new Sinsi_hansik5();
        fragment_sinsi_hansik6 = new Sinsi_hansik6();
        fragment_sinsi_hansik7 = new Sinsi_hansik7();

        // 분식 프래그먼트 생성
        fragment_sinsi_bunsik1 = new Sinsi_bunsik1();
        fragment_sinsi_bunsik2 = new Sinsi_bunsik2();
        fragment_sinsi_bunsik3 = new Sinsi_bunsik3();
        fragment_sinsi_bunsik4 = new Sinsi_bunsik4();
        fragment_sinsi_bunsik5 = new Sinsi_bunsik5();
        fragment_sinsi_bunsik6 = new Sinsi_bunsik6();

        // 일식 프래그먼트 생성
        fragment_sinsi_ilsik1 = new Sinsi_ilsik1();
        fragment_sinsi_ilsik2 = new Sinsi_ilsik2();
        fragment_sinsi_ilsik3 = new Sinsi_ilsik3();
        fragment_sinsi_ilsik4 = new Sinsi_ilsik4();
        fragment_sinsi_ilsik5 = new Sinsi_ilsik5();
        fragment_sinsi_ilsik6 = new Sinsi_ilsik6();

        // 중식 프래그먼트 생성
        fragment_sinsi_joongsik1 = new Sinsi_joongsik1();
        fragment_sinsi_joongsik2 = new Sinsi_joongsik2();
        fragment_sinsi_joongsik3 = new Sinsi_joongsik3();
        fragment_sinsi_joongsik4 = new Sinsi_joongsik4();

        // 양식 프래그먼트 생성
        fragment_sinsi_yangsik1 = new Sinsi_yangsik1();
        fragment_sinsi_yangsik2 = new Sinsi_yangsik2();
        fragment_sinsi_yangsik3 = new Sinsi_yangsik3();
        fragment_sinsi_yangsik4 = new Sinsi_yangsik4();

        // 야식 프래그먼트 생성
        fragment_sinsi_yasik1 = new Sinsi_yasik1();
        fragment_sinsi_yasik2 = new Sinsi_yasik2();
        fragment_sinsi_yasik3 = new Sinsi_yasik3();
        fragment_sinsi_yasik4 = new Sinsi_yasik4();

        // 패스트푸드 프래그먼트 생성
        fragment_sinsi_fastfood1 = new Sinsi_fastfood1();
        fragment_sinsi_fastfood2 = new Sinsi_fastfood2();
        fragment_sinsi_fastfood3 = new Sinsi_fastfood3();
        fragment_sinsi_fastfood4 = new Sinsi_fastfood4();
        fragment_sinsi_fastfood5 = new Sinsi_fastfood5();

        // 각 탭에 들어갈 프래그먼트를 Fragment 자료형 배열로 구분한 후, final로 선언하여 배열의 내용이 변경되지 않도록 한다.
        final Fragment[] hansik = {fragment_sinsi_hansik1, fragment_sinsi_hansik2, fragment_sinsi_hansik3, fragment_sinsi_hansik4, fragment_sinsi_hansik5, fragment_sinsi_hansik6, fragment_sinsi_hansik7};
        final Fragment[] bunsik = {fragment_sinsi_bunsik1, fragment_sinsi_bunsik2, fragment_sinsi_bunsik3, fragment_sinsi_bunsik4, fragment_sinsi_bunsik5, fragment_sinsi_bunsik6};
        final Fragment[] ilsik = {fragment_sinsi_ilsik1, fragment_sinsi_ilsik2, fragment_sinsi_ilsik3, fragment_sinsi_ilsik4, fragment_sinsi_ilsik5, fragment_sinsi_ilsik6};
        final Fragment[] joogsik = {fragment_sinsi_joongsik1, fragment_sinsi_joongsik2, fragment_sinsi_joongsik3, fragment_sinsi_joongsik4};
        final Fragment[] yangsik = {fragment_sinsi_yangsik1, fragment_sinsi_yangsik2, fragment_sinsi_yangsik3, fragment_sinsi_yangsik4};
        final Fragment[] yasik = {fragment_sinsi_yasik1, fragment_sinsi_yasik2, fragment_sinsi_yasik3, fragment_sinsi_yasik4};
        final Fragment[] fastfood = {fragment_sinsi_fastfood1, fragment_sinsi_fastfood2, fragment_sinsi_fastfood3, fragment_sinsi_fastfood4, fragment_sinsi_fastfood5};

        TabLayout tabs = findViewById(R.id.tabs); // 상단탭을 만들기 위한 탭 객체화
        // 상단탭에 7가지 음식 분야 추가
        tabs.addTab(tabs.newTab().setText("한식"));
        tabs.addTab(tabs.newTab().setText("분식"));
        tabs.addTab(tabs.newTab().setText("일식"));
        tabs.addTab(tabs.newTab().setText("중식"));
        tabs.addTab(tabs.newTab().setText("양식"));
        tabs.addTab(tabs.newTab().setText("야식"));
        tabs.addTab(tabs.newTab().setText("패스트푸드"));

        getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_sinsi_hansik1).commit(); // activity_jeonju.xml이 보여졌을 때 처음 프레임 레이아웃에 보여지는 프래그먼트 설정
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
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_sinsi_hansik1).commit();

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
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_sinsi_bunsik1).commit();

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
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_sinsi_ilsik1).commit();

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
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_sinsi_joongsik1).commit();

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
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_sinsi_yangsik1).commit();

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
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_sinsi_yasik1).commit();

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
                    getSupportFragmentManager().beginTransaction().replace(R.id.container_menu, fragment_sinsi_fastfood1).commit();

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