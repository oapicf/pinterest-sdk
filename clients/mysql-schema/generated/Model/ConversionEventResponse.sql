--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionEventResponse' definition.
--


--
-- SELECT template for table `ConversionEventResponse`
--
SELECT `ad_account_id`, `conversion_event`, `conversion_tag_id`, `created_time` FROM `ConversionEventResponse` WHERE 1;

--
-- INSERT template for table `ConversionEventResponse`
--
INSERT INTO `ConversionEventResponse`(`ad_account_id`, `conversion_event`, `conversion_tag_id`, `created_time`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ConversionEventResponse`
--
UPDATE `ConversionEventResponse` SET `ad_account_id` = ?, `conversion_event` = ?, `conversion_tag_id` = ?, `created_time` = ? WHERE 1;

--
-- DELETE template for table `ConversionEventResponse`
--
DELETE FROM `ConversionEventResponse` WHERE 0;

