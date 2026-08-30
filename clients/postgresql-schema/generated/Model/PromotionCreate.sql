--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PromotionCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'promotion_create'
--
SELECT discount_status, end_time, external_id, platform_type, promotion_code, promotion_custom_id, promotion_title, promotion_type, start_time, template_values FROM promotion_create WHERE 1=1;

--
-- INSERT template for table 'promotion_create'
--
INSERT INTO promotion_create (discount_status, end_time, external_id, platform_type, promotion_code, promotion_custom_id, promotion_title, promotion_type, start_time, template_values) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'promotion_create'
--
UPDATE promotion_create SET discount_status = ?, end_time = ?, external_id = ?, platform_type = ?, promotion_code = ?, promotion_custom_id = ?, promotion_title = ?, promotion_type = ?, start_time = ?, template_values = ? WHERE 1=2;

--
-- DELETE template for table 'promotion_create'
--
DELETE FROM promotion_create WHERE 1=2;

