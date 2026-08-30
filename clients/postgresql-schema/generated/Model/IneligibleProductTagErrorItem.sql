--
-- "Pinterest REST API"
-- Prepared SQL queries for 'IneligibleProductTagErrorItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ineligible_product_tag_error_item'
--
SELECT error_message, pin_id FROM ineligible_product_tag_error_item WHERE 1=1;

--
-- INSERT template for table 'ineligible_product_tag_error_item'
--
INSERT INTO ineligible_product_tag_error_item (error_message, pin_id) VALUES (?, ?);

--
-- UPDATE template for table 'ineligible_product_tag_error_item'
--
UPDATE ineligible_product_tag_error_item SET error_message = ?, pin_id = ? WHERE 1=2;

--
-- DELETE template for table 'ineligible_product_tag_error_item'
--
DELETE FROM ineligible_product_tag_error_item WHERE 1=2;

