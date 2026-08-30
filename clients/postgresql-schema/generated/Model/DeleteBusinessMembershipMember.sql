--
-- "Pinterest REST API"
-- Prepared SQL queries for 'DeleteBusinessMembershipMember' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'delete_business_membership_member'
--
SELECT business_role, member_id FROM delete_business_membership_member WHERE 1=1;

--
-- INSERT template for table 'delete_business_membership_member'
--
INSERT INTO delete_business_membership_member (business_role, member_id) VALUES (?, ?);

--
-- UPDATE template for table 'delete_business_membership_member'
--
UPDATE delete_business_membership_member SET business_role = ?, member_id = ? WHERE 1=2;

--
-- DELETE template for table 'delete_business_membership_member'
--
DELETE FROM delete_business_membership_member WHERE 1=2;

