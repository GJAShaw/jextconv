/**
 * 
 */
package com.avalokita.jextconv;

/**
 * @author greg
 *
 */
public abstract class DldRecord {
	
	public static final int RECORD_NUMBER_LENGTH = 4;
	public static final int RECORD_TYPE_LENGTH = 1;
	public static final int FILLER_LENGTH = 1;

	private int recordNumber;
	private String recordType;
	private int offset;

	DldRecord(String s) {
		offset = 0;
		recordNumber = Integer.parseInt(s.substring(offset, RECORD_NUMBER_LENGTH));
		offset += RECORD_NUMBER_LENGTH;
		recordType = s.substring(offset, RECORD_TYPE_LENGTH);
		offset += RECORD_TYPE_LENGTH;
		// don't capture the filler character, just update offset:
		offset += FILLER_LENGTH;
	}
	
	public int recordNumber() {return recordNumber;}
	public String recordType() {return recordType;}

}
