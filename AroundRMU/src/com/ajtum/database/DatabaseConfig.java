package com.ajtum.database;

public class DatabaseConfig {
	//general
	public static final String DB_PATH = "data/data/com.ajtum.aroundrmu/databases/";
	public static final String DB_NAME = "aroundrmu_db.sqlite";
	public static final int DB_VERSION = 1;
	
	//table
	public static final String TABLE_Org = "organization";
	public static final String COLUMNS_Org[] = {"_org_id","place_id","org_name","description","address","website","tel","work_date","work_date"};
	
	public static final String TABLE_Place = "place";
	public static final String COLUMNS_Place[] = {"_place_id","place_name","place_lat","place_long"};


	
	
}
