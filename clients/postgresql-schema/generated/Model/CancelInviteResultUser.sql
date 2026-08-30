--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CancelInviteResultUser' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'cancel_invite_result_user'
--
SELECT email, "id", username FROM cancel_invite_result_user WHERE 1=1;

--
-- INSERT template for table 'cancel_invite_result_user'
--
INSERT INTO cancel_invite_result_user (email, "id", username) VALUES (?, ?, ?);

--
-- UPDATE template for table 'cancel_invite_result_user'
--
UPDATE cancel_invite_result_user SET email = ?, "id" = ?, username = ? WHERE 1=2;

--
-- DELETE template for table 'cancel_invite_result_user'
--
DELETE FROM cancel_invite_result_user WHERE 1=2;

