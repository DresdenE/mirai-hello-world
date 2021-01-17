package helloworld;

import net.mamoe.mirai.Bot;
import net.mamoe.mirai.BotFactory;
import net.mamoe.mirai.event.*;
import net.mamoe.mirai.event.events.*;
import net.mamoe.mirai.utils.BotConfiguration;
import java.io.File;

public class JavaMain {
    public static void main(String[] args) {
        Bot bot = BotFactory.INSTANCE.newBot(123456, "test");
        bot.login();
    }
}

class WithConfiguration {
    public static void main(String[] args) {
        Bot bot = BotFactory.INSTANCE.newBot(2730731836L, "Hey,I'mabot!", new BotConfiguration() {{
            setWorkingDir(new File("F:/Users/cavin/Desktop/Project 3/QQBot"));
            fileBasedDeviceInfo();
            setProtocol(MiraiProtocol.ANDROID_PHONE);
        }});
        bot.login();
        var channel = GlobalEventChannel.INSTANCE.filterIsInstance(FriendMessageEvent.class);
        var listener = channel.subscribeAlways(FriendMessageEvent.class, event -> {
            event.getSubject().sendMessage("HelloWorld");
        });
        //listener.complete();
    }
}
