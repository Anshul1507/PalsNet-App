package friendship_day.codexonic.com.friendship_day;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class detail extends AppCompatActivity {
    private ImageView imageMain, imageFb, imageInsta, imageMail;
    private TextView textName, textDetail;
    private int passValue;
    private String url_fb, url_insta, url_mail, name, details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        textName = findViewById(R.id.text_name);
        textDetail = findViewById(R.id.text_details);
        imageMain = findViewById(R.id.image_main);
        imageFb = findViewById(R.id.image_fb);
        imageInsta = findViewById(R.id.image_insta_icon);
        imageMail = findViewById(R.id.image_mail_icon);

        imageFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fbRun();
            }
        });

        imageInsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                instaRun();
            }
        });

        imageMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mailRun();
            }
        });

        passValue = getIntent().getExtras().getInt("pass");
        if (passValue == 1) {
            imageMain.setImageResource(R.drawable.f1);
            name = "Vivek Maurya";
            details = "This Serious natured personality whom i met in my 1st year classroom, but my senses are wrong about his nature. This comes to mw know when in 2 yr we come in same hospital and seeing his beahviour, Totally changed behaviour, Amazing , Funny Personality and one of the best friend in my top friend list. Happy Friendship Day Bro.";
            url_fb = "https://www.facebook.com/vivek.maurya.7921";
            ;
            url_insta = "https://www.instagram.com/vivek_maurya_5555/";
            url_mail = "mailto: vivekmaurya5555@gmail.com";
        } else if (passValue == 2) {
            imageMain.setImageResource(R.drawable.f2);
            name = "Ankur Purwar";
            details = "Let's talk about the new Personality comes in my friend list, named as Ankur Purwar belongs to Banda. In Present, He is my benchmate and a lot more than a best Friend. He is having a ability to make friends faster and even me too make his friend in one lecture. Happy Friendship Day Bro";
            url_fb = "https://www.facebook.com/ankur.purwar.31";
            ;
            url_insta = "https://www.instagram.com/ankur_purwar_/";
            url_mail = "mailto: anujpurwar7@gmail.com";
        } else if (passValue == 3) {
            imageMain.setImageResource(R.drawable.f3);
            name = "Saurav Bahdauria";
            details = "This personality takes time to become my friend as in starting due to misconception we fight on a small topic which makes a distance in our friendship. But atlast, We become friends and a strong bond of that friendship that occurs, results in no more fights between us. Happy Friendship Day bro ";
            url_fb = "https://www.facebook.com/saurav.bhadauria.790";
            ;
            url_insta = "https://www.instagram.com/saurav_bhadauria/";
            url_mail = "mailto: sauravsingh4544@gmail.com";
        } else if (passValue == 4) {
            imageMain.setImageResource(R.drawable.f4);
            name = "Shashank Rajput";
            details = "This is my first Hostel's room partner in my life, who contributes a lot which makes our friendship bond more stronger than even i think. A complete friend package from Helping Nature to Joking and fighting, Many moments are there which remains in our memories. Happy Friendship day Bro. ";
            url_fb = "https://www.facebook.com/profile.php?id=100012588696936&fref=jewel";
            ;
            url_insta = "https://www.instagram.com/shashank_rajput___/\n";
            url_mail = "mailto: shashank4717@gmail.com";
        } else if (passValue == 5) {
            imageMain.setImageResource(R.drawable.f5);
            name = "Akash Agrawal";
            details = "A Rocking personality in my hostel life, who is a lot clever more than i think when i met him first time. He suits the role play of 'Shakuni Mama' in our hostels life. Truely, mostly fights burnup with the lighten by this man, but he is a good friend of mine as we are from same city. Happ Friendship Day Bro.  ";
            url_fb = "https://www.facebook.com/profile.php?id=100010433200403";
            ;
            url_insta = "https://www.instagram.com/akash_agrawal7695/";
            url_mail = "mailto: agrawalakash21605@gmail.com";
        } else if (passValue == 6) {
            imageMain.setImageResource(R.drawable.f6);
            name = "Riya Singh";
            details = "Lets talk about the amazing personality, She is the only female best friend of mine who never angried when i kept her lot of names in school times. Inspite if that, She kept my name also. But she is open heart friend in my life and thats the choice of true friends and at last female bestie of mine. Happy Friendship Day To you Japanese.  ";
            url_fb = " https://www.facebook.com/profile.php?id=100008621712105";
            ;
            url_insta = "https://www.instagram.com/riya_singh_21/";
            url_mail = "mailto: riya13046@gmail.com";
        } else if (passValue == 7) {
            imageMain.setImageResource(R.drawable.f7);
            name = "Shubham Prajapati";
            details = "This guy is unique personality. When i met with this guy,he is busy in mobile games that is COC, which after sometime he introduces that game to me and my room partner. And now that game's addiction is on top. But he is a good and true heart friend which doesnt keep any secrets from me. Happy Friendhip Day Bro.  ";
            url_fb = "https://www.facebook.com/shubham.prajapati.792";
            ;
            url_insta = "https://www.instagram.com/shubham.49/";
            url_mail = "mailto: iamsp67@gmail.com";
        } else if (passValue == 8) {
            imageMain.setImageResource(R.drawable.f8);
            name = "Adi Anand";
            details = "Let's talk about that personality whom i met online on slack. He becomes my friend by his helping nature. He helps me a lot in my new Career at beginner level. I love his nature to make a junior(me) a better friend and available everytime when i needed someone to guide me in error. Happy Friendship Day bro. ";
            url_fb = "https://www.facebook.com/imadianand";
            ;
            url_insta = "https://www.instagram.com/imadianand/";
            url_mail = "mailto: aditya.anand156@gmail.com";
        } else if (passValue == 9) {
            imageMain.setImageResource(R.drawable.f9);
            name = "Nishant Sharma";
            details = "This personality is true meaning of friend and he is my best friend in my college life. Lets describe his nature by Rowdy, 'College ka DON' and my 1st year benchmate and feels me even more than my brother. I want that moments that i spent with you. Miss that fun time. Happy Friendship Day bro.";
            url_fb = "https://www.facebook.com/profile.php?id=100007405990838";
            ;
            url_insta = "https://www.instagram.com/nishantsharma8792/";
            url_mail = "mailto: nishantchintu7300@gmail.com";
        } else if (passValue == 10) {
            imageMain.setImageResource(R.drawable.f10);
            name = "KrishnaNand Upadhayay";
            details = "This amazing personality named as KrishnaNand Upadhyay, my senior which is the main cause for my changes in life. He introduces me a amazing platform from where we can start earning money in college life and enhance our skills which is the main requirement for an engineer. Happy Friendship Day Sir.";
            url_fb = "https://www.facebook.com/krishnanand.upadhyay.50";
            ;
            url_insta = "https://www.instagram.com/ukrishnanand/";
            url_mail = "mailto: krishnanandupadhyay9@gmail.com";
        }


        getSupportActionBar().setTitle(name + "'s Profile");
        textName.setText(name);
        textDetail.setText(details);
    }

    private void fbRun() {
        Intent fb = new Intent(Intent.ACTION_VIEW);
        fb.setData(Uri.parse(url_fb));
        startActivity(fb);
    }

    private void instaRun() {
        Intent insta = new Intent(Intent.ACTION_VIEW);
        insta.setData(Uri.parse(url_insta));
        startActivity(insta);
    }

    private void mailRun() {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse(url_mail));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Send Your Mail to " + name);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

}
