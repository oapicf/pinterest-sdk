--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PromotionArrayElement' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'promotion_array_element'
--
SELECT "data", "exception" FROM promotion_array_element WHERE 1=1;

--
-- INSERT template for table 'promotion_array_element'
--
INSERT INTO promotion_array_element ("data", "exception") VALUES (?, ?);

--
-- UPDATE template for table 'promotion_array_element'
--
UPDATE promotion_array_element SET "data" = ?, "exception" = ? WHERE 1=2;

--
-- DELETE template for table 'promotion_array_element'
--
DELETE FROM promotion_array_element WHERE 1=2;

