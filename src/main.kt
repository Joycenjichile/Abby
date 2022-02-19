fun main(){
   printabby()
    var result=getReminder(7,3)
    println(result)
    var sum=add(3,8,5,4,)
    println(sum)
    printinterestingFact("music")


}

fun printabby(){
    println("Hello abby")
}
fun getReminder(number1: Int,number2: Int): Int{
    var modulus=number1%number2
    return modulus

}
fun add(num1: Int,num2: Int,num3: Int,num4: Int):Int{
    var sum=(num1+num2+num3+num4)
    return sum
}
fun printinterestingFact(fact: String){
    println("I love" + " " + fact)
}







