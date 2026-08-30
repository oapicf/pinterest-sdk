--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdvancedAuctionOperationError' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'advanced_auction_operation_error'
--
SELECT code, message FROM advanced_auction_operation_error WHERE 1=1;

--
-- INSERT template for table 'advanced_auction_operation_error'
--
INSERT INTO advanced_auction_operation_error (code, message) VALUES (?, ?);

--
-- UPDATE template for table 'advanced_auction_operation_error'
--
UPDATE advanced_auction_operation_error SET code = ?, message = ? WHERE 1=2;

--
-- DELETE template for table 'advanced_auction_operation_error'
--
DELETE FROM advanced_auction_operation_error WHERE 1=2;

