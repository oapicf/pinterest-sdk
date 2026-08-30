--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LabelCreateItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'label_create_item'
--
SELECT label_type, "value" FROM label_create_item WHERE 1=1;

--
-- INSERT template for table 'label_create_item'
--
INSERT INTO label_create_item (label_type, "value") VALUES (?, ?);

--
-- UPDATE template for table 'label_create_item'
--
UPDATE label_create_item SET label_type = ?, "value" = ? WHERE 1=2;

--
-- DELETE template for table 'label_create_item'
--
DELETE FROM label_create_item WHERE 1=2;

