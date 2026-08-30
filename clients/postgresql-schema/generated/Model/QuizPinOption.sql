--
-- "Pinterest REST API"
-- Prepared SQL queries for 'QuizPinOption' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'quiz_pin_option'
--
SELECT "id", "text" FROM quiz_pin_option WHERE 1=1;

--
-- INSERT template for table 'quiz_pin_option'
--
INSERT INTO quiz_pin_option ("id", "text") VALUES (?, ?);

--
-- UPDATE template for table 'quiz_pin_option'
--
UPDATE quiz_pin_option SET "id" = ?, "text" = ? WHERE 1=2;

--
-- DELETE template for table 'quiz_pin_option'
--
DELETE FROM quiz_pin_option WHERE 1=2;

