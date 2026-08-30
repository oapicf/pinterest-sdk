--
-- "Pinterest REST API"
-- Prepared SQL queries for 'QuizPinData' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'quiz_pin_data'
--
SELECT questions, results, tie_breaker_custom_result, tie_breaker_type FROM quiz_pin_data WHERE 1=1;

--
-- INSERT template for table 'quiz_pin_data'
--
INSERT INTO quiz_pin_data (questions, results, tie_breaker_custom_result, tie_breaker_type) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'quiz_pin_data'
--
UPDATE quiz_pin_data SET questions = ?, results = ?, tie_breaker_custom_result = ?, tie_breaker_type = ? WHERE 1=2;

--
-- DELETE template for table 'quiz_pin_data'
--
DELETE FROM quiz_pin_data WHERE 1=2;

