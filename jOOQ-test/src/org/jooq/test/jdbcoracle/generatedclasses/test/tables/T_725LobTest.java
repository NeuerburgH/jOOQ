/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_725LobTest extends org.jooq.impl.TableImpl<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.T_725LobTestRecord> {

	private static final long serialVersionUID = 931533866;

	/**
	 * The singleton instance of <code>TEST.T_725_LOB_TEST</code>
	 */
	public static final org.jooq.test.jdbcoracle.generatedclasses.test.tables.T_725LobTest T_725_LOB_TEST = new org.jooq.test.jdbcoracle.generatedclasses.test.tables.T_725LobTest();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.T_725LobTestRecord> getRecordType() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.T_725LobTestRecord.class;
	}

	/**
	 * The column <code>TEST.T_725_LOB_TEST.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.T_725LobTestRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.precision(7), T_725_LOB_TEST);

	/**
	 * The column <code>TEST.T_725_LOB_TEST.LOB</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.T_725LobTestRecord, byte[]> LOB = createField("LOB", org.jooq.impl.SQLDataType.BLOB.length(4000), T_725_LOB_TEST);

	/**
	 * No further instances allowed
	 */
	private T_725LobTest() {
		super("T_725_LOB_TEST", org.jooq.test.jdbcoracle.generatedclasses.test.Test.TEST);
	}
}