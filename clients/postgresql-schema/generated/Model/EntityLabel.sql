--
-- "Pinterest REST API"
-- Prepared SQL queries for 'EntityLabel' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'entity_label'
--
SELECT entity_id, entity_type, label_id, status FROM entity_label WHERE 1=1;

--
-- INSERT template for table 'entity_label'
--
INSERT INTO entity_label (entity_id, entity_type, label_id, status) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'entity_label'
--
UPDATE entity_label SET entity_id = ?, entity_type = ?, label_id = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'entity_label'
--
DELETE FROM entity_label WHERE 1=2;

