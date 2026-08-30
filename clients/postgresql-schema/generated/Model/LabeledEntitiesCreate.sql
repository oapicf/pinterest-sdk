--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LabeledEntitiesCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'labeled_entities_create'
--
SELECT entity_ids FROM labeled_entities_create WHERE 1=1;

--
-- INSERT template for table 'labeled_entities_create'
--
INSERT INTO labeled_entities_create (entity_ids) VALUES (?);

--
-- UPDATE template for table 'labeled_entities_create'
--
UPDATE labeled_entities_create SET entity_ids = ? WHERE 1=2;

--
-- DELETE template for table 'labeled_entities_create'
--
DELETE FROM labeled_entities_create WHERE 1=2;

