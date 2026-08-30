--
-- "Pinterest REST API"
-- Prepared SQL queries for 'DeleteBusinessPartners' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'delete_business_partners'
--
SELECT deleted_partners FROM delete_business_partners WHERE 1=1;

--
-- INSERT template for table 'delete_business_partners'
--
INSERT INTO delete_business_partners (deleted_partners) VALUES (?);

--
-- UPDATE template for table 'delete_business_partners'
--
UPDATE delete_business_partners SET deleted_partners = ? WHERE 1=2;

--
-- DELETE template for table 'delete_business_partners'
--
DELETE FROM delete_business_partners WHERE 1=2;

