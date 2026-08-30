--
-- "Pinterest REST API"
-- Prepared SQL queries for 'InviteBusinessRoleBinding' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'invite_business_role_binding'
--
SELECT created_by_business_id, created_by_user_id, "id", invite_data, is_received_invite, "user" FROM invite_business_role_binding WHERE 1=1;

--
-- INSERT template for table 'invite_business_role_binding'
--
INSERT INTO invite_business_role_binding (created_by_business_id, created_by_user_id, "id", invite_data, is_received_invite, "user") VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'invite_business_role_binding'
--
UPDATE invite_business_role_binding SET created_by_business_id = ?, created_by_user_id = ?, "id" = ?, invite_data = ?, is_received_invite = ?, "user" = ? WHERE 1=2;

--
-- DELETE template for table 'invite_business_role_binding'
--
DELETE FROM invite_business_role_binding WHERE 1=2;

