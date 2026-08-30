--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BrandAccountUpdate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'brand_account_update'
--
SELECT about, country, "name", profile_image, username, website FROM brand_account_update WHERE 1=1;

--
-- INSERT template for table 'brand_account_update'
--
INSERT INTO brand_account_update (about, country, "name", profile_image, username, website) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'brand_account_update'
--
UPDATE brand_account_update SET about = ?, country = ?, "name" = ?, profile_image = ?, username = ?, website = ? WHERE 1=2;

--
-- DELETE template for table 'brand_account_update'
--
DELETE FROM brand_account_update WHERE 1=2;

