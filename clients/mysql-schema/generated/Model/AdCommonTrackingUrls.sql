--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdCommon_tracking_urls' definition.
--


--
-- SELECT template for table `AdCommon_tracking_urls`
--
SELECT `impression`, `click`, `engagement`, `buyable_button`, `audience_verification` FROM `AdCommon_tracking_urls` WHERE 1;

--
-- INSERT template for table `AdCommon_tracking_urls`
--
INSERT INTO `AdCommon_tracking_urls`(`impression`, `click`, `engagement`, `buyable_button`, `audience_verification`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdCommon_tracking_urls`
--
UPDATE `AdCommon_tracking_urls` SET `impression` = ?, `click` = ?, `engagement` = ?, `buyable_button` = ?, `audience_verification` = ? WHERE 1;

--
-- DELETE template for table `AdCommon_tracking_urls`
--
DELETE FROM `AdCommon_tracking_urls` WHERE 0;

