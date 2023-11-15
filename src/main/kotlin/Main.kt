import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.*
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.ParseMode
import com.github.kotlintelegrambot.logging.LogLevel

fun main(args: Array<String>) {

    val bot = bot {
        token = "<Your Token>"
        timeout = 60
        logLevel = LogLevel.Network.Body

        dispatch {
            command("<Your Command>"){
                // TODO
            }

            text("<Text>") {
                // TODO
            }
        }
    }

    bot.startPolling()
}