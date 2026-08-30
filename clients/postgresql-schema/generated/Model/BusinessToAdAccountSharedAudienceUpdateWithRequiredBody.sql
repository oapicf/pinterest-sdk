--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BusinessToAdAccountSharedAudienceUpdateWithRequiredBody' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'business_to_ad_account_shared_audience_update_with_required_bod'
--
SELECT audience_id, operation_type, recipient_account_ids FROM business_to_ad_account_shared_audience_update_with_required_bod WHERE 1=1;

--
-- INSERT template for table 'business_to_ad_account_shared_audience_update_with_required_bod'
--
INSERT INTO business_to_ad_account_shared_audience_update_with_required_bod (audience_id, operation_type, recipient_account_ids) VALUES (?, ?, ?);

--
-- UPDATE template for table 'business_to_ad_account_shared_audience_update_with_required_bod'
--
UPDATE business_to_ad_account_shared_audience_update_with_required_bod SET audience_id = ?, operation_type = ?, recipient_account_ids = ? WHERE 1=2;

--
-- DELETE template for table 'business_to_ad_account_shared_audience_update_with_required_bod'
--
DELETE FROM business_to_ad_account_shared_audience_update_with_required_bod WHERE 1=2;

