package com.uas.wallpaperhd;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.io.IOException;

public class ThemeActivity extends AppCompatActivity {

    LinearLayout theme_preview;
    Button btn_back, btn_save;
    String newString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);

        btn_back = (Button) findViewById(R.id.btn_back);
        btn_save = (Button) findViewById(R.id.btn_save);
        theme_preview = (LinearLayout) findViewById(R.id.theme_preview);


        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                newString = null;
            } else {
                newString = extras.getString("PATH_PICTURE");
                if (newString.equals("love")) {
                    theme_preview.setBackgroundResource(R.drawable.love);

                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                            try {
                                wlp.setResource(+R.drawable.love);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                } else {
                    newString = extras.getString("PATH_PICTURE");
                    if (newString.equals("moon")) {
                        theme_preview.setBackgroundResource(R.drawable.moon);

                        btn_save.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                                Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                                try {
                                    wlp.setResource(+R.drawable.moon);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        });
                    } else {
                        newString = extras.getString("PATH_PICTURE");
                        if (newString.equals("patrik")) {
                            theme_preview.setBackgroundResource(R.drawable.patrik);

                            btn_save.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                                    Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                                    try {
                                        wlp.setResource(+R.drawable.patrik);
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                            });
                        } else {
                            newString = extras.getString("PATH_PICTURE");
                            if (newString.equals("abstrak1")) {
                                theme_preview.setBackgroundResource(R.drawable.abstrak1);

                                btn_save.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                                        Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                                        try {
                                            wlp.setResource(+R.drawable.abstrak1);
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                });
                            } else {
                                newString = extras.getString("PATH_PICTURE");
                                if (newString.equals("alam2")) {
                                    theme_preview.setBackgroundResource(R.drawable.alam2);

                                    btn_save.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                                            Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                                            try {
                                                wlp.setResource(+R.drawable.alam2);
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    });
                                } else {
                                    newString = extras.getString("PATH_PICTURE");
                                    if (newString.equals("alam8")) {
                                        theme_preview.setBackgroundResource(R.drawable.alam8);

                                        btn_save.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                WallpaperManager wlp = WallpaperManager.getInstance(getApplicationContext());
                                                Toast.makeText(getApplicationContext(), "Berhasil dipasang", Toast.LENGTH_SHORT).show();
                                                try {
                                                    wlp.setResource(+R.drawable.alam8);
                                                } catch (IOException e) {
                                                    e.printStackTrace();
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        }
                    }


                    Bundle bundle = getIntent().getExtras();
                    if (bundle != null) {
                        if (bundle.getString("some") != null) {
                            Toast.makeText(getApplicationContext(),
                                    "data:" + bundle.getString("some"),
                                    Toast.LENGTH_SHORT);
                        }

                    }
                }

                btn_back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
                    }
                });
            }
        }
    }
}