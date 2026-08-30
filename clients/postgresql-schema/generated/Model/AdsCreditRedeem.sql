--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdsCreditRedeem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ads_credit_redeem'
--
SELECT error_code, error_message, success FROM ads_credit_redeem WHERE 1=1;

--
-- INSERT template for table 'ads_credit_redeem'
--
INSERT INTO ads_credit_redeem (error_code, error_message, success) VALUES (?, ?, ?);

--
-- UPDATE template for table 'ads_credit_redeem'
--
UPDATE ads_credit_redeem SET error_code = ?, error_message = ?, success = ? WHERE 1=2;

--
-- DELETE template for table 'ads_credit_redeem'
--
DELETE FROM ads_credit_redeem WHERE 1=2;

