--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LabeledEntities' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'labeled_entities'
--
SELECT entities_labels, errors FROM labeled_entities WHERE 1=1;

--
-- INSERT template for table 'labeled_entities'
--
INSERT INTO labeled_entities (entities_labels, errors) VALUES (?, ?);

--
-- UPDATE template for table 'labeled_entities'
--
UPDATE labeled_entities SET entities_labels = ?, errors = ? WHERE 1=2;

--
-- DELETE template for table 'labeled_entities'
--
DELETE FROM labeled_entities WHERE 1=2;

