--
-- "Pinterest REST API"
-- Prepared SQL queries for 'KeywordError' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'keyword_error'
--
SELECT "data", error_messages FROM keyword_error WHERE 1=1;

--
-- INSERT template for table 'keyword_error'
--
INSERT INTO keyword_error ("data", error_messages) VALUES (?, ?);

--
-- UPDATE template for table 'keyword_error'
--
UPDATE keyword_error SET "data" = ?, error_messages = ? WHERE 1=2;

--
-- DELETE template for table 'keyword_error'
--
DELETE FROM keyword_error WHERE 1=2;

