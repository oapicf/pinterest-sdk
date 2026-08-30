--
-- Pinterest REST API.
-- Prepared SQL queries for 'CustomerSegment' definition.
--


--
-- SELECT template for table `CustomerSegment`
--
SELECT `ad_account_id`, `audience_ids`, `created_time`, `id`, `name`, `status`, `updated_time` FROM `CustomerSegment` WHERE 1;

--
-- INSERT template for table `CustomerSegment`
--
INSERT INTO `CustomerSegment`(`ad_account_id`, `audience_ids`, `created_time`, `id`, `name`, `status`, `updated_time`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CustomerSegment`
--
UPDATE `CustomerSegment` SET `ad_account_id` = ?, `audience_ids` = ?, `created_time` = ?, `id` = ?, `name` = ?, `status` = ?, `updated_time` = ? WHERE 1;

--
-- DELETE template for table `CustomerSegment`
--
DELETE FROM `CustomerSegment` WHERE 0;

