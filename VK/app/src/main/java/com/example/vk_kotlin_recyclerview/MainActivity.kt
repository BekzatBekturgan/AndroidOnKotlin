package com.example.vk_kotlin_recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(),NewsAdapter.RecyclerViewItemClick {

    lateinit var recyclerView : RecyclerView
    private var newsAdapter: NewsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        newsAdapter = NewsAdapter(GenerateNews(),itemClickListener = this)
        recyclerView.adapter = newsAdapter
    }

    override fun itemClick(position: Int, item: News)  {
        val intent = Intent(this, NewsDetailActivity::class.java)
        intent.putExtra("news", item)
        startActivity(intent)
    }

    private fun GenerateNews() : List<News>  {
        var newsBIG : MutableList<News> = ArrayList()
        var imageNames = arrayListOf<String>()
        var timeName = arrayListOf<String>()
        var contentNames = arrayListOf<String>()
        var images = arrayListOf<Int>()
        var contentImages = arrayListOf<Int>()

        imageNames.add("Высокие Технологии")
        timeName.add("час назад")
        contentNames.add("Дрон, замаскированный под колибри, чтобы снимать бабочек")
        images.add(R.drawable.logo)
        contentImages.add(R.drawable.colibri)

        imageNames.add("Высокие Технологии")
        timeName.add("час назад")
        contentNames.add("Китайская компания Xpeng Motors, которую Tesla обвинила в краже интеллектуальной собственности, представила свой электромобиль Xpeng P7\n" +
                "\n" +
                "Обещают запас хода в 706 км и крайне приятную цену.")
        images.add(R.drawable.logo)
        contentImages.add(R.drawable.car)

        imageNames.add("Высокие Технологии")
        timeName.add("час назад")
        contentNames.add("Портал iFixit выяснил, какие запчасти от iPhone 8 могут подойти для нового iPhone SE\n" +
                "\n" +
                "Так как уже только ленивый не назвал новый iPhone SE переделанным iPhone 8, специалисты из iFixit решили выяснить, насколько это правда.")
        images.add(R.drawable.logo)
        contentImages.add(R.drawable.p3)

        imageNames.add("Высокие Технологии")
        timeName.add("час назад")
        contentNames.add("Создана первая полноценная карта поверхности Луны\n" +
                "\n" +
                "Учёные из Геологической службы США и NASA использовали старые карты времён «Аполлона», дополнив их новыми данными.")
        images.add(R.drawable.logo)
        contentImages.add(R.drawable.p4)

        imageNames.add("Высокие Технологии")
        timeName.add("час назад")
        contentNames.add("Геймерский монитор Philips Momentum 345M1CR совсем скоро поступает в продажу\n" +
                "\n" +
                "Покупателей ждут изогнутая матрица на 34 дюйма, частота 144 Гц и прочие приятные фишки.")
        images.add(R.drawable.logo)
        contentImages.add(R.drawable.p5)

        imageNames.add("Высокие Технологии")
        timeName.add("час назад")
        contentNames.add("27 апреля случится анонс ноутбука RedmiBook 13 на базе процессоров Ryzen 4000\n" +
                "\n" +
                "Ожидаются неплохие характеристики и привлекательная цена.")
        images.add(R.drawable.logo)
        contentImages.add(R.drawable.p6)

        imageNames.add("Высокие Технологии")
        timeName.add("час назад")
        contentNames.add("С момента самой страшной и масштабной техногенной катастрофы прошло 34 года\n" +
                "\n" +
                "Ровно 34 года назад, 26 апреля 1986 года, в 1 час 23 минуты прогремел взрыв на четвертом энергоблоке Чернобыльской АЭС. Вечная память героям-ликвидаторам.")
        images.add(R.drawable.logo)
        contentImages.add(R.drawable.p7)

        imageNames.add("Высокие Технологии")
        timeName.add("час назад")
        contentNames.add("Представлены экологичные часы Fossil Solar\n" +
                "\n" +
                "Работа от энергии солнца, корпус из биопластика и пять ремешков в комплекте прилагаются. В продаже в мае.")
        images.add(R.drawable.logo)
        contentImages.add(R.drawable.p9)

        imageNames.add("Высокие Технологии")
        timeName.add("час назад")
        contentNames.add("В сети появилась подробная информация о характеристиках смартфона Velvet от LG\n" +
                "\n" +
                "Официальная презентация устройства состоится 7 мая в онлайн-трансляции. Примерная цена скорее всего составит \$650 (₽48 500).")
        images.add(R.drawable.logo)
        contentImages.add(R.drawable.p8)

        imageNames.add("Высокие Технологии")
        timeName.add("час назад")
        contentNames.add("Telegram побил своё рекордное число пользователей\n" +
                "\n" +
                "Теперь количество активных пользователей мессенджера составляет 400 миллионов, а последнее обновление добавило в Telegram ряд нововведений.    ")
        images.add(R.drawable.logo)
        contentImages.add(R.drawable.p10)

        for (i in  0..9){
            var news =  News(
                imageNames.get(i),
                timeName.get(i),
                contentNames.get(i),
                images.get(i),
                contentImages.get(i),
                i,
                i,
                i,
                i,
                0,
                R.drawable.ic_favorite_black
            )
            newsBIG.add(news)
        }
        return newsBIG
    }


}
