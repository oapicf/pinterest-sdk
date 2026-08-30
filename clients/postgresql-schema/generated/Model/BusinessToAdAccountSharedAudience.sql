--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BusinessToAdAccountSharedAudience' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'business_to_ad_account_shared_audience'
--
SELECT audience_id, permissions, recipient_account_ids FROM business_to_ad_account_shared_audience WHERE 1=1;

--
-- INSERT template for table 'business_to_ad_account_shared_audience'
--
INSERT INTO business_to_ad_account_shared_audience (audience_id, permissions, recipient_account_ids) VALUES (?, ?, ?);

--
-- UPDATE template for table 'business_to_ad_account_shared_audience'
--
UPDATE business_to_ad_account_shared_audience SET audience_id = ?, permissions = ?, recipient_account_ids = ? WHERE 1=2;

--
-- DELETE template for table 'business_to_ad_account_shared_audience'
--
DELETE FROM business_to_ad_account_shared_audience WHERE 1=2;

