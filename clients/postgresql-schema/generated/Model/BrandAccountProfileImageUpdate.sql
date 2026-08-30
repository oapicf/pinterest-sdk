--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BrandAccountProfileImageUpdate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'brand_account_profile_image_update'
--
SELECT content_type, "data" FROM brand_account_profile_image_update WHERE 1=1;

--
-- INSERT template for table 'brand_account_profile_image_update'
--
INSERT INTO brand_account_profile_image_update (content_type, "data") VALUES (?, ?);

--
-- UPDATE template for table 'brand_account_profile_image_update'
--
UPDATE brand_account_profile_image_update SET content_type = ?, "data" = ? WHERE 1=2;

--
-- DELETE template for table 'brand_account_profile_image_update'
--
DELETE FROM brand_account_profile_image_update WHERE 1=2;

