package moe.polar.justchatting.chat

import io.ktor.websocket.DefaultWebSocketSession
import moe.polar.justchatting.principals.UserIdPrincipal

class WSConnection(
    val session: DefaultWebSocketSession,
    val principal: UserIdPrincipal,
    val room: UInt = 0u
)
