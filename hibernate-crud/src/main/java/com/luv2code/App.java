package com.luv2code;

import com.luv2code.entity.Book;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {

    public static void main(String[] args) throws Exception, HibernateException {
        // Obtain SessionFactory from HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        // Create a session
        Session session = sessionFactory.openSession();

        // Create a transaction
        Transaction transaction = null;

        try {
            // Begin transaction
            transaction = session.beginTransaction();

            // 1. Create a new book and save it to the database
            Book newBook = new Book("The Great Gatsby", "F. Scott Fitzgerald");
            session.save(newBook);
            System.out.println("Book created: " + newBook);

            // 2. Read the book from the database
            Book readBook = session.get(Book.class, newBook.getId());
            System.out.println("Book retrieved: " + readBook);

            // 3. Update the book's title
            readBook.setTitle("The Great Gatsby (Updated)");
            session.update(readBook);
            System.out.println("Book updated: " + readBook);

            // 4. Delete the book from the database
            session.delete(readBook);
            System.out.println("Book deleted");

            // Commit the transaction
            transaction.commit();

        } finally {
            // Close the session
            session.close();
        }

        // Shutdown Hibernate
        HibernateUtil.shutdown();
    }
}
