--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdAccountToBusinessSharedAudienceUpdateWithRequiredBody' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_account_to_business_shared_audience_update_with_required_bod'
--
SELECT audience_id, operation_type, recipient_business_ids FROM ad_account_to_business_shared_audience_update_with_required_bod WHERE 1=1;

--
-- INSERT template for table 'ad_account_to_business_shared_audience_update_with_required_bod'
--
INSERT INTO ad_account_to_business_shared_audience_update_with_required_bod (audience_id, operation_type, recipient_business_ids) VALUES (?, ?, ?);

--
-- UPDATE template for table 'ad_account_to_business_shared_audience_update_with_required_bod'
--
UPDATE ad_account_to_business_shared_audience_update_with_required_bod SET audience_id = ?, operation_type = ?, recipient_business_ids = ? WHERE 1=2;

--
-- DELETE template for table 'ad_account_to_business_shared_audience_update_with_required_bod'
--
DELETE FROM ad_account_to_business_shared_audience_update_with_required_bod WHERE 1=2;

