--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdBatchItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_batch_item'
--
SELECT "data", exceptions FROM ad_batch_item WHERE 1=1;

--
-- INSERT template for table 'ad_batch_item'
--
INSERT INTO ad_batch_item ("data", exceptions) VALUES (?, ?);

--
-- UPDATE template for table 'ad_batch_item'
--
UPDATE ad_batch_item SET "data" = ?, exceptions = ? WHERE 1=2;

--
-- DELETE template for table 'ad_batch_item'
--
DELETE FROM ad_batch_item WHERE 1=2;

