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

INSERT INTO books (isbn, author, title, num_of_pages, genre)
VALUES
    ('9780451524935', 'George Orwell', '1984', 328, 'Dystopian'),
    ('9780061120084', 'Harper Lee', 'To Kill a Mockingbird', 281, 'Fiction'),
    ('9780544003415', 'J.R.R. Tolkien', 'The Hobbit', 310, 'Fantasy'),
    ('9780743273565', 'F. Scott Fitzgerald', 'The Great Gatsby', 180, 'Classic'),
    ('9780307474278', 'Cormac McCarthy', 'The Road', 287, 'Post-Apocalyptic');