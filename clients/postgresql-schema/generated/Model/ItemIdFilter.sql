--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ItemIdFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_id_filter'
--
SELECT item_id FROM item_id_filter WHERE 1=1;

--
-- INSERT template for table 'item_id_filter'
--
INSERT INTO item_id_filter (item_id) VALUES (?);

--
-- UPDATE template for table 'item_id_filter'
--
UPDATE item_id_filter SET item_id = ? WHERE 1=2;

--
-- DELETE template for table 'item_id_filter'
--
DELETE FROM item_id_filter WHERE 1=2;

