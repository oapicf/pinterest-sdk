--
-- "Pinterest REST API"
-- Prepared SQL queries for 'InviteExceptionResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'invite_exception_response'
--
SELECT code, invite_or_request_id, message, users_or_partner_ids FROM invite_exception_response WHERE 1=1;

--
-- INSERT template for table 'invite_exception_response'
--
INSERT INTO invite_exception_response (code, invite_or_request_id, message, users_or_partner_ids) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'invite_exception_response'
--
UPDATE invite_exception_response SET code = ?, invite_or_request_id = ?, message = ?, users_or_partner_ids = ? WHERE 1=2;

--
-- DELETE template for table 'invite_exception_response'
--
DELETE FROM invite_exception_response WHERE 1=2;

