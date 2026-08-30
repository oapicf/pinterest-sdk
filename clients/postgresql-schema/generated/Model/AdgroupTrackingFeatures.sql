--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdgroupTrackingFeatures' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'adgroup_tracking_features'
--
SELECT enabled FROM adgroup_tracking_features WHERE 1=1;

--
-- INSERT template for table 'adgroup_tracking_features'
--
INSERT INTO adgroup_tracking_features (enabled) VALUES (?);

--
-- UPDATE template for table 'adgroup_tracking_features'
--
UPDATE adgroup_tracking_features SET enabled = ? WHERE 1=2;

--
-- DELETE template for table 'adgroup_tracking_features'
--
DELETE FROM adgroup_tracking_features WHERE 1=2;

