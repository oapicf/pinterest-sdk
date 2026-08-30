--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdGroupUpdateRequestAllOf1' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_group_update_request_all_of1'
--
SELECT bid_multiplier, "id", targeting_spec_operations FROM ad_group_update_request_all_of1 WHERE 1=1;

--
-- INSERT template for table 'ad_group_update_request_all_of1'
--
INSERT INTO ad_group_update_request_all_of1 (bid_multiplier, "id", targeting_spec_operations) VALUES (?, ?, ?);

--
-- UPDATE template for table 'ad_group_update_request_all_of1'
--
UPDATE ad_group_update_request_all_of1 SET bid_multiplier = ?, "id" = ?, targeting_spec_operations = ? WHERE 1=2;

--
-- DELETE template for table 'ad_group_update_request_all_of1'
--
DELETE FROM ad_group_update_request_all_of1 WHERE 1=2;

