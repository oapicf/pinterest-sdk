--
-- "Pinterest REST API"
-- Prepared SQL queries for 'DeleteBusinessMembershipBody' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'delete_business_membership_body'
--
SELECT members FROM delete_business_membership_body WHERE 1=1;

--
-- INSERT template for table 'delete_business_membership_body'
--
INSERT INTO delete_business_membership_body (members) VALUES (?);

--
-- UPDATE template for table 'delete_business_membership_body'
--
UPDATE delete_business_membership_body SET members = ? WHERE 1=2;

--
-- DELETE template for table 'delete_business_membership_body'
--
DELETE FROM delete_business_membership_body WHERE 1=2;

