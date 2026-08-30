--
-- "Pinterest REST API"
-- Prepared SQL queries for 'IneligibleProductTagsErrorDetails' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ineligible_product_tags_error_details'
--
SELECT product_tags FROM ineligible_product_tags_error_details WHERE 1=1;

--
-- INSERT template for table 'ineligible_product_tags_error_details'
--
INSERT INTO ineligible_product_tags_error_details (product_tags) VALUES (?);

--
-- UPDATE template for table 'ineligible_product_tags_error_details'
--
UPDATE ineligible_product_tags_error_details SET product_tags = ? WHERE 1=2;

--
-- DELETE template for table 'ineligible_product_tags_error_details'
--
DELETE FROM ineligible_product_tags_error_details WHERE 1=2;

