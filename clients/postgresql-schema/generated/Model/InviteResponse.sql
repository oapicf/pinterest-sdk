--
-- "Pinterest REST API"
-- Prepared SQL queries for 'InviteResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'invite_response'
--
SELECT assets_summary, business_roles, created_by_business, created_by_user, created_time, "id", invite_data, is_received_invite, "user" FROM invite_response WHERE 1=1;

--
-- INSERT template for table 'invite_response'
--
INSERT INTO invite_response (assets_summary, business_roles, created_by_business, created_by_user, created_time, "id", invite_data, is_received_invite, "user") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'invite_response'
--
UPDATE invite_response SET assets_summary = ?, business_roles = ?, created_by_business = ?, created_by_user = ?, created_time = ?, "id" = ?, invite_data = ?, is_received_invite = ?, "user" = ? WHERE 1=2;

--
-- DELETE template for table 'invite_response'
--
DELETE FROM invite_response WHERE 1=2;

