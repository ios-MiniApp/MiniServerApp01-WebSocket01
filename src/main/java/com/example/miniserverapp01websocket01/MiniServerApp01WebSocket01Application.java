package com.example.miniserverapp01websocket01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.annotation.WebServlet;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.security.Provider;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// ServerEndpoint のインスタンスは、セッションごと（コネクションごと）に作成される。
// １つのセッションの中では、常に同じ ServerEndpoint のインスタンスが利用される。
// また、 ServerEndpoint のインスタンスは常に１つのスレッドとだけ関連付けられる。
@SpringBootApplication
public class MiniServerApp01WebSocket01Application {

    public static void main(String[] args) {
        SpringApplication.run(MiniServerApp01WebSocket01Application.class, args);
    }

}
