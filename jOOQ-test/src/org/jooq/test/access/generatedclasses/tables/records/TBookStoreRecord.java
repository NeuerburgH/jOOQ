/**
 * This class is generated by jOOQ
 */
package org.jooq.test.access.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.access.generatedclasses.tables.records.TBookStoreRecord> implements org.jooq.Record1<java.lang.String> {

	private static final long serialVersionUID = -568829543;

	/**
	 * Setter for <code>T_BOOK_STORE.XNAME</code>. 
	 */
	public void setXname(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>T_BOOK_STORE.XNAME</code>. 
	 */
	public java.lang.String getXname() {
		return (java.lang.String) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.String> fieldsRow() {
		return (org.jooq.Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.String> valuesRow() {
		return (org.jooq.Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.access.generatedclasses.tables.TBookStore.XNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getXname();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookStoreRecord
	 */
	public TBookStoreRecord() {
		super(org.jooq.test.access.generatedclasses.tables.TBookStore.T_BOOK_STORE);
	}
}