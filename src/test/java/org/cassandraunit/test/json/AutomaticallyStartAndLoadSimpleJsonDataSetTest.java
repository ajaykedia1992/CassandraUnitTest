package org.cassandraunit.test.json;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.cassandraunit.AbstractCassandraUnit4TestCase;
import org.cassandraunit.dataset.DataSet;
import org.cassandraunit.dataset.json.ClassPathJsonDataSet;
import org.junit.Test;

/**
 * 
 * @author Jeremy Sevellec
 *
 */
public class AutomaticallyStartAndLoadSimpleJsonDataSetTest extends AbstractCassandraUnit4TestCase {

	@Override
	public DataSet getDataSet() {
		return new ClassPathJsonDataSet("simpleDataSet.json");
	}

	@Test
	public void shouldHaveLoadASimpleDataSet() throws Exception {
		assertThat(getKeyspace(), notNullValue());
		assertThat(getKeyspace().getKeyspaceName(), is("beautifulKeyspaceName"));
		/* and query all what you want */
	}

}
