--
-- "Pinterest REST API"
-- Prepared SQL queries for 'NotificationResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'notification_response'
--
SELECT error_msg, received_at, success FROM notification_response WHERE 1=1;

--
-- INSERT template for table 'notification_response'
--
INSERT INTO notification_response (error_msg, received_at, success) VALUES (?, ?, ?);

--
-- UPDATE template for table 'notification_response'
--
UPDATE notification_response SET error_msg = ?, received_at = ?, success = ? WHERE 1=2;

--
-- DELETE template for table 'notification_response'
--
DELETE FROM notification_response WHERE 1=2;

