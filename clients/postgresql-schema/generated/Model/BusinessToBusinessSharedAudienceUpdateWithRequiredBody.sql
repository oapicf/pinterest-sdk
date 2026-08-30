--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BusinessToBusinessSharedAudienceUpdateWithRequiredBody' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'business_to_business_shared_audience_update_with_required_body'
--
SELECT audience_id, operation_type, recipient_business_ids FROM business_to_business_shared_audience_update_with_required_body WHERE 1=1;

--
-- INSERT template for table 'business_to_business_shared_audience_update_with_required_body'
--
INSERT INTO business_to_business_shared_audience_update_with_required_body (audience_id, operation_type, recipient_business_ids) VALUES (?, ?, ?);

--
-- UPDATE template for table 'business_to_business_shared_audience_update_with_required_body'
--
UPDATE business_to_business_shared_audience_update_with_required_body SET audience_id = ?, operation_type = ?, recipient_business_ids = ? WHERE 1=2;

--
-- DELETE template for table 'business_to_business_shared_audience_update_with_required_body'
--
DELETE FROM business_to_business_shared_audience_update_with_required_body WHERE 1=2;

