--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PartnerMetadata' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'partner_metadata'
--
SELECT subscriber_key FROM partner_metadata WHERE 1=1;

--
-- INSERT template for table 'partner_metadata'
--
INSERT INTO partner_metadata (subscriber_key) VALUES (?);

--
-- UPDATE template for table 'partner_metadata'
--
UPDATE partner_metadata SET subscriber_key = ? WHERE 1=2;

--
-- DELETE template for table 'partner_metadata'
--
DELETE FROM partner_metadata WHERE 1=2;

