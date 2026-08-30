--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PromotionsResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'promotions_response'
--
SELECT promotions FROM promotions_response WHERE 1=1;

--
-- INSERT template for table 'promotions_response'
--
INSERT INTO promotions_response (promotions) VALUES (?);

--
-- UPDATE template for table 'promotions_response'
--
UPDATE promotions_response SET promotions = ? WHERE 1=2;

--
-- DELETE template for table 'promotions_response'
--
DELETE FROM promotions_response WHERE 1=2;

