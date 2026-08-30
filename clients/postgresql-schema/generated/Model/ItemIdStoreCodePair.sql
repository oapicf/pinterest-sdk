--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ItemIdStoreCodePair' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_id_store_code_pair'
--
SELECT item_id, store_code FROM item_id_store_code_pair WHERE 1=1;

--
-- INSERT template for table 'item_id_store_code_pair'
--
INSERT INTO item_id_store_code_pair (item_id, store_code) VALUES (?, ?);

--
-- UPDATE template for table 'item_id_store_code_pair'
--
UPDATE item_id_store_code_pair SET item_id = ?, store_code = ? WHERE 1=2;

--
-- DELETE template for table 'item_id_store_code_pair'
--
DELETE FROM item_id_store_code_pair WHERE 1=2;

