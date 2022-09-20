package com.example.calculator


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.CalculatorTheme

class DataClass()
{
    // Buttons text
    companion object{
        val button_sign_list = listOf(
            "*",
            "+",
            "-",
            "/",
            "%",
        )
        val button_int_list  = listOf(
            "0",
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9"
        )
    }
    /////////
}
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(Modifier.padding(Dp(5F))){
        Text(text = "Hello $name!\n")
        Text(text = "Hello $name!")
    }
}
@Composable
fun Card() {
    Card(
        modifier = Modifier
            .padding(PaddingValues(Dp(5F)))
            .border(Dp(2F), Color.Black, RectangleShape)
            .fillMaxWidth(),
        backgroundColor = Color.Cyan,
        elevation = Dp(60F),
    )
    {
        Greeting("Android")
    }
}
@Composable
fun CustomButton(
    txt:String,
    mod:Modifier,
    onClick: ()-> Unit,
    color: Color = Color.White
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(RoundedCornerShape(100.dp))
            .background(color)
            .clickable {
                onClick()
            }
            .then(mod)
    ) {
        Text(
            text = txt,
            fontSize = 36.sp,
            color = color
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CalculatorTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Column()
           {
                Row() {
                    Card()
                }
                Row() {
                    Column(modifier = Modifier.padding(10.dp))  {
                        for(i in DataClass.button_int_list) {

                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .weight(weight = 5f + i.toFloat(), fill = false,)
                                    .padding(5.dp)




                            )
                            {
                                Text(text = i)
                            }
                        }
                    }
                }

//                    for(i in DataClass.button_sign_list){
//                        Button(onClick = {}, modifier = Modifier.weight(weight = 5f,
//                            fill = false)) {
//                            Text(text = i)
//                        }
//
//                    }

                }
            }

        }
}