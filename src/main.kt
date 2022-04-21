fun main(){
    greeting("Gahigi")
    addition(4,2,1,3)
    interestingfacts()


}
/*invoking a function that takes in a name and prints out the name in a greeting*/
fun greeting(name:String){
    println("Hello"+" "+name)
}
/*invoking a function that prints a fun fact about myself*/
fun interestingfacts(){
    var fact="I love free verse"
    println(fact)
}



/*invoking a function that given two numbers returns the remainder of the division
fun findReminder(a:Int, b:Int):Int{
    var modulus=a%b
    return modulus*/
/*invoking a function that gives the sum of four numbers*/
fun addition(a:Int,b:Int,c:Int,d:Int){
    var sum= a+b+c+d
    println(sum)
}
