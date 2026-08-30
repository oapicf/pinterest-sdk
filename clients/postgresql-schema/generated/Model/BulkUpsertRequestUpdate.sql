--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BulkUpsertRequestUpdate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'bulk_upsert_request_update'
--
SELECT ad_groups, ads, campaigns, catalog_product_groups, keywords, labels, product_groups, schedules FROM bulk_upsert_request_update WHERE 1=1;

--
-- INSERT template for table 'bulk_upsert_request_update'
--
INSERT INTO bulk_upsert_request_update (ad_groups, ads, campaigns, catalog_product_groups, keywords, labels, product_groups, schedules) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'bulk_upsert_request_update'
--
UPDATE bulk_upsert_request_update SET ad_groups = ?, ads = ?, campaigns = ?, catalog_product_groups = ?, keywords = ?, labels = ?, product_groups = ?, schedules = ? WHERE 1=2;

--
-- DELETE template for table 'bulk_upsert_request_update'
--
DELETE FROM bulk_upsert_request_update WHERE 1=2;

