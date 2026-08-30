--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BulkUpsertRequestCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'bulk_upsert_request_create'
--
SELECT ad_groups, ads, campaigns, catalog_product_groups, keywords, labels, product_groups, schedules FROM bulk_upsert_request_create WHERE 1=1;

--
-- INSERT template for table 'bulk_upsert_request_create'
--
INSERT INTO bulk_upsert_request_create (ad_groups, ads, campaigns, catalog_product_groups, keywords, labels, product_groups, schedules) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'bulk_upsert_request_create'
--
UPDATE bulk_upsert_request_create SET ad_groups = ?, ads = ?, campaigns = ?, catalog_product_groups = ?, keywords = ?, labels = ?, product_groups = ?, schedules = ? WHERE 1=2;

--
-- DELETE template for table 'bulk_upsert_request_create'
--
DELETE FROM bulk_upsert_request_create WHERE 1=2;

