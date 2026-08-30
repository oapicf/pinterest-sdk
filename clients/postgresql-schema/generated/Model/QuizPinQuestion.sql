--
-- "Pinterest REST API"
-- Prepared SQL queries for 'QuizPinQuestion' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'quiz_pin_question'
--
SELECT "options", question_id, question_text FROM quiz_pin_question WHERE 1=1;

--
-- INSERT template for table 'quiz_pin_question'
--
INSERT INTO quiz_pin_question ("options", question_id, question_text) VALUES (?, ?, ?);

--
-- UPDATE template for table 'quiz_pin_question'
--
UPDATE quiz_pin_question SET "options" = ?, question_id = ?, question_text = ? WHERE 1=2;

--
-- DELETE template for table 'quiz_pin_question'
--
DELETE FROM quiz_pin_question WHERE 1=2;

