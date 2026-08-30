--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdvancedAuctionItemsSubmitRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'advanced_auction_items_submit_request'
--
SELECT catalog_id, items FROM advanced_auction_items_submit_request WHERE 1=1;

--
-- INSERT template for table 'advanced_auction_items_submit_request'
--
INSERT INTO advanced_auction_items_submit_request (catalog_id, items) VALUES (?, ?);

--
-- UPDATE template for table 'advanced_auction_items_submit_request'
--
UPDATE advanced_auction_items_submit_request SET catalog_id = ?, items = ? WHERE 1=2;

--
-- DELETE template for table 'advanced_auction_items_submit_request'
--
DELETE FROM advanced_auction_items_submit_request WHERE 1=2;

