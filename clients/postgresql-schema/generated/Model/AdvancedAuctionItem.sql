--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdvancedAuctionItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'advanced_auction_item'
--
SELECT bid_options, country, item_id, "language" FROM advanced_auction_item WHERE 1=1;

--
-- INSERT template for table 'advanced_auction_item'
--
INSERT INTO advanced_auction_item (bid_options, country, item_id, "language") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'advanced_auction_item'
--
UPDATE advanced_auction_item SET bid_options = ?, country = ?, item_id = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'advanced_auction_item'
--
DELETE FROM advanced_auction_item WHERE 1=2;

