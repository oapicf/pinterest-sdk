--
-- "Pinterest REST API"
-- Prepared SQL queries for 'SystemUserUpdateWithRequiredBody' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'system_user_update_with_required_body'
--
SELECT "name" FROM system_user_update_with_required_body WHERE 1=1;

--
-- INSERT template for table 'system_user_update_with_required_body'
--
INSERT INTO system_user_update_with_required_body ("name") VALUES (?);

--
-- UPDATE template for table 'system_user_update_with_required_body'
--
UPDATE system_user_update_with_required_body SET "name" = ? WHERE 1=2;

--
-- DELETE template for table 'system_user_update_with_required_body'
--
DELETE FROM system_user_update_with_required_body WHERE 1=2;

