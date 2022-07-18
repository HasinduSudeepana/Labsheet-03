object Q5
{
    def main(args:Array[String]):Unit=
    {
        println("Total minites:"+total_time(8,7))   // I pass the time(min) per km
    }

    def easy_pace(x:Int):Double=  //this is the calculate time for go to the 2km as easy pace
    { 
        return 2.08 * x
    }

    def tempo_type(y:Int):Double=  //this is the calculate time for go to the 3km as tempo time
    {
        return 3.0 * y
    }

    def total_time(x:Int,y:Int):Double=    //this is the formular calculate the total time
    {
        return easy_pace(x)+tempo_type(y)+easy_pace(x)
    }
}
