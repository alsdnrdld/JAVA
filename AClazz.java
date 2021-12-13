package com.company.design.singleton;

public class AClazz {
    private SocketClient socketClient;

    public AClazz(){
        // this.socketClient = new SocketClient(); <--- 이건 불가능 왜냐하면 SocketClient에서 기본 생성자를 막아 놨기 때문임.
        this.socketClient = SocketClient.getInstance(); //<--- 그렇기 때문에 getInstance 메소드를 통해서만 생성자를 형성한것과 같은 효과를 얻을 수 있다.

    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
