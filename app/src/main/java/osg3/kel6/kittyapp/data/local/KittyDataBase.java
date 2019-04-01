package osg3.kel6.kittyapp.data.local;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import osg3.kel6.kittyapp.model.Kitty;

/**
 * Created by firdaus1453 on 4/2/2019.
 */
@Database(entities = {Kitty.class}, version = 1)
public abstract class KittyDataBase extends RoomDatabase {
    private static KittyDataBase INSTANCE;

    public abstract KittyDao kittyDao();

    private static final Object sLock = new Object();

    public static KittyDataBase getInstance(Context context) {
        synchronized (sLock) {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                        KittyDataBase.class, "Kitty.db")
                        .build();
            }
            return INSTANCE;
        }
    }
}
