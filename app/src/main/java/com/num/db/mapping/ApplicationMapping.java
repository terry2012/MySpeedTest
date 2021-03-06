package com.num.db.mapping;

import android.content.Context;

import com.num.db.DatabaseColumns;

//import com.num.models.MainModel;

public class ApplicationMapping extends BaseMapping {
	
	public static String TABLE_NAME = "application";
	public static int DATABASE_VERSION = 1;

	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_TIME = "time";
	public static final String COLUMN_NAME = "name";
	public static final String COLUMN_DATA = "data";
	public static final String COLUMN_DIRECTION = "direction";

	public ApplicationMapping(Context context) {
		super(context,TABLE_NAME,DATABASE_VERSION);
	}

	public void setColumnMap() {
		columns = new DatabaseColumns(getTableName());
		columns.add(COLUMN_ID, "integer primary key autoincrement");
		columns.add(COLUMN_TIME, "text not null");
		columns.add(COLUMN_NAME, "text not null");
		columns.add(COLUMN_DATA, "long not null");
		columns.add(COLUMN_DIRECTION, "text not null");
	}


}