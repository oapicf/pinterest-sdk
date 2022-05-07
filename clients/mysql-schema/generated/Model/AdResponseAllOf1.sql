--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdResponse_allOf_1' definition.
--


--
-- SELECT template for table `AdResponse_allOf_1`
--
SELECT `ad_account_id`, `campaign_id`, `collection_items_destination_url_template`, `created_time`, `id`, `rejected_reasons`, `rejection_labels`, `review_status`, `type`, `updated_time`, `summary_status` FROM `AdResponse_allOf_1` WHERE 1;

--
-- INSERT template for table `AdResponse_allOf_1`
--
INSERT INTO `AdResponse_allOf_1`(`ad_account_id`, `campaign_id`, `collection_items_destination_url_template`, `created_time`, `id`, `rejected_reasons`, `rejection_labels`, `review_status`, `type`, `updated_time`, `summary_status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdResponse_allOf_1`
--
UPDATE `AdResponse_allOf_1` SET `ad_account_id` = ?, `campaign_id` = ?, `collection_items_destination_url_template` = ?, `created_time` = ?, `id` = ?, `rejected_reasons` = ?, `rejection_labels` = ?, `review_status` = ?, `type` = ?, `updated_time` = ?, `summary_status` = ? WHERE 1;

--
-- DELETE template for table `AdResponse_allOf_1`
--
DELETE FROM `AdResponse_allOf_1` WHERE 0;

