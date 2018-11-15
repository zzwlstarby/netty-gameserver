/*
* @author   作者: qugang
* @E-mail   邮箱: qgass@163.com
* @date     创建时间：2018/1/22
* 类说明     返回socket channel
*/
package com.linkflywind.gameserver.core.network.websocket.websocketcache.message;

import com.linkflywind.gameserver.core.network.websocket.GameWebSocketSession;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TellPopChannel {
    private String webSocketSessionId;
    private GameWebSocketSession gameWebSocketSession;
    private Optional<byte[]> message;
}