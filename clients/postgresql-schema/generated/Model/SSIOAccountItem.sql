--
-- "Pinterest REST API"
-- Prepared SQL queries for 'SSIOAccountItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ssio_account_item'
--
SELECT addresses, "id", io_terms, io_terms_id, io_type, row_terms, row_terms_id, us_terms, us_terms_id FROM ssio_account_item WHERE 1=1;

--
-- INSERT template for table 'ssio_account_item'
--
INSERT INTO ssio_account_item (addresses, "id", io_terms, io_terms_id, io_type, row_terms, row_terms_id, us_terms, us_terms_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ssio_account_item'
--
UPDATE ssio_account_item SET addresses = ?, "id" = ?, io_terms = ?, io_terms_id = ?, io_type = ?, row_terms = ?, row_terms_id = ?, us_terms = ?, us_terms_id = ? WHERE 1=2;

--
-- DELETE template for table 'ssio_account_item'
--
DELETE FROM ssio_account_item WHERE 1=2;

