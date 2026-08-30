--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdvancedAuctionKey' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'advanced_auction_key'
--
SELECT country, item_id, "language" FROM advanced_auction_key WHERE 1=1;

--
-- INSERT template for table 'advanced_auction_key'
--
INSERT INTO advanced_auction_key (country, item_id, "language") VALUES (?, ?, ?);

--
-- UPDATE template for table 'advanced_auction_key'
--
UPDATE advanced_auction_key SET country = ?, item_id = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'advanced_auction_key'
--
DELETE FROM advanced_auction_key WHERE 1=2;

