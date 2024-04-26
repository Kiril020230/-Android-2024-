package task_4

interface Observer {
    fun update(news: String)
}

class NewsPoster {
    private val subscribers = mutableListOf<Observer>()

    fun addSubscriber(subscriber: Observer) {
        subscribers.add(subscriber)
    }

    fun removeSubscriber(subscriber: Observer) {
        subscribers.remove(subscriber)
    }

    fun notifySubscribers(news: String) {
        for (subscriber in subscribers) {
            subscriber.update(news)
        }
    }

    fun postNews(news: String) {
        println("Новая новость: $news")
        notifySubscribers(news)
    }
}

class Subscriber(private val name: String) : Observer {
    override fun update(news: String) {
        println("$name получил новость: $news")
    }
}

fun main() {
    val newsPoster = NewsPoster()

    val subscriber1 = Subscriber("Подписчик 1")
    val subscriber2 = Subscriber("Подписчик 2")

    newsPoster.addSubscriber(subscriber1)
    newsPoster.addSubscriber(subscriber2)

    newsPoster.postNews("Важное объявление!")

    newsPoster.removeSubscriber(subscriber2)

    newsPoster.postNews("Еще одна новость!")
}