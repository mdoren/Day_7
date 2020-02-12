fun main(){
    var ans1 = "B"
    var ans2 = "A"
    var ans3 = "D"
    var ans4 = "C"
    var ans5 = "B"
    var counter = 0
    println("Super Smash Bros. Quiz")
    println("Question 1: Which installment in the Smash Bros. franchise introduced Bowser as a playable fighter?")
    println("A. Super Smash Bros.")
    println("B. Super Smash Bros. Melee")
    println("C. Super Smash Bros. Brawl")
    println("D. Super Smash Bros. for Wii U/3DS")
    println("E. Super Smash Bros. Ultimate")
    var response1 = readLine()!!.toLowerCase().capitalize()

    if (response1 == ans1) {
        println("Correct! \n")
        counter++
    }
    else
        println("Incorrect. The correct answer was Super Smash Bros. Melee. \n")

    println("Question 2: Which of these characters is universally accepted to be the best character in Super Smash Bros. Brawl?")
    println("A. Meta Knight")
    println("B. Ice Climbers")
    println("C. Snake")
    println("D. Fox")
    var response2 = readLine()!!.toLowerCase().capitalize()

    if (response2 == ans2) {
        println("Correct! \n")
        counter++
    }
    else
        println("Incorrect. The correct answer was Meta Knight.\n ")

    println("Question 3: Which of these characters were the first DLC character in Super Smash Bros. for Wii U/3DS?")
    println("A. Cloud")
    println("B. Ryu")
    println("C. Bayonetta")
    println("D. Mewtwo")
    var response3 = readLine()!!.toLowerCase().capitalize()

    if (response3 == ans3) {
        println("Correct! \n")
        counter++
    }
    else
        println("Incorrect. The correct answer was Mewtwo, who first appeared in Melee and was absent in Brawl. \n")

    println("Question 4: Which of these advanced techniques in Melee is used to cut the lag of an aerial in half while landing?")
    println("A. Crouch Canceling")
    println("B. Wavedashing")
    println("C. L-Canceling")
    println("D. Shield Dropping")
    var response4 = readLine()!!.toLowerCase().capitalize()

    if (response4 == ans4) {
        println("Correct! \n")
        counter++
    }
    else
        println("Incorrect. L-Canceling is done by pressing L within seven frames of landing with an aerial attack. \n")

    println("Question 5: Which of these players won an EVO without dropping a single game to another player?")
    println("A. Armada: Melee EVO 2015")
    println("B. ZeRo: Smash for Wii U EVO 2015")
    println("C. Ken: Melee EVO 2007")
    println("D. MKLeo: Ultimate EVO 2019")
    var response5 = readLine()!!.toLowerCase().capitalize()

    if (response5 == ans5) {
        println("Correct! \n")
        counter++
    }
    else
        println("Incorrect. ZeRo is the only Smash player to win an entire EVO tournament without dropping a game. \n")

    println("You answered ${counter} questions correctly.")
    if (counter == 5)
        println("You answered every question correctly, nice job!")
}