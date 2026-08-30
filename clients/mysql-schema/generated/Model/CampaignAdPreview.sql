--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignAdPreview' definition.
--


--
-- SELECT template for table `CampaignAdPreview`
--
SELECT `ad_account_id`, `ad_group_id`, `client_id`, `expires_at`, `is_active`, `pin_id`, `pin_promotion_id`, `promoted_product_group_id`, `url`, `user_id`, `uuid` FROM `CampaignAdPreview` WHERE 1;

--
-- INSERT template for table `CampaignAdPreview`
--
INSERT INTO `CampaignAdPreview`(`ad_account_id`, `ad_group_id`, `client_id`, `expires_at`, `is_active`, `pin_id`, `pin_promotion_id`, `promoted_product_group_id`, `url`, `user_id`, `uuid`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignAdPreview`
--
UPDATE `CampaignAdPreview` SET `ad_account_id` = ?, `ad_group_id` = ?, `client_id` = ?, `expires_at` = ?, `is_active` = ?, `pin_id` = ?, `pin_promotion_id` = ?, `promoted_product_group_id` = ?, `url` = ?, `user_id` = ?, `uuid` = ? WHERE 1;

--
-- DELETE template for table `CampaignAdPreview`
--
DELETE FROM `CampaignAdPreview` WHERE 0;

