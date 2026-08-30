--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdvancedAuctionItemsGetRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'advanced_auction_items_get_request'
--
SELECT catalog_id, items FROM advanced_auction_items_get_request WHERE 1=1;

--
-- INSERT template for table 'advanced_auction_items_get_request'
--
INSERT INTO advanced_auction_items_get_request (catalog_id, items) VALUES (?, ?);

--
-- UPDATE template for table 'advanced_auction_items_get_request'
--
UPDATE advanced_auction_items_get_request SET catalog_id = ?, items = ? WHERE 1=2;

--
-- DELETE template for table 'advanced_auction_items_get_request'
--
DELETE FROM advanced_auction_items_get_request WHERE 1=2;

