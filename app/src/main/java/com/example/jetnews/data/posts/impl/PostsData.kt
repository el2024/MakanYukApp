/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("ktlint:max-line-length") // String constants read better
package com.example.jetnews.data.posts.impl

import com.example.jetnews.R
import com.example.jetnews.model.Markup
import com.example.jetnews.model.MarkupType
import com.example.jetnews.model.Metadata
import com.example.jetnews.model.Paragraph
import com.example.jetnews.model.ParagraphType
import com.example.jetnews.model.Post
import com.example.jetnews.model.PostAuthor
import com.example.jetnews.model.PostsFeed
import com.example.jetnews.model.Publication

/**
 * Define hardcoded posts to avoid handling any non-ui operations.
 */

val pietro = PostAuthor("Budi Mulia", "https://medium.com/@pmaggi")
val manuel = PostAuthor("Evie Mulyadi", "https://medium.com/@manuelvicnt")
val florina = PostAuthor(
    "Florina Abdi",
    "https://medium.com/@florina.muntenescu"
)
val jose =
    PostAuthor("Karina Barukah", "https://medium.com/@JoseAlcerreca")

val publication = Publication(
    "Makan Yuk!",
    "https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0"
)
val paragraphsPost1 = listOf(
    Paragraph(
        ParagraphType.Text,
        "Did you know that ayam bakar literally translates to “grilled chicken?” This dish is a charcoal-grilled chicken breast simmered in a pot with herb (rempah) or spices (bumbu)."
    ),
    Paragraph(
        ParagraphType.Text,
        "The sauce in which the chicken is cooking gets reduced, and then the meat is grilled until it develops a caramelized color."
    ),
    Paragraph(
        ParagraphType.Text,
        "Ayam Bakar is usually served with cucumber slices, white rice, tomatoes and glazed with an Indonesian sweet soy sauce."
    ),
    Paragraph(
        ParagraphType.Subhead,
        "Ingredients"
    ),
    Paragraph(
        ParagraphType.CodeBlock,
        """
        1 Store-bought instant paste
        2 Chicken Legs drum and thigh
        200 ml Coconut Milk
        1 Tbsp Sweet Indonesian soy sauce (Kecap manis)
        Cooked Rice
        1 Spring Onion
        """.trimIndent()
    ),
    Paragraph(
        ParagraphType.Subhead,
        "Cooking Directions"
    ),
    Paragraph(
        ParagraphType.Text,
        "1. Get your pan on the stove and heat it up. Add in the curry paste and saute.\n" +
                "2. Keep sauteing the paste for a little bit, and then add in some coconut milk. Gradually add the milk until a paste is formed.\n" +
                "3. Add the sweet soy sauce (kecap manis) to the pan. Mix it well, and bring it to a simmer.\n" +
                "4. Place chicken legs in the sauce. Once done, cover your pan and let it cook for 15 minutes.\n" +
                "5. Flip chicken when it’s halfway through your timer. Once it’s done, put the chicken aside. Now, let the sauce cook until it thickens.\n" +
                "6. Mix sweet soy sauce (kecap manis) in a small bowl with one spoon of the sauce. This will be used as a glaze for the chicken.\n" +
                "7. It’s time to grill that chicken, but ensure to glaze it with the glaze mixture on both sides for maximum flavor.\n" +
                "8. Chicken is done when it’s nice and charred.\n" +
                "9. In a bowl, add rice and pour one spoonful of that sauce all over the rice.\n" +
                "10. Add the chicken on top, glaze it and top it off with some chopped spring onions.\n" +
                "11. Enjoy the traditional taste of Indonesian grilled chicken.\n"
        )
)

val paragraphsPost2 = listOf(
    Paragraph(
        ParagraphType.Text,
        "The literal translation of Nasi Goreng is “fried rice” in Indonesian and Malaysian – and that’s exactly what it is! It’s mainly rice with just a little bit of meat and just onion for the vegetables."
    ),
    Paragraph(
        ParagraphType.Text,
        "The thing that distinguishes it from other Fried Rice dishes is the sauce which is made with kecap manis, a sweet soy sauce that stains the rice dark brown and caramelises the rice when it cooks.."
    ),
    Paragraph(
        ParagraphType.Text,
        "Typically it’s served with a sunny side up egg (love how the yolk runs into the rice!) and a side of fresh cucumber and tomato (no dressing) to make a meal of it."
    ),
    Paragraph(
        ParagraphType.Subhead,
        "Ingredients"
    ),
    Paragraph(
        ParagraphType.CodeBlock,
        """
        CHICKEN
        ▢1 tbsp oil
        ▢5 oz / 150g chicken breast , thinly sliced (or other protein)
        ▢1 tbsp kecap manis (sweet soy sauce)
        
        RICE
        ▢1.5 tbsp oil
        ▢2 garlic cloves , finely chopped
        ▢1 tsp red chilli , finely chopped
        ▢1 onion , small, diced
        ▢3 cups cooked white rice , day old, cold 
        ▢2 tbsp kecap manis (sweet soy sauce)
        ▢2 tsp shrimp paste , optional
        
        GARNISHES / SIDE SERVINGS (OPTIONAL)
        ▢4 eggs , fried to taste
        ▢1 green onion , sliced
        ▢Tomatoes and cucumbers, cut into wedges/chunks
        ▢Fried shallots , store bought (optional)
        ▢Lime wedges
        """.trimIndent()
    ),
    Paragraph(
        ParagraphType.Subhead,
        "Cooking Directions"
    ),
    Paragraph(
        ParagraphType.Text,
        "1. Heat oil in a large skillet or wok over high heat.\n" +
                "2. Add chilli and garlic, stir for 10 seconds.\n" +
                "3. Add onion, cook for 1 minute.\n" +
                "4. Add chicken, cook until it mostly turns white, then add 1 tbsp kecap manis and cook for a further 1 minute or until chicken is mostly cooked through and a bit caramelised.\n" +
                "5. Add rice, 2 tbsp kecap manis and shrimp paste, if using. Cook, stirring constantly, for 2 minutes until sauce reduces down and rice grains start to caramelise (key for flavour!).\n" +
                "6. Serve, garnished with garnishes of choice (green onions, red chilli, fried shallots).\n" +
                "7. Serve with a fried egg sunny side up (runny yolk!), tomato wedges and slices of cucumber on the side.\n"
    )
)

val paragraphsPost3 = listOf(
    Paragraph(
        ParagraphType.Text,
        "Sayur asem or vegetables in tamarind soup is arguably Indonesia’s most popular vegetable soup."
    ),
    Paragraph(
        ParagraphType.Text,
        "This Sundanese soup is packed with plenty of fresh vegetables. The broth is extremely flavorful, with spiciness from chilies, sourness from tamarind and tomatoes, freshness from lemongrass, earthiness from ginger and galangal, and bold umami from terasi/belacan/shrimp paste."
    ),
    Paragraph(
        ParagraphType.Text,
        "There is no set rule to what should and should not be included in a proper sayur asem, but the more popular vegetables you will find include cabbage, chayote, young jackfruit, snake beans, corn, tomatoes, melinjo seeds, and melinjo leaves (or substitutes)."
    ),
    Paragraph(
        ParagraphType.Subhead,
        "Ingredients"
    ),
    Paragraph(
        ParagraphType.CodeBlock,
        """
        1/2 cup dry red skin peanuts, or 1 cup fresh melinjo nuts (Indonesian: buah melinjo)
        20 gram tamarind (Indonesian: asam Jawa)
        6 cup (1½ liter) water
        2 lemongrass (Indonesian: sereh), bruised
        8 bay leaves (Indonesian: daun salam)
        60 gram coconut palm sugar (Indonesian: gula Jawa)
        1 teaspoon turmeric powder (Indonesian: kunyit)
        1 tablespoon salt
        1/2 teaspoon ground white pepper
        500 gram cabbage, cored and cut into bite sizes
        500 gram zucchini, or chayote (Indonesian: labu siam), 1-inch pieces
        100 gram green beans, or snake bean (Indonesian: kacang panjang), cut into 2-inch pieces
        1 corn (Indonesian: jagung), cut into 1 inch sections
        100 gram kale, or melinjo leaves (Indonesian: daun melinjo)
        2 tomatoes, quartered
        
        Grind the following into spice paste
        10 red chilies
        75 gram shallots
        3 cloves garlic
        5 candlenuts (Indonesian: kemiri), or macadamia nuts
        1 inch (25 gram) ginger
        1 inch (25 gram) galangal (Indonesian: lengkuas)
        10 gram (about ½ tablespoon) terasi/belacan/shrimp paste, toasted
        """.trimIndent()
    ),
    Paragraph(
        ParagraphType.Subhead,
        "Cooking Directions"
    ),
    Paragraph(
        ParagraphType.Text,
        "1. Boil dry peanuts topped with 2 inches of water in a pot. Reduce the heat to a simmer and cook for 1 hour, or until peanuts are soft. Drain and set aside.\n" +
                "2. Mix tamarind with half a cup of hot water. Stir to mix and when cool enough to handle, use fingers to massage the tamarind in the hot water to make tamarind paste/juice. Strain to remove pulps and seeds.\n" +
                "3. Boil water in a soup pot over medium-high heat. Add spice paste, tamarind juice, lemongrass, daun salam, coconut palm sugar, turmeric, salt, and ground white pepper. Cook until fragrant, about 5 minutes.\n" +
                "4. Add boiled peanuts. Reduce heat to a medium, cover the pot, and cook for 10 minutes.\n" +
                "5. Add cabbage, corn, zucchini, and green beans. Cook, covered, for another 15 minutes, or until the vegetables are tender.\n" +
                "6. Add kale and tomatoes. Cook until kale is wilted and the tomatoes are just starting to become soft, about 5 minutes.\n" +
                "7. Turn off the heat, taste test, and add more salt if needed. Serve the soup immediately with steamed white rice.\n"
    )
)

val paragraphsPost4 = listOf(
    Paragraph(
        ParagraphType.Text,
        "Beef rendang is one of the original cuisines of Minangkabau descent and Sumatra’s culture. It is served on special occasions to honor guests and during festive seasons. It is a delicious Indonesian dish prepared with many herbs and spices."
    ),
    Paragraph(
        ParagraphType.Text,
        "Slow cooking for a few hours until all the liquids have been completely absorbed by the meat. Beef rendang is best eaten with steamed rice and condiments such as fried onions and chili."
    ),
    Paragraph(
        ParagraphType.Subhead,
        "Ingredients"
    ),
    Paragraph(
        ParagraphType.CodeBlock,
        """
        1 kg beef
        600 ml coconut cream
        100 ml vegetable oil
        
        Paste, to blend (B)
        4 candlenuts
        12 cloves chopped garlic
        300 g red chili, or Serrano chili/pepper
        250 g onions
        50 g ginger
        50 g galangal
        25 g ground turmeric, or 50g of fresh turmeric
        1½ tsp ground coriander
        1 tbsp salt
        1 tsp sugar
        4 green cardamom pods
        11/2 tsp cumin seeds
        10 cloves
        
        Seasonings and Spices
        4 stalks lemongrass, bashed
        3 pieces kaffir lime leaves
        1 piece asam keping
        2 turmeric leaves, ,tied upn
        """.trimIndent()
    ),
    Paragraph(
        ParagraphType.Subhead,
        "Cooking Directions"
    ),
    Paragraph(
        ParagraphType.Text,
        "1. Cut the beef into 4 cm squares, half cm thick. Do not cut the beef too small as the meat can break into smaller pieces during cooking.\n" +
                "2. Blend all the ingredients in (B), set the paste aside.\n" +
                "3. Remove the green section and the outer sheath of the lemongrass. Use only the white portion. Bash them so that the lemongrass to ensure the release of the flavor.\n" +
                "4. Heat up the vegetable oil in a wok. Saute the spice paste (B) over low heat until aromatic.\n" +
                "5. Add the coconut cream, turmeric leaves, kaffir lime leaves, asam keping and lemongrass into the wok.\n" +
                "6. Add the beef and cook over medium heat. Bring the coconut milk to a boil.\n" +
                "7. Once it is boiled, continue simmer over low heat. Add water from time to time when the stew is about to dry.\n" +
                "8. Cook until the beef absorbs the flavor of the spices thoroughly and the color turns to dark brown. It will take about three hours.\n" +
                "9. Served with rice or bread.\n"
    )
)

val paragraphsPost5 = listOf(
    Paragraph(
        ParagraphType.Text,
        "Sayur asem or vegetables in tamarind soup is arguably Indonesia’s most popular vegetable soup."
    ),
    Paragraph(
        ParagraphType.Text,
        "This Sundanese soup is packed with plenty of fresh vegetables. The broth is extremely flavorful, with spiciness from chilies, sourness from tamarind and tomatoes, freshness from lemongrass, earthiness from ginger and galangal, and bold umami from terasi/belacan/shrimp paste."
    ),
    Paragraph(
        ParagraphType.Text,
        "There is no set rule to what should and should not be included in a proper sayur asem, but the more popular vegetables you will find include cabbage, chayote, young jackfruit, snake beans, corn, tomatoes, melinjo seeds, and melinjo leaves (or substitutes)."
    ),
    Paragraph(
        ParagraphType.Subhead,
        "Ingredients"
    ),
    Paragraph(
        ParagraphType.CodeBlock,
        """
        1/2 cup dry red skin peanuts, or 1 cup fresh melinjo nuts (Indonesian: buah melinjo)
        20 gram tamarind (Indonesian: asam Jawa)
        6 cup (1½ liter) water
        2 lemongrass (Indonesian: sereh), bruised
        8 bay leaves (Indonesian: daun salam)
        60 gram coconut palm sugar (Indonesian: gula Jawa)
        1 teaspoon turmeric powder (Indonesian: kunyit)
        1 tablespoon salt
        1/2 teaspoon ground white pepper
        500 gram cabbage, cored and cut into bite sizes
        500 gram zucchini, or chayote (Indonesian: labu siam), 1-inch pieces
        100 gram green beans, or snake bean (Indonesian: kacang panjang), cut into 2-inch pieces
        1 corn (Indonesian: jagung), cut into 1 inch sections
        100 gram kale, or melinjo leaves (Indonesian: daun melinjo)
        2 tomatoes, quartered
        
        Grind the following into spice paste
        10 red chilies
        75 gram shallots
        3 cloves garlic
        5 candlenuts (Indonesian: kemiri), or macadamia nuts
        1 inch (25 gram) ginger
        1 inch (25 gram) galangal (Indonesian: lengkuas)
        10 gram (about ½ tablespoon) terasi/belacan/shrimp paste, toasted
        """.trimIndent()
    ),
    Paragraph(
        ParagraphType.Subhead,
        "Cooking Directions"
    ),
    Paragraph(
        ParagraphType.Text,
        "1. Boil dry peanuts topped with 2 inches of water in a pot. Reduce the heat to a simmer and cook for 1 hour, or until peanuts are soft. Drain and set aside.\n" +
                "2. Mix tamarind with half a cup of hot water. Stir to mix and when cool enough to handle, use fingers to massage the tamarind in the hot water to make tamarind paste/juice. Strain to remove pulps and seeds.\n" +
                "3. Boil water in a soup pot over medium-high heat. Add spice paste, tamarind juice, lemongrass, daun salam, coconut palm sugar, turmeric, salt, and ground white pepper. Cook until fragrant, about 5 minutes.\n" +
                "4. Add boiled peanuts. Reduce heat to a medium, cover the pot, and cook for 10 minutes.\n" +
                "5. Add cabbage, corn, zucchini, and green beans. Cook, covered, for another 15 minutes, or until the vegetables are tender.\n" +
                "6. Add kale and tomatoes. Cook until kale is wilted and the tomatoes are just starting to become soft, about 5 minutes.\n" +
                "7. Turn off the heat, taste test, and add more salt if needed. Serve the soup immediately with steamed white rice.\n"
    )
)

val post1 = Post(
    id = "dc523f0ed25c",
    title = "Ayam Bakar",
    subtitle = "Traditional Indonesian Grilled Chicken",
    url = "https://makanyuk.com/ayambakar",
    publication = publication,
    metadata = Metadata(
        author = pietro,
        date = "",
        readTimeMinutes = 25
    ),
    paragraphs = paragraphsPost1,
    imageId = R.drawable.ayambakar,
    imageThumbId = R.drawable.ayambakar
)

val post2 = Post(
    id = "7446d8dfd7dc",
    title = "Nasi Goreng",
    subtitle = "Traditional Indonesian Fried Rice",
    url = "https://makanyuk.nasigoreng",
    publication = publication,
    metadata = Metadata(
        author = manuel,
        date = "",
        readTimeMinutes = 20
    ),
    paragraphs = paragraphsPost2,
    imageId = R.drawable.friedrice,
    imageThumbId = R.drawable.friedrice
)

val post3 = Post(
    id = "ac552dcc1741",
    title = "Sayur Asem",
    subtitle = "Vegetables in Tamarind Soup",
    url = "https://makanyuk.sayurasem",
    publication = publication,
    metadata = Metadata(
        author = florina,
        date = "1 hr",
        readTimeMinutes = 30
    ),
    paragraphs = paragraphsPost3,
    imageId = R.drawable.sayurasam,
    imageThumbId = R.drawable.sayurasam
)

val post4 = Post(
    id = "84eb677660d9",
    title = "Rendang Sapi Khas Indonesia",
    subtitle = "Indonesian Beef Rendang",
    url = "https://makanyuk.rendangsapi",
    publication = publication,
    metadata = Metadata(
        author = jose,
        date = "3 hrs",
        readTimeMinutes = 30
    ),
    paragraphs = paragraphsPost4,
    imageId = R.drawable.nasirendangpadang,
    imageThumbId = R.drawable.nasirendangpadang
)

val post5 = Post(
    id = "55db18283aca",
    title = "Sayur Asem",
    subtitle = "Vegetables in Tamarind Soup",
    url = "https://makanyuk.sayurasem",
    publication = publication,
    metadata = Metadata(
        author = florina,
        date = "",
        readTimeMinutes = 30
    ),
    paragraphs = paragraphsPost5,
    imageId = R.drawable.sayurasam,
    imageThumbId = R.drawable.sayurasam
)

val posts: PostsFeed =
    PostsFeed(
        highlightedPost = post4,
        recommendedPosts = listOf(post1, post2, post3),
        popularPosts = listOf(
            post5,
            post1.copy(id = "post6"),
            post2.copy(id = "post7")
        ),
        recentPosts = listOf(
            post3.copy(id = "post8"),
            post4.copy(id = "post9"),
            post5.copy(id = "post10")
        )
    )
