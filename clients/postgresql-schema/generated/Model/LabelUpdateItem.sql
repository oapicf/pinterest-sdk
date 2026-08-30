--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LabelUpdateItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'label_update_item'
--
SELECT "id", status, "value" FROM label_update_item WHERE 1=1;

--
-- INSERT template for table 'label_update_item'
--
INSERT INTO label_update_item ("id", status, "value") VALUES (?, ?, ?);

--
-- UPDATE template for table 'label_update_item'
--
UPDATE label_update_item SET "id" = ?, status = ?, "value" = ? WHERE 1=2;

--
-- DELETE template for table 'label_update_item'
--
DELETE FROM label_update_item WHERE 1=2;

