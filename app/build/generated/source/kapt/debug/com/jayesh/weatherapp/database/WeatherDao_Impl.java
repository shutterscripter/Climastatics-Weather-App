package com.jayesh.weatherapp.database;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WeatherDao_Impl implements WeatherDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WeatherEntity> __insertionAdapterOfWeatherEntity;

  private final EntityDeletionOrUpdateAdapter<WeatherEntity> __deletionAdapterOfWeatherEntity;

  public WeatherDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWeatherEntity = new EntityInsertionAdapter<WeatherEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `WeatherHistory` (`city`,`temp`,`min_temp`,`max_temp`,`pressure`,`humidity`,`wind`,`visibility`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WeatherEntity value) {
        if (value.getCity() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCity());
        }
        if (value.getTemp() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTemp());
        }
        if (value.getMinTemp() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMinTemp());
        }
        if (value.getMaxTemp() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMaxTemp());
        }
        if (value.getPressure() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPressure());
        }
        if (value.getHumidity() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getHumidity());
        }
        if (value.getWind() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getWind());
        }
        if (value.getVisibility() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getVisibility());
        }
      }
    };
    this.__deletionAdapterOfWeatherEntity = new EntityDeletionOrUpdateAdapter<WeatherEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `WeatherHistory` WHERE `city` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WeatherEntity value) {
        if (value.getCity() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCity());
        }
      }
    };
  }

  @Override
  public void insertWeather(final WeatherEntity weatherEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWeatherEntity.insert(weatherEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteWeather(final WeatherEntity weatherEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfWeatherEntity.handle(weatherEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<WeatherEntity> getAllWeather() {
    final String _sql = "SELECT * FROM weatherhistory";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city");
      final int _cursorIndexOfTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "temp");
      final int _cursorIndexOfMinTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "min_temp");
      final int _cursorIndexOfMaxTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "max_temp");
      final int _cursorIndexOfPressure = CursorUtil.getColumnIndexOrThrow(_cursor, "pressure");
      final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
      final int _cursorIndexOfWind = CursorUtil.getColumnIndexOrThrow(_cursor, "wind");
      final int _cursorIndexOfVisibility = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility");
      final List<WeatherEntity> _result = new ArrayList<WeatherEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final WeatherEntity _item;
        final String _tmpCity;
        if (_cursor.isNull(_cursorIndexOfCity)) {
          _tmpCity = null;
        } else {
          _tmpCity = _cursor.getString(_cursorIndexOfCity);
        }
        final String _tmpTemp;
        if (_cursor.isNull(_cursorIndexOfTemp)) {
          _tmpTemp = null;
        } else {
          _tmpTemp = _cursor.getString(_cursorIndexOfTemp);
        }
        final String _tmpMinTemp;
        if (_cursor.isNull(_cursorIndexOfMinTemp)) {
          _tmpMinTemp = null;
        } else {
          _tmpMinTemp = _cursor.getString(_cursorIndexOfMinTemp);
        }
        final String _tmpMaxTemp;
        if (_cursor.isNull(_cursorIndexOfMaxTemp)) {
          _tmpMaxTemp = null;
        } else {
          _tmpMaxTemp = _cursor.getString(_cursorIndexOfMaxTemp);
        }
        final String _tmpPressure;
        if (_cursor.isNull(_cursorIndexOfPressure)) {
          _tmpPressure = null;
        } else {
          _tmpPressure = _cursor.getString(_cursorIndexOfPressure);
        }
        final String _tmpHumidity;
        if (_cursor.isNull(_cursorIndexOfHumidity)) {
          _tmpHumidity = null;
        } else {
          _tmpHumidity = _cursor.getString(_cursorIndexOfHumidity);
        }
        final String _tmpWind;
        if (_cursor.isNull(_cursorIndexOfWind)) {
          _tmpWind = null;
        } else {
          _tmpWind = _cursor.getString(_cursorIndexOfWind);
        }
        final String _tmpVisibility;
        if (_cursor.isNull(_cursorIndexOfVisibility)) {
          _tmpVisibility = null;
        } else {
          _tmpVisibility = _cursor.getString(_cursorIndexOfVisibility);
        }
        _item = new WeatherEntity(_tmpCity,_tmpTemp,_tmpMinTemp,_tmpMaxTemp,_tmpPressure,_tmpHumidity,_tmpWind,_tmpVisibility);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public WeatherEntity getWeatherById(final String city) {
    final String _sql = "SELECT * FROM weatherhistory WHERE city = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (city == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, city);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city");
      final int _cursorIndexOfTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "temp");
      final int _cursorIndexOfMinTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "min_temp");
      final int _cursorIndexOfMaxTemp = CursorUtil.getColumnIndexOrThrow(_cursor, "max_temp");
      final int _cursorIndexOfPressure = CursorUtil.getColumnIndexOrThrow(_cursor, "pressure");
      final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
      final int _cursorIndexOfWind = CursorUtil.getColumnIndexOrThrow(_cursor, "wind");
      final int _cursorIndexOfVisibility = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility");
      final WeatherEntity _result;
      if(_cursor.moveToFirst()) {
        final String _tmpCity;
        if (_cursor.isNull(_cursorIndexOfCity)) {
          _tmpCity = null;
        } else {
          _tmpCity = _cursor.getString(_cursorIndexOfCity);
        }
        final String _tmpTemp;
        if (_cursor.isNull(_cursorIndexOfTemp)) {
          _tmpTemp = null;
        } else {
          _tmpTemp = _cursor.getString(_cursorIndexOfTemp);
        }
        final String _tmpMinTemp;
        if (_cursor.isNull(_cursorIndexOfMinTemp)) {
          _tmpMinTemp = null;
        } else {
          _tmpMinTemp = _cursor.getString(_cursorIndexOfMinTemp);
        }
        final String _tmpMaxTemp;
        if (_cursor.isNull(_cursorIndexOfMaxTemp)) {
          _tmpMaxTemp = null;
        } else {
          _tmpMaxTemp = _cursor.getString(_cursorIndexOfMaxTemp);
        }
        final String _tmpPressure;
        if (_cursor.isNull(_cursorIndexOfPressure)) {
          _tmpPressure = null;
        } else {
          _tmpPressure = _cursor.getString(_cursorIndexOfPressure);
        }
        final String _tmpHumidity;
        if (_cursor.isNull(_cursorIndexOfHumidity)) {
          _tmpHumidity = null;
        } else {
          _tmpHumidity = _cursor.getString(_cursorIndexOfHumidity);
        }
        final String _tmpWind;
        if (_cursor.isNull(_cursorIndexOfWind)) {
          _tmpWind = null;
        } else {
          _tmpWind = _cursor.getString(_cursorIndexOfWind);
        }
        final String _tmpVisibility;
        if (_cursor.isNull(_cursorIndexOfVisibility)) {
          _tmpVisibility = null;
        } else {
          _tmpVisibility = _cursor.getString(_cursorIndexOfVisibility);
        }
        _result = new WeatherEntity(_tmpCity,_tmpTemp,_tmpMinTemp,_tmpMaxTemp,_tmpPressure,_tmpHumidity,_tmpWind,_tmpVisibility);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
