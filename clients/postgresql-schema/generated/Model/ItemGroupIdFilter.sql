--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ItemGroupIdFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_group_id_filter'
--
SELECT item_group_id FROM item_group_id_filter WHERE 1=1;

--
-- INSERT template for table 'item_group_id_filter'
--
INSERT INTO item_group_id_filter (item_group_id) VALUES (?);

--
-- UPDATE template for table 'item_group_id_filter'
--
UPDATE item_group_id_filter SET item_group_id = ? WHERE 1=2;

--
-- DELETE template for table 'item_group_id_filter'
--
DELETE FROM item_group_id_filter WHERE 1=2;

