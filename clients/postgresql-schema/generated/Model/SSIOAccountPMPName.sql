--
-- "Pinterest REST API"
-- Prepared SQL queries for 'SSIOAccountPMPName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ssio_account_pmp_name'
--
SELECT "id", "name" FROM ssio_account_pmp_name WHERE 1=1;

--
-- INSERT template for table 'ssio_account_pmp_name'
--
INSERT INTO ssio_account_pmp_name ("id", "name") VALUES (?, ?);

--
-- UPDATE template for table 'ssio_account_pmp_name'
--
UPDATE ssio_account_pmp_name SET "id" = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'ssio_account_pmp_name'
--
DELETE FROM ssio_account_pmp_name WHERE 1=2;

