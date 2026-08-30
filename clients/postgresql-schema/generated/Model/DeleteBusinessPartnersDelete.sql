--
-- "Pinterest REST API"
-- Prepared SQL queries for 'DeleteBusinessPartnersDelete' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'delete_business_partners_delete'
--
SELECT partner_ids, partner_type FROM delete_business_partners_delete WHERE 1=1;

--
-- INSERT template for table 'delete_business_partners_delete'
--
INSERT INTO delete_business_partners_delete (partner_ids, partner_type) VALUES (?, ?);

--
-- UPDATE template for table 'delete_business_partners_delete'
--
UPDATE delete_business_partners_delete SET partner_ids = ?, partner_type = ? WHERE 1=2;

--
-- DELETE template for table 'delete_business_partners_delete'
--
DELETE FROM delete_business_partners_delete WHERE 1=2;

