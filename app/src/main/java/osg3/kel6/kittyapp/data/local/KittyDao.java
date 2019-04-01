package osg3.kel6.kittyapp.data.local;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import osg3.kel6.kittyapp.model.Kitty;

/**
 * Created by firdaus1453 on 4/2/2019.
 */
@Dao
public interface KittyDao {

    // Untuk mengambil semua data yang ada di dalam table kittytable
    @Query("SELECT * FROM KITTYTABLE")
    List<Kitty> getKitty();

    // Untuk menginsert data ke dalam table kittytable
    @Insert
    void insertKitty(List<Kitty> kitty);
}
