--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdUpdateRequestAllOf1' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_update_request_all_of1'
--
SELECT "id", pin_id FROM ad_update_request_all_of1 WHERE 1=1;

--
-- INSERT template for table 'ad_update_request_all_of1'
--
INSERT INTO ad_update_request_all_of1 ("id", pin_id) VALUES (?, ?);

--
-- UPDATE template for table 'ad_update_request_all_of1'
--
UPDATE ad_update_request_all_of1 SET "id" = ?, pin_id = ? WHERE 1=2;

--
-- DELETE template for table 'ad_update_request_all_of1'
--
DELETE FROM ad_update_request_all_of1 WHERE 1=2;

