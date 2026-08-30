--
-- "Pinterest REST API"
-- Prepared SQL queries for 'DeleteMemberAccessResult' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'delete_member_access_result'
--
SELECT asset_id, member_id FROM delete_member_access_result WHERE 1=1;

--
-- INSERT template for table 'delete_member_access_result'
--
INSERT INTO delete_member_access_result (asset_id, member_id) VALUES (?, ?);

--
-- UPDATE template for table 'delete_member_access_result'
--
UPDATE delete_member_access_result SET asset_id = ?, member_id = ? WHERE 1=2;

--
-- DELETE template for table 'delete_member_access_result'
--
DELETE FROM delete_member_access_result WHERE 1=2;

