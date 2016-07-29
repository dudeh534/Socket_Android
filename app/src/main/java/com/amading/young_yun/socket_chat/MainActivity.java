package com.amading.young_yun.socket_chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/* 16/07/25
* 1. manifests application android:name?
* 2. application mean in project
*  - 안드로이드에서 Application Class란 어플리케이션 컴포넌트들 사이에서 공동으로 멤버들을 사용할 수 있게
*  해주는 편리한 공유 클래스를 제공한다. 어플리케이션 사이의 컴포넌트들이 공동으로 사용할 수 있기 때문에 공통되게
*  사용하는 내용을 작성해주면 어디서는 context를 이용한 접근이 가능해진다. - dataStorage get set처럼 쓰이는 데
*  단순한 데이터 말고도 ChatApplication과 같이 socket 클래스 등을 정의하여 쓰일 수 있다.
* 3. Fragment must use for project
* 4. database study, mongo db structure study, express structure study
* todo Chat room implement, random matching or users list
* todo server service(mine), detail(event), exception web
* todo fcm - push, auth - email, (analytics)
* todo depth detail
* todo Login api facebook
* todo back-end MongoDB using - structure
* 1. 방 3개를 만들어 놓고 거기에 들어가는 것 - 방 개념
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
