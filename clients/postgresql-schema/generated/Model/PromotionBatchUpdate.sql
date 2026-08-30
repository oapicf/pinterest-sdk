--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PromotionBatchUpdate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'promotion_batch_update'
--
SELECT discount_status, end_time, external_id, "id", platform_type, promotion_code, promotion_custom_id, promotion_title, promotion_type, start_time, template_values FROM promotion_batch_update WHERE 1=1;

--
-- INSERT template for table 'promotion_batch_update'
--
INSERT INTO promotion_batch_update (discount_status, end_time, external_id, "id", platform_type, promotion_code, promotion_custom_id, promotion_title, promotion_type, start_time, template_values) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'promotion_batch_update'
--
UPDATE promotion_batch_update SET discount_status = ?, end_time = ?, external_id = ?, "id" = ?, platform_type = ?, promotion_code = ?, promotion_custom_id = ?, promotion_title = ?, promotion_type = ?, start_time = ?, template_values = ? WHERE 1=2;

--
-- DELETE template for table 'promotion_batch_update'
--
DELETE FROM promotion_batch_update WHERE 1=2;

