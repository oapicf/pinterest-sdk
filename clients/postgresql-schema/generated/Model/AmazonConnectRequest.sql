--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AmazonConnectRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'amazon_connect_request'
--
SELECT amazon_storefront_id, amazon_storefront_name, amazon_storefront_url, amazon_user_id, is_amazon_account_linked, one_time_passcode, pinterest_user_id FROM amazon_connect_request WHERE 1=1;

--
-- INSERT template for table 'amazon_connect_request'
--
INSERT INTO amazon_connect_request (amazon_storefront_id, amazon_storefront_name, amazon_storefront_url, amazon_user_id, is_amazon_account_linked, one_time_passcode, pinterest_user_id) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'amazon_connect_request'
--
UPDATE amazon_connect_request SET amazon_storefront_id = ?, amazon_storefront_name = ?, amazon_storefront_url = ?, amazon_user_id = ?, is_amazon_account_linked = ?, one_time_passcode = ?, pinterest_user_id = ? WHERE 1=2;

--
-- DELETE template for table 'amazon_connect_request'
--
DELETE FROM amazon_connect_request WHERE 1=2;

