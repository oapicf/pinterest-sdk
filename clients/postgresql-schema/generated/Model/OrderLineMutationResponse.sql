--
-- "Pinterest REST API"
-- Prepared SQL queries for 'OrderLineMutationResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'order_line_mutation_response'
--
SELECT "data" FROM order_line_mutation_response WHERE 1=1;

--
-- INSERT template for table 'order_line_mutation_response'
--
INSERT INTO order_line_mutation_response ("data") VALUES (?);

--
-- UPDATE template for table 'order_line_mutation_response'
--
UPDATE order_line_mutation_response SET "data" = ? WHERE 1=2;

--
-- DELETE template for table 'order_line_mutation_response'
--
DELETE FROM order_line_mutation_response WHERE 1=2;

