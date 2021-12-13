package com.company.design.singleton;

public class SocketClient {
    // 사용할 때마다 새로 연결하는 것이 아니라 한번 연결 해놓은 것을 이용하여 계속 연결을 유지하는 방식을 Socket 방식이라고 한다.
    //싱글톤은 자기 자신을 객체로 가지고 있어야 한다 (즉, 자기 자신을 클래스로 가지고 시작해야 한다, 그리고 반드시 기본 생성자를 private으로 막아야 한다! )

    //클래스 자기 자신을 클래스로 가지고 있어야 한다.  메서드가 static이므로 변수도 static이어야 한다.
    private static SocketClient socketClient = null;

    //기본 생성자(defualt Constructor를 private으로 막아야 한다)
    private SocketClient(){

    }

    // static으로 getInstance()라는 메소드를 작성해 줘야 한다.
    public static SocketClient getInstance(){
        // static이므로 어떤 클래스에서든 SocketClient . 으로 getInstance()에 접근 할 수 있게 된다.

        if(socketClient == null){
            socketClient = new SocketClient();
            //즉 연결이 안되었다면 생성자를 생성하여 연결을 해주어라

        }
        return socketClient; //연결된 상태를 그대로 유지해라
    }

    public  void connect(){
        System.out.println("연결완료");
    }
}
