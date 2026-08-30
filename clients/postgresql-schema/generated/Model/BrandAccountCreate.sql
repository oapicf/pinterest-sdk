--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BrandAccountCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'brand_account_create'
--
SELECT about, country, "name", profile_image, username, website FROM brand_account_create WHERE 1=1;

--
-- INSERT template for table 'brand_account_create'
--
INSERT INTO brand_account_create (about, country, "name", profile_image, username, website) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'brand_account_create'
--
UPDATE brand_account_create SET about = ?, country = ?, "name" = ?, profile_image = ?, username = ?, website = ? WHERE 1=2;

--
-- DELETE template for table 'brand_account_create'
--
DELETE FROM brand_account_create WHERE 1=2;

