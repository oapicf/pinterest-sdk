--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdvancedAuctionItemsSubmitUpsertRecord' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'advanced_auction_items_submit_upsert_record'
--
SELECT bid_options, country, errors, item_id, "language", operation, update_mask FROM advanced_auction_items_submit_upsert_record WHERE 1=1;

--
-- INSERT template for table 'advanced_auction_items_submit_upsert_record'
--
INSERT INTO advanced_auction_items_submit_upsert_record (bid_options, country, errors, item_id, "language", operation, update_mask) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'advanced_auction_items_submit_upsert_record'
--
UPDATE advanced_auction_items_submit_upsert_record SET bid_options = ?, country = ?, errors = ?, item_id = ?, "language" = ?, operation = ?, update_mask = ? WHERE 1=2;

--
-- DELETE template for table 'advanced_auction_items_submit_upsert_record'
--
DELETE FROM advanced_auction_items_submit_upsert_record WHERE 1=2;

