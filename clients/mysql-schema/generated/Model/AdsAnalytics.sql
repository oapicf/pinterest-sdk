--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdsAnalytics' definition.
--


--
-- SELECT template for table `AdsAnalytics`
--
SELECT `AD_ID`, `DATE` FROM `AdsAnalytics` WHERE 1;

--
-- INSERT template for table `AdsAnalytics`
--
INSERT INTO `AdsAnalytics`(`AD_ID`, `DATE`) VALUES (?, ?);

--
-- UPDATE template for table `AdsAnalytics`
--
UPDATE `AdsAnalytics` SET `AD_ID` = ?, `DATE` = ? WHERE 1;

--
-- DELETE template for table `AdsAnalytics`
--
DELETE FROM `AdsAnalytics` WHERE 0;

