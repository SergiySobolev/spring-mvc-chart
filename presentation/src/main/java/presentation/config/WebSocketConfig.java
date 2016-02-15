package presentation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MessageConverter;
import org.springframework.messaging.simp.config.ChannelRegistration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketTransportRegistration;

import java.util.List;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
        stompEndpointRegistry.addEndpoint("/random").withSockJS();
    }

    public void configureWebSocketTransport(WebSocketTransportRegistration webSocketTransportRegistration) {

    }

    public void configureClientInboundChannel(ChannelRegistration channelRegistration) {

    }

    public void configureClientOutboundChannel(ChannelRegistration channelRegistration) {

    }

    public boolean configureMessageConverters(List<MessageConverter> list) {
        return false;
    }

    public void configureMessageBroker(MessageBrokerRegistry messageBrokerRegistry) {

    }
}
