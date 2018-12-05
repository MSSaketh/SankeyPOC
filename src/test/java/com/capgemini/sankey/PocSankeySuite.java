package com.capgemini.sankey;

import com.capgemini.sankey.client.PocSankeyTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class PocSankeySuite extends GWTTestSuite {
	public static Test suite() {
		TestSuite suite = new TestSuite("Tests for PocSankey");
		suite.addTestSuite(PocSankeyTest.class);
		return suite;
	}
}
