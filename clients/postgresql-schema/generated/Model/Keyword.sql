--
-- "Pinterest REST API"
-- Prepared SQL queries for 'Keyword' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'keyword'
--
SELECT archived, bid, "id", match_type, parent_id, parent_type, "type", "value" FROM keyword WHERE 1=1;

--
-- INSERT template for table 'keyword'
--
INSERT INTO keyword (archived, bid, "id", match_type, parent_id, parent_type, "type", "value") VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'keyword'
--
UPDATE keyword SET archived = ?, bid = ?, "id" = ?, match_type = ?, parent_id = ?, parent_type = ?, "type" = ?, "value" = ? WHERE 1=2;

--
-- DELETE template for table 'keyword'
--
DELETE FROM keyword WHERE 1=2;

