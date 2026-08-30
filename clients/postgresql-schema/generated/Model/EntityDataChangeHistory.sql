--
-- "Pinterest REST API"
-- Prepared SQL queries for 'EntityDataChangeHistory' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'entity_data_change_history'
--
SELECT changed_field_id, changed_field_name, data_type, new_data_value, old_data_value FROM entity_data_change_history WHERE 1=1;

--
-- INSERT template for table 'entity_data_change_history'
--
INSERT INTO entity_data_change_history (changed_field_id, changed_field_name, data_type, new_data_value, old_data_value) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'entity_data_change_history'
--
UPDATE entity_data_change_history SET changed_field_id = ?, changed_field_name = ?, data_type = ?, new_data_value = ?, old_data_value = ? WHERE 1=2;

--
-- DELETE template for table 'entity_data_change_history'
--
DELETE FROM entity_data_change_history WHERE 1=2;

