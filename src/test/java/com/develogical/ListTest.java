package com.develogical;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ListTest {

	RecentlyUsedList newList = new RecentlyUsedList();

	@Test
	public void listIsEmptyAfterInitialisation() {
		assertThat(newList.count(), is(0));
	}

	@Test
	public void listContainsPreviouslyAddedItems() {
		newList.add("test1");
		newList.add("test2");

		assertThat(newList.contains("test1"), is(true));
		assertThat(newList.contains("test2"), is(true));
	}

	@Test
	public void itemsReadingFromListWorks() {
		newList.add("test1");
		newList.add("test2");

		assertThat(newList.read(1), is("test1"));
		assertThat(newList.read(0), is("test2"));
	}

	@Test
	public void mostRecentItemIsFirst() {
		newList.add("test1");
		newList.add("test2");

		assertThat(newList.read(0), is("test2"));
	}

	@Test
	public void allItemsAreUnique() {
		newList.add("test1");
		newList.add("test1");
		newList.add("test2");
		newList.add("test2");

		assertThat(newList.count(), is(2));
		assertThat(newList.read(0), is("test2"));
		assertThat(newList.read(1), is("test1"));
	}

}
