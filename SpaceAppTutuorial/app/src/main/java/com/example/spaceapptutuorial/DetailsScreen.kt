package com.example.spaceapptutuorial

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spaceapptutuorial.ui.theme.BlackBackground
import com.example.spaceapptutuorial.ui.theme.DisplayBoxColor
import com.example.spaceapptutuorial.ui.theme.StarYellow
import com.example.spaceapptutuorial.ui.theme.TextWhite
import com.example.spaceapptutuorial.ui.theme.bebasneue
import com.example.spaceapptutuorial.ui.theme.inter

@Preview
@Composable
fun DetailsScreen() {
    Box(
        modifier = Modifier
            .background(BlackBackground)
            .fillMaxSize()
            .padding(top = 10.dp)
    ) {
        LazyColumn {
            item {
                TopNavRow()
                WorldView()
                WorldViewRatingsRow()
                InformationSection()
                FactsInfoSection()
                FactsVideoSection()
            }
        }
    }
}

@Composable
fun TopNavRow() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
//        back button
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                contentDescription = "backArrowIcon",
                tint = Color.White,
                modifier = Modifier
                    .size(28.dp)
            )
            Text(
                text = "back",
                style = MaterialTheme.typography.bodyLarge,
                color = TextWhite,
            )
        }
        Box(
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_bookmark_border_24),
                contentDescription = "bookmark",
                tint = Color.White,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(45.dp)
                    .background(StarYellow)
                    .padding(10.dp)
            )

        }
    }
}

@Composable
fun WorldView(

) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
    ) {
        Box() {
            Image(
                painter = painterResource(id = R.mipmap.earth_foreground),
                contentDescription = "EarthImage",
                modifier = Modifier
                    .size(350.dp)
            )
        }
    }
}

@Composable
fun WorldViewRatingsRow(

) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 20.dp, end = 20.dp)
    ) {
        Text(
            text = "Planet",
            style = MaterialTheme.typography.bodyLarge,
            color = TextWhite,
            fontSize = 14.sp,
        )
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.End,
        ) {
            Row {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_star_24),
                    contentDescription = "RatingStar",
                    tint = Color.Yellow
                )
                Text(
                    text = "4.8",
                    style = MaterialTheme.typography.bodyLarge,
                    color = TextWhite,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
            Row {
                Text(
                    text = "8 Billion Reviews",
                    color = TextWhite,
                    fontSize = 10.sp,
                )
            }
        }

    }
}

@Composable
fun InformationSection(

) {
    Row(
        modifier = Modifier
            .padding(start = 20.dp)
    ) {
        Text(
            text = "Earth",
            style = MaterialTheme.typography.headlineLarge,
            color = TextWhite,
            fontFamily = bebasneue
        )
    }
    Row(
        modifier = Modifier
            .padding(start = 20.dp, end = 20.dp)
    ) {
        Text(
            text = "Nestled in the vastness of space, Earth is the third planet from the Sun and the only known celestial body to harbour life (so far). With its diverse ecosystems, ranging from lush forests to expansive deserts, and its vast oceans teeming with life, Earth is a vibrant oasis in the cosmos. Its atmosphere provides the perfect conditions for a rich tapestry of flora and fauna, making it a haven for countless species, including humans. From the highest peaks to the deepest ocean trenches, Earth's beauty and biodiversity inspire awe and reverence, earning it the nickname \"The Blue Jewel\" of the solar system.",
            color = TextWhite,
            fontSize = 12.sp,
            fontFamily = inter,
        )
    }
}

@Composable
fun FactsInfoSection() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 20.dp, end = 20.dp)
    ) {
        Row(
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .background(DisplayBoxColor)
                .padding(10.dp)
                .width(150.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Column {
                    Text(
                        text = "74%",
                        color = TextWhite,
                        fontSize = 32.sp,
                        fontFamily = bebasneue
                    )
                    Text(
                        text = "H20 Surface Coverage",
                        color = TextWhite,
                        fontSize = 10.sp,
                        fontFamily = inter,
                    )
                }
                Icon(
                    painter = painterResource(id = R.drawable.baseline_water_drop_24),
                    contentDescription = "Drop",
                    tint = Color.White,
                    modifier = Modifier
                        .size(40.dp)
                )
            }
        }
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .background(DisplayBoxColor)
                .padding(10.dp)
                .width(150.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Column {
                    Text(
                        text = "74%",
                        color = TextWhite,
                        style = MaterialTheme.typography.bodyLarge,
                        fontSize = 32.sp,
                        fontFamily = bebasneue
                    )
                    Text(
                        text = "Technology Advancement",
                        color = TextWhite,
                        style = MaterialTheme.typography.bodySmall,
                        fontSize = 10.sp,
                        fontFamily = inter,
                    )
                }
                Icon(
                    painter = painterResource(id = R.drawable.chipiconsvg),
                    contentDescription = "Chip",
                    tint = Color.White,
                    modifier = Modifier
                        .size(40.dp)
                )
            }
        }
    }
}

@Composable
fun FactsVideoSection() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(DisplayBoxColor)
            .padding(start = 20.dp, top = 10.dp, bottom = 10.dp, end = 10.dp)

    ) {
        Column {
            Text(
                text = "FACTS ABOUT EARTH",
                style = MaterialTheme.typography.headlineSmall,
                color = TextWhite,
                fontSize = 24.sp,
                fontFamily = bebasneue,
            )
            Text(
                text = "3 Videos Available",
                color = TextWhite,
                fontSize = 10.sp,
                fontFamily = inter,
            )
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Watch")
        }
    }
}