--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignBatchItem' definition.
--


--
-- SELECT template for table `CampaignBatchItem`
--
SELECT `data`, `exceptions` FROM `CampaignBatchItem` WHERE 1;

--
-- INSERT template for table `CampaignBatchItem`
--
INSERT INTO `CampaignBatchItem`(`data`, `exceptions`) VALUES (?, ?);

--
-- UPDATE template for table `CampaignBatchItem`
--
UPDATE `CampaignBatchItem` SET `data` = ?, `exceptions` = ? WHERE 1;

--
-- DELETE template for table `CampaignBatchItem`
--
DELETE FROM `CampaignBatchItem` WHERE 0;

