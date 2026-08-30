--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdGroupAudienceSizingKeyword' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_group_audience_sizing_keyword'
--
SELECT match_type, "value" FROM ad_group_audience_sizing_keyword WHERE 1=1;

--
-- INSERT template for table 'ad_group_audience_sizing_keyword'
--
INSERT INTO ad_group_audience_sizing_keyword (match_type, "value") VALUES (?, ?);

--
-- UPDATE template for table 'ad_group_audience_sizing_keyword'
--
UPDATE ad_group_audience_sizing_keyword SET match_type = ?, "value" = ? WHERE 1=2;

--
-- DELETE template for table 'ad_group_audience_sizing_keyword'
--
DELETE FROM ad_group_audience_sizing_keyword WHERE 1=2;

