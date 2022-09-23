package com.example.calculator


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*


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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.onSecondary
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
            .padding(24.dp)
            .fillMaxWidth()
            .border(Dp(2F), Color.Black, RectangleShape),

        backgroundColor = Color.Cyan,
        elevation = Dp(70F),

    )
    {

        Greeting(StateClass.firstOper.toString())


    }
}
@Composable
fun CustomButton(
    txt:String,
    modifier:Modifier,
    onClick: ()-> Unit,

) {
    Box(

        contentAlignment = Alignment.Center,
        modifier = Modifier
            .padding(8.dp)
            .clip(RoundedCornerShape(100.dp))
            .background(Color.Gray)
            .clickable {
                onClick()
            }
            .then(modifier),


    ) {
        Text(

            text = txt,
            fontSize = 36.sp,
            color = Color.Black
        )
    }
}
@Composable
fun Custom_Row(
 firstButton:String,
 secondButton:String,
 ThirdButton:String,
 fourButton:String
){
    Row(modifier = Modifier.fillMaxWidth()) {
        CustomButton(firstButton,
            modifier = Modifier
                .weight(weight = 1f),
            onClick = {}
        )
        CustomButton(secondButton,
            modifier = Modifier
                .weight(weight = 1f),
            onClick = {}
        )
        CustomButton(ThirdButton,
            modifier = Modifier

                .weight(weight = 1f),


            onClick = {}
        )
        CustomButton(fourButton,
            modifier = Modifier
                .weight(weight = 1f),
            onClick = {}
        )
    }
}
@Composable
fun Key_Board()
{

    Custom_Row("1","2","3","X")
    Custom_Row("4","5","6","/")
    Custom_Row("7","8","9","+")
    Row(modifier = Modifier.fillMaxWidth()) {
        CustomButton("C",
            modifier= Modifier
                .weight(weight = 2f)
                .padding(5.dp),

            onClick = {}
        )

        CustomButton("0",
            modifier= Modifier
                .weight(weight = 2f)
                .padding(10.dp),
            onClick = {}
        )
        CustomButton("-",
            modifier= Modifier
                .weight(weight = 2f)
                .padding(5.dp),
            onClick = {}
        )
    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    val test = StateActivity()
    test.analitic("1+2+3*4/(12-6)")
    CalculatorTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Column(Modifier.fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally)
           {
               Card()
               Key_Board()
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