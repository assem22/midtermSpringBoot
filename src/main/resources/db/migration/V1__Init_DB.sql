CREATE TABLE author(
    author_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    author_email VARCHAR(255) NOT NULL,
    author_name VARCHAR(255) NOT NULL,
    author_password VARCHAR(255) NOT NULL
);

CREATE TABLE books(
    book_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    book_genre VARCHAR(255) NOT NULL,
    book_name VARCHAR(255) NOT NULL,
    description VARCHAR(1000) NULL,
    author_id BIGINT
);

CREATE TABLE subscriber(
    subscriber_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    subscriber_email VARCHAR(255) NOT NULL,
    subscriber_name VARCHAR(255) NOT NULL,
    subscriber_password VARCHAR(255) NOT NULL,
    author_id BIGINT
);

CREATE TABLE subscriber_publishers(
    author_id BIGINT,
    subscriber_id BIGINT
);
