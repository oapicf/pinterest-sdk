--
-- "Pinterest REST API"
-- Prepared SQL queries for 'QualityComponents' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'quality_components'
--
SELECT advertiser_external_id, click_id_epik, external_event_id, hashed_email, hashed_maid, ip_address, order_id, order_value, product_id, source_url, user_agent FROM quality_components WHERE 1=1;

--
-- INSERT template for table 'quality_components'
--
INSERT INTO quality_components (advertiser_external_id, click_id_epik, external_event_id, hashed_email, hashed_maid, ip_address, order_id, order_value, product_id, source_url, user_agent) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'quality_components'
--
UPDATE quality_components SET advertiser_external_id = ?, click_id_epik = ?, external_event_id = ?, hashed_email = ?, hashed_maid = ?, ip_address = ?, order_id = ?, order_value = ?, product_id = ?, source_url = ?, user_agent = ? WHERE 1=2;

--
-- DELETE template for table 'quality_components'
--
DELETE FROM quality_components WHERE 1=2;

