--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdGroupAudienceSizing' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_group_audience_sizing'
--
SELECT audience_size_lower_bound, audience_size_upper_bound FROM ad_group_audience_sizing WHERE 1=1;

--
-- INSERT template for table 'ad_group_audience_sizing'
--
INSERT INTO ad_group_audience_sizing (audience_size_lower_bound, audience_size_upper_bound) VALUES (?, ?);

--
-- UPDATE template for table 'ad_group_audience_sizing'
--
UPDATE ad_group_audience_sizing SET audience_size_lower_bound = ?, audience_size_upper_bound = ? WHERE 1=2;

--
-- DELETE template for table 'ad_group_audience_sizing'
--
DELETE FROM ad_group_audience_sizing WHERE 1=2;

