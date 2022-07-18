object Q5
{
    def main(args:Array[String]):Unit=
    {
        println("Total minites:"+total_time(8,7))   // I pass the time(min) per km
    }

    def easy_pace(x:Int):Int=  //this is the calculate time for go to the 2km as easy pace.
    { 
        return 2 * x
    }

    def tempo_type(y:Int):Int=  //this is the calculate time for go to the 3km as tempo time.
    {
        return 3 * y
    }

    def total_time(x:Int,y:Int):Int=    //this is the formular calculate the total time
    {
        return easy_pace(x)+tempo_type(y)+easy_pace(x)  //can be calculate the total value, return value of easy pase + return value of tempo pace
    }
}
