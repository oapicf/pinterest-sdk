--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_account_to_ad_account_shared_audience_update_with_required_b'
--
SELECT audience_id, operation_type, recipient_account_ids FROM ad_account_to_ad_account_shared_audience_update_with_required_b WHERE 1=1;

--
-- INSERT template for table 'ad_account_to_ad_account_shared_audience_update_with_required_b'
--
INSERT INTO ad_account_to_ad_account_shared_audience_update_with_required_b (audience_id, operation_type, recipient_account_ids) VALUES (?, ?, ?);

--
-- UPDATE template for table 'ad_account_to_ad_account_shared_audience_update_with_required_b'
--
UPDATE ad_account_to_ad_account_shared_audience_update_with_required_b SET audience_id = ?, operation_type = ?, recipient_account_ids = ? WHERE 1=2;

--
-- DELETE template for table 'ad_account_to_ad_account_shared_audience_update_with_required_b'
--
DELETE FROM ad_account_to_ad_account_shared_audience_update_with_required_b WHERE 1=2;

