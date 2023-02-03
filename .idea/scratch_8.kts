import java.lang.Exception
import javax.swing.JOptionPane

/*
var i = 10
while(i<=10){
    println("i = ${i}")
}
*/

try {
    var repeticiones= JOptionPane.showInputDialog("Pon el numero de repeticiones que quieres").toInt()
    var i = 1
    while(i<=repeticiones){
        println("i = ${i}")
        i++
    }
}
catch (e:Exception){
    println("tu error esta en ${e}")
}

