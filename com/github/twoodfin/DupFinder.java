package com.github.twoodfin;

import com.intersys.globals.ConnectionContext;
import com.intersys.globals.Connection;
import com.intersys.globals.NodeReference;

public class DupFinder {
    public static void main(String argv[]) {
	Connection connection = ConnectionContext.getConnection();
	if (!connection.isConnected()) {
	    connection.connect("USER", "_SYSTEM", "SYS");
	}
	NodeReference nodeRef = connection.createNodeReference("test");
	nodeRef.set("hello world");
	String out = nodeRef.getString();
	System.out.println(out);
    }
}

