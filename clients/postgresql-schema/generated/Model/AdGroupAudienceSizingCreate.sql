--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdGroupAudienceSizingCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_group_audience_sizing_create'
--
SELECT auto_targeting_enabled, creative_types, keywords, placement_group, product_group_ids, targeting_spec FROM ad_group_audience_sizing_create WHERE 1=1;

--
-- INSERT template for table 'ad_group_audience_sizing_create'
--
INSERT INTO ad_group_audience_sizing_create (auto_targeting_enabled, creative_types, keywords, placement_group, product_group_ids, targeting_spec) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ad_group_audience_sizing_create'
--
UPDATE ad_group_audience_sizing_create SET auto_targeting_enabled = ?, creative_types = ?, keywords = ?, placement_group = ?, product_group_ids = ?, targeting_spec = ? WHERE 1=2;

--
-- DELETE template for table 'ad_group_audience_sizing_create'
--
DELETE FROM ad_group_audience_sizing_create WHERE 1=2;

