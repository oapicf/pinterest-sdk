--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ssio_insertion_orders_status_get_by_ad_account_200_response' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ssio_insertion_orders_status_get_by_ad_account_200_response'
--
SELECT bookmark, items FROM ssio_insertion_orders_status_get_by_ad_account_200_response WHERE 1=1;

--
-- INSERT template for table 'ssio_insertion_orders_status_get_by_ad_account_200_response'
--
INSERT INTO ssio_insertion_orders_status_get_by_ad_account_200_response (bookmark, items) VALUES (?, ?);

--
-- UPDATE template for table 'ssio_insertion_orders_status_get_by_ad_account_200_response'
--
UPDATE ssio_insertion_orders_status_get_by_ad_account_200_response SET bookmark = ?, items = ? WHERE 1=2;

--
-- DELETE template for table 'ssio_insertion_orders_status_get_by_ad_account_200_response'
--
DELETE FROM ssio_insertion_orders_status_get_by_ad_account_200_response WHERE 1=2;

