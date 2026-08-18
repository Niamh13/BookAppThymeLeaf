DROP SCHEMA IF EXISTS bookdb;
CREATE DATABASE bookdb;

USE bookdb;

CREATE TABLE IF NOT EXISTS books (
                                     isbn VARCHAR(20) PRIMARY KEY,
    author VARCHAR(255) NOT NULL,
    title VARCHAR(255) NOT NULL,
    num_of_pages INT NOT NULL,
    genre VARCHAR(100)
    );

INSERT INTO books (isbn, title, author, num_of_pages, genre) VALUES
                                                                 ('9780141439518', 'Pride and Prejudice', 'Jane Austen', 432, 'Romance'),
                                                                 ('9780451524935', '1984', 'George Orwell', 328, 'Dystopian'),
                                                                 ('9780061120084', 'To Kill a Mockingbird', 'Harper Lee', 336, 'Fiction'),
                                                                 ('9780743273565', 'The Great Gatsby', 'F. Scott Fitzgerald', 180, 'Fiction'),
                                                                 ('9780547928227', 'The Hobbit', 'J.R.R. Tolkien', 310, 'Fantasy'),
                                                                 ('9780345339683', 'The Fellowship of the Ring', 'J.R.R. Tolkien', 423, 'Fantasy'),
                                                                 ('9780316769488', 'The Catcher in the Rye', 'J.D. Salinger', 224, 'Fiction'),
                                                                 ('9780553380147', 'Brave New World', 'Aldous Huxley', 311, 'Dystopian'),
                                                                 ('9780060850524', 'Slaughterhouse-Five', 'Kurt Vonnegut', 275, 'Science Fiction'),
                                                                 ('9780393354816', 'Sapiens', 'Yuval Noah Harari', 443, 'Non-Fiction'),
                                                                 ('9780262033848', 'Introduction to Algorithms', 'Thomas H. Cormen', 1312, 'Computer Science'),
                                                                 ('9781491910774', 'Fluent Python', 'Luciano Ramalho', 792, 'Computer Science'),
                                                                 ('9780553380163', 'A Brief History of Time', 'Stephen Hawking', 256, 'Science'),
                                                                 ('9780544003415', 'The Lord of the Rings', 'J.R.R. Tolkien', 1178, 'Fantasy'),
                                                                 ('9780439708180', 'Harry Potter and the Sorcerer''s Stone', 'J.K. Rowling', 309, 'Fantasy'),
                                                                 ('9780307474278', 'The Da Vinci Code', 'Dan Brown', 489, 'Thriller'),
                                                                 ('9780679783268', 'Crime and Punishment', 'Fyodor Dostoevsky', 671, 'Fiction'),
                                                                 ('9780141182803', 'Heart of Darkness', 'Joseph Conrad', 96, 'Fiction'),
                                                                 ('9780446310789', 'To the Lighthouse', 'Virginia Woolf', 209, 'Fiction'),
                                                                 ('9780679732761', 'The Sound and the Fury', 'William Faulkner', 326, 'Fiction');