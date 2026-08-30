--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdvancedAuctionItemsSubmitDeleteRecord' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'advanced_auction_items_submit_delete_record'
--
SELECT country, errors, item_id, "language", operation FROM advanced_auction_items_submit_delete_record WHERE 1=1;

--
-- INSERT template for table 'advanced_auction_items_submit_delete_record'
--
INSERT INTO advanced_auction_items_submit_delete_record (country, errors, item_id, "language", operation) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'advanced_auction_items_submit_delete_record'
--
UPDATE advanced_auction_items_submit_delete_record SET country = ?, errors = ?, item_id = ?, "language" = ?, operation = ? WHERE 1=2;

--
-- DELETE template for table 'advanced_auction_items_submit_delete_record'
--
DELETE FROM advanced_auction_items_submit_delete_record WHERE 1=2;

