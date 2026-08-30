--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TrendsEditorial' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'trends_editorial'
--
SELECT board_url, description, interests, pins_url, related_keywords, title FROM trends_editorial WHERE 1=1;

--
-- INSERT template for table 'trends_editorial'
--
INSERT INTO trends_editorial (board_url, description, interests, pins_url, related_keywords, title) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'trends_editorial'
--
UPDATE trends_editorial SET board_url = ?, description = ?, interests = ?, pins_url = ?, related_keywords = ?, title = ? WHERE 1=2;

--
-- DELETE template for table 'trends_editorial'
--
DELETE FROM trends_editorial WHERE 1=2;

