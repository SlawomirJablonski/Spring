package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Book b1 = new Book("Japoński nie gryzie!","Opracowanie zbiorowe", LocalDate.of(2014,11,14));
        Book b2 = new Book("Regulamin tłoczni win","Irving John", LocalDate.of(1985,05,10));
        Book b3 = new Book("Honor germańskiego bobra","Roman Bratny", LocalDate.of(1985,11,02));

        Library library = new Library("Christmas gifts /origin/");

        library.getBooks().add(b1);
        library.getBooks().add(b2);
        library.getBooks().add(b3);

        //making a shallow copy of object library
        Library shallowCopyLibrary = null;
        try{
            shallowCopyLibrary = library.shallowCopy();
            shallowCopyLibrary.setName("Easter gifts /shallow/");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepCopyLibrary = null;
        try{
            deepCopyLibrary = library.deepCopy();
            deepCopyLibrary.setName("Birthday gifts /deep/");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.getBooks().remove(b3);

        //Then
        Assert.assertEquals(2,library.getBooks().size());
        Assert.assertEquals(2,shallowCopyLibrary.getBooks().size());
        Assert.assertEquals(3,deepCopyLibrary.getBooks().size());
    }
}