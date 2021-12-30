package ru.shepin.app_android_by_java;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

/**
 * {Comments}
 *
 * @author dshepin
 */
public class StarbuzzDatabaseHelper extends SQLiteOpenHelper {
    private static String DB_NAME = "starbuzz";
    private static int DB_VERSION = 1;


    public StarbuzzDatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE DRINK(" +
                "_ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "NAME TEXT, " +
                "DESCRIPTION TEXT, " +
                "IMAGE_RESOURCES_ID INTEGER);");


        insertDrink(db,"Latte", "Espresso and steamed milk", R.drawable.latte);
        insertDrink(db,"Cappuccino", "Espresso, hot milk and steamed-milk foam", R.drawable.cappuccino);
        insertDrink(db,"Filter", "Our best drip coffe", R.drawable.filter);
    }

    public static void insertDrink(SQLiteDatabase db, String name, String description, int resourceId) {
        ContentValues drinkValues = new ContentValues();
        drinkValues.put("NAME", name);
        drinkValues.put("DESCRIPTION", description);
        drinkValues.put("IMAGE_RESOURCES_ID", resourceId);

        db.insert("DRINK", null, drinkValues);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {;

    }
}
