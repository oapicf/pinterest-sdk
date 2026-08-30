--
-- "Pinterest REST API"
-- Prepared SQL queries for 'Audience' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'audience'
--
SELECT ad_account_id, audience_type, created_by_company_name, created_timestamp, description, "id", is_nca, "name", "rule", "size", status, "type", updated_timestamp FROM audience WHERE 1=1;

--
-- INSERT template for table 'audience'
--
INSERT INTO audience (ad_account_id, audience_type, created_by_company_name, created_timestamp, description, "id", is_nca, "name", "rule", "size", status, "type", updated_timestamp) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'audience'
--
UPDATE audience SET ad_account_id = ?, audience_type = ?, created_by_company_name = ?, created_timestamp = ?, description = ?, "id" = ?, is_nca = ?, "name" = ?, "rule" = ?, "size" = ?, status = ?, "type" = ?, updated_timestamp = ? WHERE 1=2;

--
-- DELETE template for table 'audience'
--
DELETE FROM audience WHERE 1=2;

