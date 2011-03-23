package com.github.twoodfin;

import com.intersys.globals.ConnectionContext;
import com.intersys.globals.Connection;

public class DupFinder {
    public static void main(String argv[]) {
	Connection connection = ConnectionContext.getConnection();
	if (!connection.isConnected()) {
	    connection.connect("USER", "_SYSTEM", "SYS");
	}
    }
}

