--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinMediaSourcePinURL' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pin_media_source_pin_url'
--
SELECT is_affiliate_link, source_type FROM pin_media_source_pin_url WHERE 1=1;

--
-- INSERT template for table 'pin_media_source_pin_url'
--
INSERT INTO pin_media_source_pin_url (is_affiliate_link, source_type) VALUES (?, ?);

--
-- UPDATE template for table 'pin_media_source_pin_url'
--
UPDATE pin_media_source_pin_url SET is_affiliate_link = ?, source_type = ? WHERE 1=2;

--
-- DELETE template for table 'pin_media_source_pin_url'
--
DELETE FROM pin_media_source_pin_url WHERE 1=2;

