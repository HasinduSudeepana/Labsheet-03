object Q4
{
    def main (args:Array[String]):Unit=
    {
        println("Total cost for books:"+total_cost(60))  //i pass the one value it is no of books 
    }

    def total_bookprice(x:Int):Double=  //this is the calculate formular total book price
    {
        return x*24.95
    }

    def book_cost(y:Double):Double= //In this case i get the already book cost(reduce the book discount)
    {
        return y*0.6
    }

    def shipping_cost(x:Int):Double= //this is the calculate formular of shipping cost
    {
        return (x*3)+((x-50)*.75)  //Rs 3 for first book 50 and Rs 3.75 for each additional copy
    }
    def total_cost(x:Int):Double=
    {
        book_cost(total_bookprice(60))+ shipping_cost(60)  //this is the formular how to calculate the total cost 
    }
}
