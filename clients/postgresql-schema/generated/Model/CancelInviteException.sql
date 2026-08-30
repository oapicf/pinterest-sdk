--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CancelInviteException' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'cancel_invite_exception'
--
SELECT invite_id, message FROM cancel_invite_exception WHERE 1=1;

--
-- INSERT template for table 'cancel_invite_exception'
--
INSERT INTO cancel_invite_exception (invite_id, message) VALUES (?, ?);

--
-- UPDATE template for table 'cancel_invite_exception'
--
UPDATE cancel_invite_exception SET invite_id = ?, message = ? WHERE 1=2;

--
-- DELETE template for table 'cancel_invite_exception'
--
DELETE FROM cancel_invite_exception WHERE 1=2;

