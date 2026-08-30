--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionEventResponse' definition.
--


--
-- SELECT template for table `ConversionEventResponse`
--
SELECT `ad_account_id`, `conversion_event`, `conversion_tag_id`, `created_time`, `reporting_conversion_event` FROM `ConversionEventResponse` WHERE 1;

--
-- INSERT template for table `ConversionEventResponse`
--
INSERT INTO `ConversionEventResponse`(`ad_account_id`, `conversion_event`, `conversion_tag_id`, `created_time`, `reporting_conversion_event`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionEventResponse`
--
UPDATE `ConversionEventResponse` SET `ad_account_id` = ?, `conversion_event` = ?, `conversion_tag_id` = ?, `created_time` = ?, `reporting_conversion_event` = ? WHERE 1;

--
-- DELETE template for table `ConversionEventResponse`
--
DELETE FROM `ConversionEventResponse` WHERE 0;

