--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdsCreditDiscountsResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ads_credit_discounts_response'
--
SELECT active, advertiser_id, discount_currency, discount_in_micro_currency, discount_type, remaining_discount_in_micro_currency, title FROM ads_credit_discounts_response WHERE 1=1;

--
-- INSERT template for table 'ads_credit_discounts_response'
--
INSERT INTO ads_credit_discounts_response (active, advertiser_id, discount_currency, discount_in_micro_currency, discount_type, remaining_discount_in_micro_currency, title) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ads_credit_discounts_response'
--
UPDATE ads_credit_discounts_response SET active = ?, advertiser_id = ?, discount_currency = ?, discount_in_micro_currency = ?, discount_type = ?, remaining_discount_in_micro_currency = ?, title = ? WHERE 1=2;

--
-- DELETE template for table 'ads_credit_discounts_response'
--
DELETE FROM ads_credit_discounts_response WHERE 1=2;

