/**
 * Created by joe.chacon on 7/26/2017.
 */


/*
 * Declaring properties and initializing them from the constructor
 */
class Colleague{
    /*
     * val: read-only
     * var: mutable
     */
    var colleagues  = arrayListOf<String>();
    init {
        this.colleagues.add("Joe Chacon");this.colleagues.add("Alexandre Rogozine")
        this.colleagues.add("Robert Spidle");this.colleagues.add("Joe Dallacqua")
        this.colleagues.add("Paige Briggs");this.colleagues.add("Paula Buel")
        this.colleagues.add("Jackson Stakeman");this.colleagues.add("William Peters")
        this.colleagues.add("Margaux Kaynard");this.colleagues.add("Stephen Smith")
        this.colleagues.add("Stephen Gralton");this.colleagues.add("John Cairns")
        this.colleagues.add("Brett Zelk")
        this.colleagues.add("Ben Jones")
        this.colleagues.add("Skye Roseboom")
        this.colleagues.add("Glenn Chavira")
        this.colleagues.add("Brittany Pier")
        this.colleagues.add("Nicolas Zapata")
        this.colleagues.add("Aaron Cordova")
        this.colleagues.add("Kevin Dilts")
        this.colleagues.add("Spencer Nichols")
        this.colleagues.add("Jason Ward")

    }


    fun getColleague(): ArrayList<String>{
        print("Colleague: " + colleagues.size)
        return colleagues
    }

}