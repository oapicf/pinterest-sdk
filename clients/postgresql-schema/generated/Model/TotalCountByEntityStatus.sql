--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TotalCountByEntityStatus' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'total_count_by_entity_status'
--
SELECT active, archived, paused FROM total_count_by_entity_status WHERE 1=1;

--
-- INSERT template for table 'total_count_by_entity_status'
--
INSERT INTO total_count_by_entity_status (active, archived, paused) VALUES (?, ?, ?);

--
-- UPDATE template for table 'total_count_by_entity_status'
--
UPDATE total_count_by_entity_status SET active = ?, archived = ?, paused = ? WHERE 1=2;

--
-- DELETE template for table 'total_count_by_entity_status'
--
DELETE FROM total_count_by_entity_status WHERE 1=2;

