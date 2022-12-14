<layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools">

    <data>

        <variable
            name="wea"
            type="com.kd.appwuyione.Wea" />

        <variable
            name="date"
            type="String" />

        <variable
            name="update"
            type="String" />

        <variable
            name="backIndex"
            type="Integer" />
    </data>

    <LinearLayout
        android:layout_width="728px"
        android:layout_height="260px"
        android:background="@drawable/db1"
        android:orientation="vertical"
        app:setBackImage="@{backIndex}">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_marginBottom="2px"
            android:layout_weight="1.5"
            android:orientation="horizontal">

            <TextView
                setTextColor="@{backIndex}"
                android:layout_width="0px"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:gravity="center"
                android:text="武义气象"
                android:textSize="@dimen/maintitle" />

            <TextView
                setTextColor="@{backIndex}"
                android:layout_width="0px"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:gravity="center_horizontal|bottom"
                android:text="@{update}"
                android:textSize="15sp" />

            <TextView
                setTextColor="@{backIndex}"
                android:layout_width="0px"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:gravity="center_vertical|right"
                android:paddingRight="9px"
                android:text="@{date}"
                android:textSize="@dimen/maindate" />
        </LinearLayout>

        <LinearLayout
            android:id="@+id/contenter"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="5"
            android:orientation="horizontal" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:orientation="horizontal">

            <TextView

                android:layout_width="0px"
                android:layout_height="match_parent"
                android:layout_weight="1"
                android:background="#333"
                android:gravity="center"
                android:text="天气预报"
                android:textColor="#fff"
                android:textSize="@dimen/mainwea" />

            <com.kd.appwuyi.MarqueeView
                android:layout_width="0px"
                android:layout_height="match_parent"
                android:layout_weight="5"
                android:background="#555"
                app:marqueeview_text_color="#fff"
                app:marqueeview_text_size="18"
                app:marqueeview_text_speed="2.0"
                app:setText="@{wea.wea_txt1}" />
        </LinearLayout>
    </LinearLayout>
</layout>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    