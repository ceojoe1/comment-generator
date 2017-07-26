import java.util.*

/**
 * Created by joe.chacon on 7/26/2017.
 */

class Comments {
    var comments = arrayListOf<String>()
    var randNum = Random()
    init {
        comments.add("is Awesome!")
        comments.add("is the coolest person ever!")
        comments.add("smells like cheetos")
        comments.add("eats tacos")
        comments.add("has super powers")
        comments.add("likes nachos")
    }
    fun get_a_comment() : String {
        var rand = randNum.nextInt(comments.size)
        return comments.get(rand)
    }
}