--
-- "Pinterest REST API"
-- Prepared SQL queries for 'Promotion' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'promotion'
--
SELECT ad_account_id, discount_status, end_time, external_id, "id", platform_type, promotion_code, promotion_custom_id, promotion_title, promotion_type, start_time, status, template_values FROM promotion WHERE 1=1;

--
-- INSERT template for table 'promotion'
--
INSERT INTO promotion (ad_account_id, discount_status, end_time, external_id, "id", platform_type, promotion_code, promotion_custom_id, promotion_title, promotion_type, start_time, status, template_values) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'promotion'
--
UPDATE promotion SET ad_account_id = ?, discount_status = ?, end_time = ?, external_id = ?, "id" = ?, platform_type = ?, promotion_code = ?, promotion_custom_id = ?, promotion_title = ?, promotion_type = ?, start_time = ?, status = ?, template_values = ? WHERE 1=2;

--
-- DELETE template for table 'promotion'
--
DELETE FROM promotion WHERE 1=2;

