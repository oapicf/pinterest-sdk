--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdvancedAuctionBidOptions' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'advanced_auction_bid_options'
--
SELECT app_type_multipliers, bid_in_micro_currency, placement_multipliers FROM advanced_auction_bid_options WHERE 1=1;

--
-- INSERT template for table 'advanced_auction_bid_options'
--
INSERT INTO advanced_auction_bid_options (app_type_multipliers, bid_in_micro_currency, placement_multipliers) VALUES (?, ?, ?);

--
-- UPDATE template for table 'advanced_auction_bid_options'
--
UPDATE advanced_auction_bid_options SET app_type_multipliers = ?, bid_in_micro_currency = ?, placement_multipliers = ? WHERE 1=2;

--
-- DELETE template for table 'advanced_auction_bid_options'
--
DELETE FROM advanced_auction_bid_options WHERE 1=2;

