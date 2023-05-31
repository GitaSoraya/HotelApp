package com.gitasoraya201103651.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.ImageDecoder;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://e0.pxfuel.com/wallpapers/632/505/desktop-wallpaper-hotel-management-hotels.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);

    }
}