--
-- "Pinterest REST API"
-- Prepared SQL queries for 'OrderLineMutationError' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'order_line_mutation_error'
--
SELECT "data", error_messages FROM order_line_mutation_error WHERE 1=1;

--
-- INSERT template for table 'order_line_mutation_error'
--
INSERT INTO order_line_mutation_error ("data", error_messages) VALUES (?, ?);

--
-- UPDATE template for table 'order_line_mutation_error'
--
UPDATE order_line_mutation_error SET "data" = ?, error_messages = ? WHERE 1=2;

--
-- DELETE template for table 'order_line_mutation_error'
--
DELETE FROM order_line_mutation_error WHERE 1=2;

