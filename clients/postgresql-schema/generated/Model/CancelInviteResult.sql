--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CancelInviteResult' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'cancel_invite_result'
--
SELECT "id", invite_data, is_received_invite, "user" FROM cancel_invite_result WHERE 1=1;

--
-- INSERT template for table 'cancel_invite_result'
--
INSERT INTO cancel_invite_result ("id", invite_data, is_received_invite, "user") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'cancel_invite_result'
--
UPDATE cancel_invite_result SET "id" = ?, invite_data = ?, is_received_invite = ?, "user" = ? WHERE 1=2;

--
-- DELETE template for table 'cancel_invite_result'
--
DELETE FROM cancel_invite_result WHERE 1=2;

