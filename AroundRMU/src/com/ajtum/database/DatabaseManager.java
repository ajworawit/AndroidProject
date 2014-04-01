package com.ajtum.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseManager {

	
	public static Cursor getAllInTable(SQLiteDatabase db,String table,String columns[]){
		return db.query(table, columns, null,null,null,null,null);
	}

	// select Place
	public static Cursor getPlacebyID(SQLiteDatabase db,String table,String columns[],String id){
		return db.query(table, columns, "_place_id="+"'"+id+"'",null,null,null,null);
	}
	
	// select org
	public static Cursor getOrgbyPlaceID(SQLiteDatabase db,String table,String columns[],String place_id){
		return db.query(table, columns, "_place_id="+"'"+place_id+"'",null,null,null,null);
	}
	
	
}
