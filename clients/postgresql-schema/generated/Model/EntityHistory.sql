--
-- "Pinterest REST API"
-- Prepared SQL queries for 'EntityHistory' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'entity_history'
--
SELECT change_timestamp, data_changes, entity_id, entity_name, ldap, operation, user_id FROM entity_history WHERE 1=1;

--
-- INSERT template for table 'entity_history'
--
INSERT INTO entity_history (change_timestamp, data_changes, entity_id, entity_name, ldap, operation, user_id) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'entity_history'
--
UPDATE entity_history SET change_timestamp = ?, data_changes = ?, entity_id = ?, entity_name = ?, ldap = ?, operation = ?, user_id = ? WHERE 1=2;

--
-- DELETE template for table 'entity_history'
--
DELETE FROM entity_history WHERE 1=2;

