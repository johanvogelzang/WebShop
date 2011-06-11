
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:11 CEST 2011
 *     Application model: Color
 *     Generator        : Mod4j BusinessDomainDsl generator: Enumeration.xpt
 */

package org.company.recordshop.domain;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 *
 */
public enum Color {

	RED(0), BLUE(1);

	private static final Map<Integer, Color> lookup = new HashMap<Integer, Color>();
	static {
		for (Color s : EnumSet.allOf(Color.class))
			lookup.put(s.id(), s);
	}

	private Integer id;

	private Color(Integer id) {
		this.id = id;
	}

	public Integer id() {
		return id;
	}

	public static Color value(Integer id) {
		return lookup.get(id);
	}
}
