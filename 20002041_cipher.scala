object Cipher extends App{
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val encrypt=(char:Char,key:Int,alpha:String)=>alpha((alpha.indexOf(char.toUpper)+key)%alpha.size)
    val decrypt=(char:Char,key:Int,alpha:String)=>alpha((alpha.indexOf(char.toUpper)-key)%alpha.size)

    val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,alpha:String)=>s.map(algo(_,key,alpha))

    val cipher_text1=cipher(encrypt,"Hello",5,alphabet)
    val plain_text1=cipher(decrypt,cipher_text1,5,alphabet)

    println(cipher_text1)
    println(plain_text1)

    val cipher_text2=cipher(encrypt,"Apple",10,alphabet)
    val plain_text2=cipher(decrypt,cipher_text2,10,alphabet)

    println(cipher_text2)
    println(plain_text2)

    


}