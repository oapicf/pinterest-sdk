--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionOperationError' definition.
--


--
-- SELECT template for table `AdvancedAuctionOperationError`
--
SELECT `code`, `message` FROM `AdvancedAuctionOperationError` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionOperationError`
--
INSERT INTO `AdvancedAuctionOperationError`(`code`, `message`) VALUES (?, ?);

--
-- UPDATE template for table `AdvancedAuctionOperationError`
--
UPDATE `AdvancedAuctionOperationError` SET `code` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionOperationError`
--
DELETE FROM `AdvancedAuctionOperationError` WHERE 0;

