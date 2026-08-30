--
-- "Pinterest REST API"
-- Prepared SQL queries for 'OrderLineMutationResult' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'order_line_mutation_result'
--
SELECT errors, order_line FROM order_line_mutation_result WHERE 1=1;

--
-- INSERT template for table 'order_line_mutation_result'
--
INSERT INTO order_line_mutation_result (errors, order_line) VALUES (?, ?);

--
-- UPDATE template for table 'order_line_mutation_result'
--
UPDATE order_line_mutation_result SET errors = ?, order_line = ? WHERE 1=2;

--
-- DELETE template for table 'order_line_mutation_result'
--
DELETE FROM order_line_mutation_result WHERE 1=2;

