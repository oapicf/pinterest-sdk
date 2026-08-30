--
-- "Pinterest REST API"
-- Prepared SQL queries for 'campaign_ad_preview_delete_200_response_inner_status' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_ad_preview_delete_200_response_inner_status'
--
SELECT status_code, code, message FROM campaign_ad_preview_delete_200_response_inner_status WHERE 1=1;

--
-- INSERT template for table 'campaign_ad_preview_delete_200_response_inner_status'
--
INSERT INTO campaign_ad_preview_delete_200_response_inner_status (status_code, code, message) VALUES (?, ?, ?);

--
-- UPDATE template for table 'campaign_ad_preview_delete_200_response_inner_status'
--
UPDATE campaign_ad_preview_delete_200_response_inner_status SET status_code = ?, code = ?, message = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_ad_preview_delete_200_response_inner_status'
--
DELETE FROM campaign_ad_preview_delete_200_response_inner_status WHERE 1=2;

