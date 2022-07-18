object Q4
{
    def main (args:Array[String]):Unit=
    {
        println("Total cost for books:"+total_cost(60))
    }

    def total_bookprice(x:Int):Double=
    {
        return x*24.95
    }

    def book_cost(y:Double):Double=
    {
        return y*0.6
    }

    def shipping_cost(x:Int):Double=
    {
        return (x*3)+((x-50)*.75)
    }
    def total_cost(x:Int):Double=
    {
        book_cost(total_bookprice(60))+ shipping_cost(60)
    }
}