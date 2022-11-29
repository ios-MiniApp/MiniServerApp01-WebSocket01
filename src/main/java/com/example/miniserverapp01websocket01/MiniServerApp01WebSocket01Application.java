package com.example.miniserverapp01websocket01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@SpringBootApplication
@ServerEndpoint("/WebSocketServer")
public class MiniServerApp01WebSocket01Application {

    public static void main(String[] args) {
        SpringApplication.run(MiniServerApp01WebSocket01Application.class, args);
    }

    @OnMessage
    public String onMessage(String message) {
        // メッセージを受信した際の処理を実装
        System.out.println("WebSocketで受信したメッセージ：" + message);
        return "WebSocketでメッセージを正常に受信しました！";
    }

    @OnError
    public void onError(Throwable th) {
        // WebSocketエラーが発生した際の処理を実装
        System.out.println("WebSocketエラーが発生：" + th.getMessage());
    }

    @OnOpen
    public void onOpen(Session session) {
        // セッションが確立した際の処理を実装
        System.out.println("WebSocketセッション確立");
    }

    @OnClose
    public void onClose(Session session) {
        // セッションを終了する際の処理を実装
        System.out.println("WebSocketセッション終了");
    }

}
