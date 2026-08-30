--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountAnalyticsItems' definition.
--


--
-- SELECT template for table `AdAccountAnalyticsItems`
--
SELECT `AD_ACCOUNT_ID`, `DATE` FROM `AdAccountAnalyticsItems` WHERE 1;

--
-- INSERT template for table `AdAccountAnalyticsItems`
--
INSERT INTO `AdAccountAnalyticsItems`(`AD_ACCOUNT_ID`, `DATE`) VALUES (?, ?);

--
-- UPDATE template for table `AdAccountAnalyticsItems`
--
UPDATE `AdAccountAnalyticsItems` SET `AD_ACCOUNT_ID` = ?, `DATE` = ? WHERE 1;

--
-- DELETE template for table `AdAccountAnalyticsItems`
--
DELETE FROM `AdAccountAnalyticsItems` WHERE 0;

