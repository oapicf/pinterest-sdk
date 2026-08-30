--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignAdPreviewCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_ad_preview_create'
--
SELECT ad_group_id FROM campaign_ad_preview_create WHERE 1=1;

--
-- INSERT template for table 'campaign_ad_preview_create'
--
INSERT INTO campaign_ad_preview_create (ad_group_id) VALUES (?);

--
-- UPDATE template for table 'campaign_ad_preview_create'
--
UPDATE campaign_ad_preview_create SET ad_group_id = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_ad_preview_create'
--
DELETE FROM campaign_ad_preview_create WHERE 1=2;

