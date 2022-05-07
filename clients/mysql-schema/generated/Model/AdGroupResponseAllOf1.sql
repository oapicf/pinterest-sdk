--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupResponse_allOf_1' definition.
--


--
-- SELECT template for table `AdGroupResponse_allOf_1`
--
SELECT `campaign_id`, `billable_event`, `id`, `type`, `ad_account_id`, `created_time`, `updated_time` FROM `AdGroupResponse_allOf_1` WHERE 1;

--
-- INSERT template for table `AdGroupResponse_allOf_1`
--
INSERT INTO `AdGroupResponse_allOf_1`(`campaign_id`, `billable_event`, `id`, `type`, `ad_account_id`, `created_time`, `updated_time`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdGroupResponse_allOf_1`
--
UPDATE `AdGroupResponse_allOf_1` SET `campaign_id` = ?, `billable_event` = ?, `id` = ?, `type` = ?, `ad_account_id` = ?, `created_time` = ?, `updated_time` = ? WHERE 1;

--
-- DELETE template for table `AdGroupResponse_allOf_1`
--
DELETE FROM `AdGroupResponse_allOf_1` WHERE 0;

