--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignCreateResponseItem' definition.
--


--
-- SELECT template for table `CampaignCreateResponseItem`
--
SELECT `data`, `exceptions` FROM `CampaignCreateResponseItem` WHERE 1;

--
-- INSERT template for table `CampaignCreateResponseItem`
--
INSERT INTO `CampaignCreateResponseItem`(`data`, `exceptions`) VALUES (?, ?);

--
-- UPDATE template for table `CampaignCreateResponseItem`
--
UPDATE `CampaignCreateResponseItem` SET `data` = ?, `exceptions` = ? WHERE 1;

--
-- DELETE template for table `CampaignCreateResponseItem`
--
DELETE FROM `CampaignCreateResponseItem` WHERE 0;

