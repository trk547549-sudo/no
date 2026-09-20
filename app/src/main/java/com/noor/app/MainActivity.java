package com.noor.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {

    LinearLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        home();
    }

    TextView title(String text) {
        TextView t = new TextView(this);
        t.setText(text);
        t.setTextSize(26);
        t.setGravity(Gravity.CENTER);
        t.setPadding(10, 25, 10, 25);
        t.setTextColor(Color.rgb(20, 80, 60));
        return t;
    }

    Button button(String text) {
        Button b = new Button(this);
        b.setText(text);
        b.setTextSize(18);
        b.setAllCaps(false);
        return b;
    }

    void home() {
        main = new LinearLayout(this);
        main.setOrientation(LinearLayout.VERTICAL);
        main.setGravity(Gravity.CENTER);
        main.setPadding(20, 20, 20, 20);

        ScrollView scroll = new ScrollView(this);
        scroll.addView(main);
        setContentView(scroll);

        main.addView(title("☀️ نور"));
        main.addView(title("رفيقك للقرآن والذكر"));

        Button quran = button("📖 القرآن الكريم");
        quran.setOnClickListener(v -> quran());
        main.addView(quran);

        Button azkar = button("🤲 الأذكار والأدعية");
        azkar.setOnClickListener(v -> azkar());
        main.addView(azkar);

        Button tasbih = button("📿 المسبحة الإلكترونية");
        tasbih.setOnClickListener(v -> tasbih());
        main.addView(tasbih);

        Button about = button("ℹ️ حول نور");
        about.setOnClickListener(v -> about());
        main.addView(about);
    }

    void quran() {
        main.removeAllViews();
        main.addView(title("📖 القرآن الكريم"));

        TextView text = title(
            "سورة الفاتحة\n\n" +
            "بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ\n\n" +
            "الْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ\n\n" +
            "الرَّحْمَٰنِ الرَّحِيمِ\n\n" +
            "مَالِكِ يَوْمِ الدِّينِ"
        );

        text.setTextSize(21);
        main.addView(text);

        Button back = button("⬅️ الرئيسية");
        back.setOnClickListener(v -> home());
        main.addView(back);
    }

    void azkar() {
        main.removeAllViews();
        main.addView(title("🤲 الأذكار والأدعية"));

        TextView text = title(
            "سبحان الله وبحمده\n\n" +
            "سبحان الله العظيم\n\n" +
            "الحمد لله\n\n" +
            "الله أكبر\n\n" +
            "لا إله إلا الله"
        );

        text.setTextSize(22);
        main.addView(text);

        Button back = button("⬅️ الرئيسية");
        back.setOnClickListener(v -> home());
        main.addView(back);
    }

    void tasbih() {
        main.removeAllViews();
        main.addView(title("📿 المسبحة الإلكترونية"));

        TextView count = title("0");
        count.setTextSize(50);
        main.addView(count);

        Button add = button("تسبيح +1");
        add.setOnClickListener(v -> {
            int n = Integer.parseInt(count.getText().toString());
            count.setText(String.valueOf(n + 1));
        });
        main.addView(add);

        Button reset = button("إعادة العداد");
        reset.setOnClickListener(v -> count.setText("0"));
        main.addView(reset);

        Button back = button("⬅️ الرئيسية");
        back.setOnClickListener(v -> home());
        main.addView(back);
    }

    void about() {
        main.removeAllViews();
        main.addView(title("ℹ️ حول نور"));

        main.addView(title(
            "💬 نور\n\n" +
            "تطبيق ديني يعمل بدون إنترنت\n\n" +
            "👨‍💻 مطور التطبيق:\n" +
            "علاء العمراني\n" +
            "ala alamrany\n\n" +
            "✉️ hamdalmrany833@gmail.com"
        ));

        Button back = button("⬅️ الرئيسية");
        back.setOnClickListener(v -> home());
        main.addView(back);
    }
}
