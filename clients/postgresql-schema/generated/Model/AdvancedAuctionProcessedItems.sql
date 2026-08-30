--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdvancedAuctionProcessedItems' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'advanced_auction_processed_items'
--
SELECT catalog_id, items FROM advanced_auction_processed_items WHERE 1=1;

--
-- INSERT template for table 'advanced_auction_processed_items'
--
INSERT INTO advanced_auction_processed_items (catalog_id, items) VALUES (?, ?);

--
-- UPDATE template for table 'advanced_auction_processed_items'
--
UPDATE advanced_auction_processed_items SET catalog_id = ?, items = ? WHERE 1=2;

--
-- DELETE template for table 'advanced_auction_processed_items'
--
DELETE FROM advanced_auction_processed_items WHERE 1=2;

