--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CancelInviteResultItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'cancel_invite_result_item'
--
SELECT "exception", invite FROM cancel_invite_result_item WHERE 1=1;

--
-- INSERT template for table 'cancel_invite_result_item'
--
INSERT INTO cancel_invite_result_item ("exception", invite) VALUES (?, ?);

--
-- UPDATE template for table 'cancel_invite_result_item'
--
UPDATE cancel_invite_result_item SET "exception" = ?, invite = ? WHERE 1=2;

--
-- DELETE template for table 'cancel_invite_result_item'
--
DELETE FROM cancel_invite_result_item WHERE 1=2;

