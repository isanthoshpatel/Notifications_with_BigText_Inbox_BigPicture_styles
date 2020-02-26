package com.example.notifications_with_bigtext_inbox_bigpicture_styles

import android.graphics.BitmapFactory
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    lateinit var nm: NotificationManagerCompat
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nm = NotificationManagerCompat.from(this)

        bt_BigText.setOnClickListener {
            var n1 = NotificationCompat.Builder(this, App.id)
                .setSmallIcon(R.drawable.ic_android_black_24dp)
                .setContentTitle(et1.text.toString())
                .setContentText(et2.text.toString())
                .setOnlyAlertOnce(true)
                .setColor(Color.RED)
                .setStyle(
                    NotificationCompat.BigTextStyle()
                        .setBigContentTitle("this is big content title")
                        .bigText(
                            "this is bic text style , here you can add upto seve lines length of text. usually all the styles like bigtext,bigpicture,inbox are happens on exanded view of notifications this is bic text style , here you can add upto seve lines length of text. usually all the styles like bigtext,bigpicture,inbox are happens on exanded view of notifications this is bic text style , here you can add upto seve lines length of text. usually all the styles like bigtext,bigpicture,inbox are happens on exanded view of notifications this is bic text style , here you can add upto seve lines length of text. usually all the styles like bigtext,bigpicture,inbox are happens on exanded view of notifications this is bic text style , here you can add upto seve lines length of text. usually all the styles like bigtext,bigpicture,inbox are happens on exanded view of notifications this is bic text style , here you can add upto seve lines length of text. usually all the styles like bigtext,bigpicture,inbox are happens on exanded view of notifications this is bic text style , here you can add upto seve lines length of text. usually all the styles like bigtext,bigpicture,inbox are happens on exanded view of notifications this is bic text style , here you can add upto seve lines length of text. usually all the styles like bigtext,bigpicture,inbox are happens on exanded view of notifications this is bic text style , here you can add upto seve lines length of text. usually all the styles like bigtext,bigpicture,inbox are happens on exanded view of notifications"
                        )
                        .setSummaryText("user1")
                )
                .build()
            nm.notify(1, n1)
        }

        bt_BigPicture.setOnClickListener {
            var n = NotificationCompat.Builder(this, App.id)
                .setContentTitle(et1.text.toString())
                .setContentText(et2.text.toString())
                .setSmallIcon(R.drawable.ic_android_black_24dp)
                .setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.selena_background))
                .setStyle(
                    NotificationCompat.BigPictureStyle()
                        .bigPicture(BitmapFactory.decodeResource(resources, R.drawable.cover))
                        .bigLargeIcon(null)
                )
                .setSubText("Selena..LYou")
                .setOnlyAlertOnce(true)
                .setColor(Color.RED)
                .build()

            nm.notify(2, n)
        }


        bt_Inbox.setOnClickListener {
            var n = NotificationCompat.Builder(this, App.id)
                .setContentTitle(et1.text.toString())
                .setContentText(et2.text.toString())
                .setSmallIcon(R.drawable.ic_android_black_24dp)
                .setStyle(
                    NotificationCompat.InboxStyle()
                        .addLine("user1" + " " + "hello there all")
                        .addLine("user2" + " " + "hiiiiii")
                        .addLine("user3" + " " + "hellow san....")
                        .addLine("user4" + " " + "how are you san...")
                        .addLine("user5" + " " + "hellow body...")
                        .addLine("user6" + " " + "yes...im here for you all...")
                        .addLine("user7" + " " + "yes...we gonna talk in few minutes")
                        .setSummaryText("messages")
                )
                .setOnlyAlertOnce(true)
                .setColor(Color.GREEN)
                .build()
            nm.notify(3,n)
        }
    }
}
