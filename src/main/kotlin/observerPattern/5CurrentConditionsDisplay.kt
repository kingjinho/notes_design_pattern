package observerPattern

class `5CurrentConditionsDisplay`(weatherData: `1Subject`) : `3DisplayElement`, `2Observer` {

    private var temperature = 0f
    private var humidity = 0f
    private var weatherData : `1Subject`? = weatherData

    init {
        weatherData.registerObserver(this)
    }

    override fun display() {
        println("Current Conditions: ${temperature}F degrees and ${humidity}% humidity")
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity =humidity
        display()
    }
}