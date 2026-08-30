--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsAiContentDisclosure' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_ai_content_disclosure'
--
SELECT disclosure, url FROM catalogs_ai_content_disclosure WHERE 1=1;

--
-- INSERT template for table 'catalogs_ai_content_disclosure'
--
INSERT INTO catalogs_ai_content_disclosure (disclosure, url) VALUES (?, ?);

--
-- UPDATE template for table 'catalogs_ai_content_disclosure'
--
UPDATE catalogs_ai_content_disclosure SET disclosure = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_ai_content_disclosure'
--
DELETE FROM catalogs_ai_content_disclosure WHERE 1=2;

