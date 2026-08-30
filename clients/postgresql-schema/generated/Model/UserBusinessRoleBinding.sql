--
-- "Pinterest REST API"
-- Prepared SQL queries for 'UserBusinessRoleBinding' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'user_business_role_binding'
--
SELECT assets_summary, business_roles, created_by_business, created_by_user, created_time, "id", is_shared_partner, "user" FROM user_business_role_binding WHERE 1=1;

--
-- INSERT template for table 'user_business_role_binding'
--
INSERT INTO user_business_role_binding (assets_summary, business_roles, created_by_business, created_by_user, created_time, "id", is_shared_partner, "user") VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'user_business_role_binding'
--
UPDATE user_business_role_binding SET assets_summary = ?, business_roles = ?, created_by_business = ?, created_by_user = ?, created_time = ?, "id" = ?, is_shared_partner = ?, "user" = ? WHERE 1=2;

--
-- DELETE template for table 'user_business_role_binding'
--
DELETE FROM user_business_role_binding WHERE 1=2;

