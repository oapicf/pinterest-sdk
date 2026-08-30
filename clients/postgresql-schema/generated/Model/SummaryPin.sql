--
-- "Pinterest REST API"
-- Prepared SQL queries for 'SummaryPin' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'summary_pin'
--
SELECT alt_text, description, "id", "link", media, title FROM summary_pin WHERE 1=1;

--
-- INSERT template for table 'summary_pin'
--
INSERT INTO summary_pin (alt_text, description, "id", "link", media, title) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'summary_pin'
--
UPDATE summary_pin SET alt_text = ?, description = ?, "id" = ?, "link" = ?, media = ?, title = ? WHERE 1=2;

--
-- DELETE template for table 'summary_pin'
--
DELETE FROM summary_pin WHERE 1=2;

