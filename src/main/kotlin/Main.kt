fun main(args: Array<String>) {

    var not1= 0.0
    var not2 = 0.0
    var not3 = 0.0
    var not4 = 0.0

    print("Digite o valor da sua primeira nota: ")
    not1 = readLine()!!.toDouble()
    print("Digite o valor da sua segunda nota: ")
    not2 = readLine()!!.toDouble()
    print("Digite o valor da sua terceira nota: ")
    not3 = readLine()!!.toDouble()
    print("Digite o valor da sua quarta nota: ")
    not4 = readLine()!!.toDouble()

    var med = (not1 + not2 + not3 + not4) / 4.0

    if ( med > 0 && med <= 4){
        println("Reprovado. Com uma média de $med")
    }else if(med > 4 && med <= 5){
        println("Regular. Com uma média de $med")
    }else if(med > 5 && med <= 8) {
        println("Bom. Com uma média de $med")
    }else if(med > 8 && med <= 10) {
        println("Excelente! Com uma média de $med")
    }else{
        println("Média inválida")
    }




}