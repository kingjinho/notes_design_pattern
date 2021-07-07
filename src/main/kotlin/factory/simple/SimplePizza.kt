package factory.simple

class SimplePizza : Pizza {
    override fun prepare() {
        println("Preparing ${this.javaClass.canonicalName}")
    }

    override fun bake() {
        println("Baking ${this.javaClass.canonicalName}")
    }

    override fun cut() {
        println("Cutting ${this.javaClass.canonicalName}")
    }

    override fun box() {
        println("Packaging ${this.javaClass.canonicalName}")
    }

}