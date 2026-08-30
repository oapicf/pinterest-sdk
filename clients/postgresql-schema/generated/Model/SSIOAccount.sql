--
-- "Pinterest REST API"
-- Prepared SQL queries for 'SSIOAccount' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ssio_account'
--
SELECT billto_infos, can_edit, currency, eligible, "error", pmp_names FROM ssio_account WHERE 1=1;

--
-- INSERT template for table 'ssio_account'
--
INSERT INTO ssio_account (billto_infos, can_edit, currency, eligible, "error", pmp_names) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ssio_account'
--
UPDATE ssio_account SET billto_infos = ?, can_edit = ?, currency = ?, eligible = ?, "error" = ?, pmp_names = ? WHERE 1=2;

--
-- DELETE template for table 'ssio_account'
--
DELETE FROM ssio_account WHERE 1=2;

