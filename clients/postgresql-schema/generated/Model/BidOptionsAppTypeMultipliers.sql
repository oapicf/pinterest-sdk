--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BidOptionsAppTypeMultipliers' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'bid_options_app_type_multipliers'
--
SELECT android_mobile, android_tablet, ipad, iphone, web, web_mobile FROM bid_options_app_type_multipliers WHERE 1=1;

--
-- INSERT template for table 'bid_options_app_type_multipliers'
--
INSERT INTO bid_options_app_type_multipliers (android_mobile, android_tablet, ipad, iphone, web, web_mobile) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'bid_options_app_type_multipliers'
--
UPDATE bid_options_app_type_multipliers SET android_mobile = ?, android_tablet = ?, ipad = ?, iphone = ?, web = ?, web_mobile = ? WHERE 1=2;

--
-- DELETE template for table 'bid_options_app_type_multipliers'
--
DELETE FROM bid_options_app_type_multipliers WHERE 1=2;

