--
-- "Pinterest REST API"
-- Prepared SQL queries for 'Pinterest.Lib.BatchItemException' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pinterest/lib/batch_item_exception'
--
SELECT code, message FROM pinterest/lib/batch_item_exception WHERE 1=1;

--
-- INSERT template for table 'pinterest/lib/batch_item_exception'
--
INSERT INTO pinterest/lib/batch_item_exception (code, message) VALUES (?, ?);

--
-- UPDATE template for table 'pinterest/lib/batch_item_exception'
--
UPDATE pinterest/lib/batch_item_exception SET code = ?, message = ? WHERE 1=2;

--
-- DELETE template for table 'pinterest/lib/batch_item_exception'
--
DELETE FROM pinterest/lib/batch_item_exception WHERE 1=2;

