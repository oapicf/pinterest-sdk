--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BrandAccountProfileImage' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'brand_account_profile_image'
--
SELECT content_type, "data" FROM brand_account_profile_image WHERE 1=1;

--
-- INSERT template for table 'brand_account_profile_image'
--
INSERT INTO brand_account_profile_image (content_type, "data") VALUES (?, ?);

--
-- UPDATE template for table 'brand_account_profile_image'
--
UPDATE brand_account_profile_image SET content_type = ?, "data" = ? WHERE 1=2;

--
-- DELETE template for table 'brand_account_profile_image'
--
DELETE FROM brand_account_profile_image WHERE 1=2;

