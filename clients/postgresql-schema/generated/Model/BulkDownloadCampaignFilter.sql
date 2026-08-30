--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BulkDownloadCampaignFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'bulk_download_campaign_filter'
--
SELECT campaign_status, end_time, "name", objective_type, start_time FROM bulk_download_campaign_filter WHERE 1=1;

--
-- INSERT template for table 'bulk_download_campaign_filter'
--
INSERT INTO bulk_download_campaign_filter (campaign_status, end_time, "name", objective_type, start_time) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'bulk_download_campaign_filter'
--
UPDATE bulk_download_campaign_filter SET campaign_status = ?, end_time = ?, "name" = ?, objective_type = ?, start_time = ? WHERE 1=2;

--
-- DELETE template for table 'bulk_download_campaign_filter'
--
DELETE FROM bulk_download_campaign_filter WHERE 1=2;

