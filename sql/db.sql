CREATE DATABASE students_db;

CREATE TABLE schools(
	id INT NOT NULL,
    name VARCHAR(50) NOT NULL,
    city VARCHAR(100) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE students(
	id INT NOT NULL,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    year_of_birth INT NOT NULL,
    school_id INT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY (school_id) REFERENCES schools(id)
)

