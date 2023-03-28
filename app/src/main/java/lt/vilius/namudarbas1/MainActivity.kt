package lt.vilius.namudarbas1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    final val TAG: String = "LogInformation_TAG"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val byteValue :Byte = Byte.MAX_VALUE
        val shortValue : Short = Short.MAX_VALUE
        val intValue : Int = Int.MAX_VALUE
        val longValue : Long = Long.MAX_VALUE
        Log.i(TAG, "Max Byte Value: $byteValue ; Max Short value: $shortValue ; Max Int Value $intValue ; " +
                "Max Long value: $longValue")
        val sumValue = byteValue + shortValue + intValue + longValue
        Log.i(TAG, "Sum of all max values: $sumValue")
        val floatValue : Float // Referencijos?
        val doubleValue : Double // Referencijos??
        val charFirst : Char = '\u0088'
        val charSecond : Char = '%'
        val starSignCode = '*'.code
        val byteIsMoreThanInt = byteValue > intValue
        val sumNotEqualsLong = sumValue != longValue
        Log.i(TAG, "Char '88' value: $charFirst ; Char '%' value : $charSecond ; star sign code: $starSignCode")
        Log.i(TAG, "Byte is more than int: $byteIsMoreThanInt ; max sum doesn't equal to Long max value:" +
                "$sumNotEqualsLong")
    }
}