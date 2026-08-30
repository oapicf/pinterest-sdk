--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CustomerSegmentUpdateRequestUpdateWithRequiredBody' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'customer_segment_update_request_update_with_required_body'
--
SELECT audience_ids, "id", operation_type FROM customer_segment_update_request_update_with_required_body WHERE 1=1;

--
-- INSERT template for table 'customer_segment_update_request_update_with_required_body'
--
INSERT INTO customer_segment_update_request_update_with_required_body (audience_ids, "id", operation_type) VALUES (?, ?, ?);

--
-- UPDATE template for table 'customer_segment_update_request_update_with_required_body'
--
UPDATE customer_segment_update_request_update_with_required_body SET audience_ids = ?, "id" = ?, operation_type = ? WHERE 1=2;

--
-- DELETE template for table 'customer_segment_update_request_update_with_required_body'
--
DELETE FROM customer_segment_update_request_update_with_required_body WHERE 1=2;

