--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdAccountToBusinessSharedAudience' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_account_to_business_shared_audience'
--
SELECT audience_id, permissions, recipient_business_ids FROM ad_account_to_business_shared_audience WHERE 1=1;

--
-- INSERT template for table 'ad_account_to_business_shared_audience'
--
INSERT INTO ad_account_to_business_shared_audience (audience_id, permissions, recipient_business_ids) VALUES (?, ?, ?);

--
-- UPDATE template for table 'ad_account_to_business_shared_audience'
--
UPDATE ad_account_to_business_shared_audience SET audience_id = ?, permissions = ?, recipient_business_ids = ? WHERE 1=2;

--
-- DELETE template for table 'ad_account_to_business_shared_audience'
--
DELETE FROM ad_account_to_business_shared_audience WHERE 1=2;

