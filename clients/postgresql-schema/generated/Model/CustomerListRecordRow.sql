--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CustomerListRecordRow' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'customer_list_record_row'
--
SELECT email, external_id, hashed_phone_number, hashed_pinner_id, ip_address, liveramp_envelope, maid, user_agent FROM customer_list_record_row WHERE 1=1;

--
-- INSERT template for table 'customer_list_record_row'
--
INSERT INTO customer_list_record_row (email, external_id, hashed_phone_number, hashed_pinner_id, ip_address, liveramp_envelope, maid, user_agent) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'customer_list_record_row'
--
UPDATE customer_list_record_row SET email = ?, external_id = ?, hashed_phone_number = ?, hashed_pinner_id = ?, ip_address = ?, liveramp_envelope = ?, maid = ?, user_agent = ? WHERE 1=2;

--
-- DELETE template for table 'customer_list_record_row'
--
DELETE FROM customer_list_record_row WHERE 1=2;

