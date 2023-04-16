fun main(){
    var dog1 = Dog("Jack",12,"Bulldog")
    var dog2 = Dog("Leo",22,"Husky")
    var cat1 = Cat("Kitty", 8, "white")
    var cat2 = Cat("lucy", 20, "black")
    var animalsList = listOf(dog1, dog2, cat1, cat2)

    animalIntroduction(animalsList)

    for (item in animalsList){
        item.sleep()
    }

    println(isOld(dog2))
}

open class Animal(var name: String, var age: Int){
    fun sleep(){
        println("$name is sleeping now! Zzz!")
    }
}

class Dog(name: String, age: Int, var breed: String):Animal(name, age){
    fun bark()= println("$name: Woof Woof!")
}

class Cat(name: String, age: Int, var color: String):Animal(name, age){
    fun scratch()= println("$name: |||  |||")
}

fun animalIntroduction(animalsList:List<Animal>){
    for (item in animalsList){
        if (item is Dog){
            println("${item.name}, ${item.breed}")
        }
        else if (item is Cat){
            println("${item.name}, ${item.color}")
        }
    }
}

fun isOld(animal:Animal):Boolean{
    return animal.age >20
}