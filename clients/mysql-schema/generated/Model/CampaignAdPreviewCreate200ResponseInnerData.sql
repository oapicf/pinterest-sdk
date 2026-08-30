--
-- Pinterest REST API.
-- Prepared SQL queries for 'campaign_ad_preview_create_200_response_inner_data' definition.
--


--
-- SELECT template for table `campaign_ad_preview_create_200_response_inner_data`
--
SELECT `ad_account_id`, `ad_group_id`, `client_id`, `expires_at`, `is_active`, `pin_id`, `pin_promotion_id`, `promoted_product_group_id`, `url`, `user_id`, `uuid`, `exceptions` FROM `campaign_ad_preview_create_200_response_inner_data` WHERE 1;

--
-- INSERT template for table `campaign_ad_preview_create_200_response_inner_data`
--
INSERT INTO `campaign_ad_preview_create_200_response_inner_data`(`ad_account_id`, `ad_group_id`, `client_id`, `expires_at`, `is_active`, `pin_id`, `pin_promotion_id`, `promoted_product_group_id`, `url`, `user_id`, `uuid`, `exceptions`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `campaign_ad_preview_create_200_response_inner_data`
--
UPDATE `campaign_ad_preview_create_200_response_inner_data` SET `ad_account_id` = ?, `ad_group_id` = ?, `client_id` = ?, `expires_at` = ?, `is_active` = ?, `pin_id` = ?, `pin_promotion_id` = ?, `promoted_product_group_id` = ?, `url` = ?, `user_id` = ?, `uuid` = ?, `exceptions` = ? WHERE 1;

--
-- DELETE template for table `campaign_ad_preview_create_200_response_inner_data`
--
DELETE FROM `campaign_ad_preview_create_200_response_inner_data` WHERE 0;

