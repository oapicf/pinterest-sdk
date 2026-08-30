--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CreateMembershipOrPartnershipInvitesBody' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'create_membership_or_partnership_invites_body'
--
SELECT business_role, invite_type, members, partners FROM create_membership_or_partnership_invites_body WHERE 1=1;

--
-- INSERT template for table 'create_membership_or_partnership_invites_body'
--
INSERT INTO create_membership_or_partnership_invites_body (business_role, invite_type, members, partners) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'create_membership_or_partnership_invites_body'
--
UPDATE create_membership_or_partnership_invites_body SET business_role = ?, invite_type = ?, members = ?, partners = ? WHERE 1=2;

--
-- DELETE template for table 'create_membership_or_partnership_invites_body'
--
DELETE FROM create_membership_or_partnership_invites_body WHERE 1=2;

