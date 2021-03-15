# TakeImageSingle

- Take Image From Camera [Tutorial](https://github.com/gzeinnumer/EasyExternalDirectoryAndroid/blob/master/README_4.md#take-image-from-camera-and-compress)

- `activity_main.xml`
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/parent"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <LinearLayout
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:fillViewport="true"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical">

            <com.google.android.material.appbar.AppBarLayout
                style="@style/MyAppbarLayout"
                android:background="@color/white">

                <com.google.android.material.appbar.MaterialToolbar style="@style/MyMaterialToolbar">

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content">

                        <ImageButton
                            android:id="@+id/btn_back"
                            style="@style/MyCostumToolbarImage"
                            android:src="@drawable/mygzn_keyboard_arrow_left"
                            android:tag="CostumToolbarImage" />

                        <TextView
                            android:id="@+id/tv_toolbar"
                            style="@style/MyCostumToolbarTitle"
                            android:text="Single Foto" />
                    </LinearLayout>
                </com.google.android.material.appbar.MaterialToolbar>
            </com.google.android.material.appbar.AppBarLayout>

            <View style="@style/MyDivider.Toolbar" />

            <LinearLayout
                style="@style/MyParentType"
                android:gravity="center">

                <com.google.android.material.textfield.TextInputLayout
                    android:id="@+id/ed_date_p"
                    style="@style/MyTextInputLayoutOutlinedBox"
                    android:hint="Date">

                    <com.google.android.material.textfield.TextInputEditText
                        android:id="@+id/ed_date"
                        style="@style/MyTextInputEditText" />

                </com.google.android.material.textfield.TextInputLayout>

                <LinearLayout
                    android:layout_marginBottom="@dimen/def_margin"
                    android:layout_marginTop="@dimen/def_margin"
                    android:layout_width="match_parent"
                    android:gravity="center"
                    android:layout_height="wrap_content"
                    android:layout_weight="1">

                    <ImageView
                        android:id="@+id/img"
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        android:scaleType="center"
                        android:src="@drawable/ic_baseline_add_a_photo_24" />

                </LinearLayout>

                <Button
                    android:id="@+id/btn_simpan"
                    style="@style/MyButtonContained"
                    android:layout_width="match_parent"
                    android:text="Simpan" />
            </LinearLayout>
        </LinearLayout>
    </LinearLayout>
</androidx.constraintlayout.widget.ConstraintLayout>
```

|![](https://github.com/gzeinnumer/TakeImageSingle/blob/master/preview/example1.jpg)|![](https://github.com/gzeinnumer/TakeImageSingle/blob/master/preview/example2.jpg)|
|---|---|
---

```
Copyright 2021 M. Fadli Zein
```