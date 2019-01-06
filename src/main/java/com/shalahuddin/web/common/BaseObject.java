package com.shalahuddin.web.common;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;



/**
 * Base class for Model objects. Child objects should implement toString(),
 * equals() and hashCode().
 *
 *
 */
@SuppressWarnings("serial")
public abstract class BaseObject implements Serializable{
	/**
	 * Returns a multi-line String with key=value pairs.
	 * @return a String representation of this class.
	 */
	@Override
	public String toString(){
		return ReflectionToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	/**
	 * Compares object equality. When using Hibernate, the primary key should
	 * not be a part of this comparison.
	 * @param o object to compare to
	 * @return true/false based on equality tests
	 */
	@Override
	public abstract boolean equals(Object o);

	/**
	 * When you override equals, you should override hashCode. See "Why are
	 * equals() and hashCode() importation" for more information:
	 * http://www.hibernate.org/109.html
	 * @return hashCode
	 */
	@Override
	public abstract int hashCode();
}
