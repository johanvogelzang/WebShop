
/**
 * DO NOT MODIFY THIS FILE, CHANGES WILL BE AUTOMATICALLY OVERWRITTEN! 
 *
 * Generated by Mod4j. 
 *     Time             : Fri Jun 10 13:47:12 CEST 2011
 *     Application model: RecordTypeEnumDto
 *     Generator        : Mod4j DatcontractDsl generator: Enumeration.xpt
 */

package org.company.recordshop.service.dto;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 *
 * Generated at: Fri Jun 10 13:47:12 CEST 2011
 */
public enum RecordTypeEnumDto {

	LP(2), CD(3), DVD(4), BLUERAY(5);

	private static final Map<Integer, RecordTypeEnumDto> lookup = new HashMap<Integer, RecordTypeEnumDto>();
	static {
		for (RecordTypeEnumDto s : EnumSet.allOf(RecordTypeEnumDto.class))
			lookup.put(s.id(), s);
	}

	private Integer id;

	private RecordTypeEnumDto(Integer id) {
		this.id = id;
	}

	public Integer id() {
		return id;
	}

	public static RecordTypeEnumDto value(Integer id) {
		return lookup.get(id);
	}
}
