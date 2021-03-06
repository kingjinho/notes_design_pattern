package observer

class CurrentConditionsDisplay(weatherData: Subject) : DisplayElement, Observer {

    private var temperature = 0f
    private var humidity = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun display() {
        println("Current Conditions: ${temperature}F degrees and ${humidity}% humidity")
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }
}