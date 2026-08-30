--
-- "Pinterest REST API"
-- Prepared SQL queries for 'RelatedTerms' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'related_terms'
--
SELECT "id", related_term_count, related_terms_list FROM related_terms WHERE 1=1;

--
-- INSERT template for table 'related_terms'
--
INSERT INTO related_terms ("id", related_term_count, related_terms_list) VALUES (?, ?, ?);

--
-- UPDATE template for table 'related_terms'
--
UPDATE related_terms SET "id" = ?, related_term_count = ?, related_terms_list = ? WHERE 1=2;

--
-- DELETE template for table 'related_terms'
--
DELETE FROM related_terms WHERE 1=2;

