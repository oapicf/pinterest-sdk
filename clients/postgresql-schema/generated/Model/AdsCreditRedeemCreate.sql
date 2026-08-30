--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdsCreditRedeemCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ads_credit_redeem_create'
--
SELECT offer_code_hash, validate_only FROM ads_credit_redeem_create WHERE 1=1;

--
-- INSERT template for table 'ads_credit_redeem_create'
--
INSERT INTO ads_credit_redeem_create (offer_code_hash, validate_only) VALUES (?, ?);

--
-- UPDATE template for table 'ads_credit_redeem_create'
--
UPDATE ads_credit_redeem_create SET offer_code_hash = ?, validate_only = ? WHERE 1=2;

--
-- DELETE template for table 'ads_credit_redeem_create'
--
DELETE FROM ads_credit_redeem_create WHERE 1=2;

