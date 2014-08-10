package com.vmware.talentboost;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TestMemoryConverter {

	@Test
	public void testZeroBytes() {
		assertEquals("0B", MemoryConverter.convert(0, MemoryCategory.B));
	}
	@Test
	public void test1023Bytes(){
		assertEquals("1023B", MemoryConverter.convert(1023, MemoryCategory.B));
	}
	@Test
	public void test1KB(){
		assertEquals("1KB", MemoryConverter.convert(1024, MemoryCategory.B));
	}
	@Test
	public void test1MB(){
		assertEquals("1MB", MemoryConverter.convert(1_048_576, MemoryCategory.B));
	}
	@Test
	public void testKilobytesToGigabytes(){
		assertEquals("5GB", MemoryConverter.convert(5_242_880, MemoryCategory.KB));
	}

}
