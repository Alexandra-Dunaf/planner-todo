//package ru.dunaf.planner.todo.legacy;
//
//import org.springframework.cloud.stream.annotation.Input;
//import org.springframework.messaging.MessageChannel;
//
//// название может быть любым
//// описывает каналы для работы с message broker
//public interface TodoBinding {
//    String INPUT_CHANNEL = "todoInputChannel"; // нужен, чтобы на него ссылаться, а не везде использовать антипаттерн magic string
//
//    @Input(INPUT_CHANNEL)
//    MessageChannel todoInputChannel();
//}
