--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdPinAnalytics' definition.
--


--
-- SELECT template for table `AdPinAnalytics`
--
SELECT `DATE`, `PIN_ID` FROM `AdPinAnalytics` WHERE 1;

--
-- INSERT template for table `AdPinAnalytics`
--
INSERT INTO `AdPinAnalytics`(`DATE`, `PIN_ID`) VALUES (?, ?);

--
-- UPDATE template for table `AdPinAnalytics`
--
UPDATE `AdPinAnalytics` SET `DATE` = ?, `PIN_ID` = ? WHERE 1;

--
-- DELETE template for table `AdPinAnalytics`
--
DELETE FROM `AdPinAnalytics` WHERE 0;

