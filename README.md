# Dagger

Dagger is a fully static, compile-time dependency injection framework for Java, Kotlin, and Android
It is created by Square and now maintained by Google. we use it to automate DI for our application

### Meaning of dependency and injection

if class is depend on anther class like `Class A`  is depend on `Class B` that mean class A has
reference of Class B like this image Injection simply means passing dependency from outside class
the idea

# benefits of Dagger

- Reduce boilerplate code
- Decoupled build dependencies
- improving testing | Classify Dependency |:---------------------------:| :
  | ![](images/ic_dependancy.png)

### example how dagger reduce boilerplate code

```kotlin
   class Care(val engine: Engine, val wheels: Wheels) {
    fun drive() {

    }
}
```

```kotlin
   fun mai() {
    val blocks = Block()
    val cylinder = Cylinder()
    val engine = Engine(blocks, cylinder)
    val wheals = Whelas(Tires(), Rimes())
    val car = car(engine, wheals)
}
```

## using dagger will reduce

```kotlin
   fun mai() {
    val carComponet = DaggerCarComponent.create()
    val car = carComponet.getCar()
}
```

class car depend on two class engine and wheels let is start how dagger work to provide automated
dependency

`Dependancy ` this provide using annotation `@Inject` you can add it for classes can edit on them
another way using `@Module` and you can provide object using `@provides`
` Creator ` that responsible for create DAG Dependency Ayclic Graph using annotation `@Component`

### example create dependency for object Car according this graph

![](images/dag.png)

## create Dependency

- first create CareComponent as interface this is backbone initialize
   ```kotlin @Component interface CareComponent { fun getCar():Care }```
##How dagger work
- First using injection annotation  `@inject` if you can inject Constructor for this class for example `Car`,`Engine`
- second using class module and annotation `@Module` above class and add this class to modules for component to know another way provide object check `WhealsModule` 
   and using `@provides` top the method provide object 
```kotlin
   @Module
class WhealsModule {

    @Provides
    fun provideRimes(): Rimes = Rimes()
}
```
- we can use `@Binds` with module that provide instance for abstraction class like `PetrolEngineModule`
- we can inject value of object at run time that check file `DiesleEngineModule`
- another way bind value at runtime create your specfic builder for daggerComponent we will create interface inside
 ```kotlin
   @Component.Builder
    interface Builder {
        @BindsInstance
        fun bindHorseBower(horsePower: Int)   // this value bind any int if object need inject an int value 
        fun getComponent(): CareComponent
    }
```