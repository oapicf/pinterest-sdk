--
-- "Pinterest REST API"
-- Prepared SQL queries for 'UserWebsiteVerification' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'user_website_verification'
--
SELECT dns_txt_record, file_content, filename, metatag, verification_code FROM user_website_verification WHERE 1=1;

--
-- INSERT template for table 'user_website_verification'
--
INSERT INTO user_website_verification (dns_txt_record, file_content, filename, metatag, verification_code) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'user_website_verification'
--
UPDATE user_website_verification SET dns_txt_record = ?, file_content = ?, filename = ?, metatag = ?, verification_code = ? WHERE 1=2;

--
-- DELETE template for table 'user_website_verification'
--
DELETE FROM user_website_verification WHERE 1=2;

