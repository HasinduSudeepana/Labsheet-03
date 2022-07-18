object Q5
{
    def main(args:Array[String]):Unit=
    {
        println("Total minites:"+total_time(8,7))
    }

    def easy_pace(x:Int):Double=
    {
        return 2.0/x
    }

    def tempo_type(y:Int):Double=
    {
        return 3.0/y
    }

    def total_time(x:Int,y:Int):Double=
    {
        return easy_pace(x)+tempo_type(y)+easy_pace(x)
    }
}