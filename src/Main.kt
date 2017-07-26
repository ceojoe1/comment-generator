/**
 * Created by joe.chacon on 7/26/2017.
 */

fun main(args: Array<String>){

    /*
     * Create colleagues
     */
    var colleagues:Colleague = Colleague()
    var comments:Comments = Comments()

    var user = colleagues.getColleague()
    var comment:String?

    for(col in user){
        println(col + " " + comments.get_a_comment())

    }

}