--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TargetingSpecShoppingRetargeting' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'targeting_spec_shopping_retargeting'
--
SELECT exclusion_window, lookback_window, tag_types FROM targeting_spec_shopping_retargeting WHERE 1=1;

--
-- INSERT template for table 'targeting_spec_shopping_retargeting'
--
INSERT INTO targeting_spec_shopping_retargeting (exclusion_window, lookback_window, tag_types) VALUES (?, ?, ?);

--
-- UPDATE template for table 'targeting_spec_shopping_retargeting'
--
UPDATE targeting_spec_shopping_retargeting SET exclusion_window = ?, lookback_window = ?, tag_types = ? WHERE 1=2;

--
-- DELETE template for table 'targeting_spec_shopping_retargeting'
--
DELETE FROM targeting_spec_shopping_retargeting WHERE 1=2;

