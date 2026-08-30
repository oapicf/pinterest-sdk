--
-- "Pinterest REST API"
-- Prepared SQL queries for 'QuizPinResult' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'quiz_pin_result'
--
SELECT android_deep_link, destination_url, ios_deep_link, organic_pin_id, result_id FROM quiz_pin_result WHERE 1=1;

--
-- INSERT template for table 'quiz_pin_result'
--
INSERT INTO quiz_pin_result (android_deep_link, destination_url, ios_deep_link, organic_pin_id, result_id) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'quiz_pin_result'
--
UPDATE quiz_pin_result SET android_deep_link = ?, destination_url = ?, ios_deep_link = ?, organic_pin_id = ?, result_id = ? WHERE 1=2;

--
-- DELETE template for table 'quiz_pin_result'
--
DELETE FROM quiz_pin_result WHERE 1=2;

