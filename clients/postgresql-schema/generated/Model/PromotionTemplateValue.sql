--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PromotionTemplateValue' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'promotion_template_value'
--
SELECT amount, currency_code, custom_text, "percent" FROM promotion_template_value WHERE 1=1;

--
-- INSERT template for table 'promotion_template_value'
--
INSERT INTO promotion_template_value (amount, currency_code, custom_text, "percent") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'promotion_template_value'
--
UPDATE promotion_template_value SET amount = ?, currency_code = ?, custom_text = ?, "percent" = ? WHERE 1=2;

--
-- DELETE template for table 'promotion_template_value'
--
DELETE FROM promotion_template_value WHERE 1=2;

