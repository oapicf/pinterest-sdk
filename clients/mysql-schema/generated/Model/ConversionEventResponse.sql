--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionEventResponse' definition.
--


--
-- SELECT template for table `ConversionEventResponse`
--
SELECT `conversion_event`, `conversion_tag_id`, `ad_account_id`, `created_time` FROM `ConversionEventResponse` WHERE 1;

--
-- INSERT template for table `ConversionEventResponse`
--
INSERT INTO `ConversionEventResponse`(`conversion_event`, `conversion_tag_id`, `ad_account_id`, `created_time`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ConversionEventResponse`
--
UPDATE `ConversionEventResponse` SET `conversion_event` = ?, `conversion_tag_id` = ?, `ad_account_id` = ?, `created_time` = ? WHERE 1;

--
-- DELETE template for table `ConversionEventResponse`
--
DELETE FROM `ConversionEventResponse` WHERE 0;

