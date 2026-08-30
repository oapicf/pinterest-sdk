--
-- "Pinterest REST API"
-- Prepared SQL queries for 'SSIOAccountAddress' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ssio_account_address'
--
SELECT address_id, display, order_legal_entity, purpose FROM ssio_account_address WHERE 1=1;

--
-- INSERT template for table 'ssio_account_address'
--
INSERT INTO ssio_account_address (address_id, display, order_legal_entity, purpose) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'ssio_account_address'
--
UPDATE ssio_account_address SET address_id = ?, display = ?, order_legal_entity = ?, purpose = ? WHERE 1=2;

--
-- DELETE template for table 'ssio_account_address'
--
DELETE FROM ssio_account_address WHERE 1=2;

