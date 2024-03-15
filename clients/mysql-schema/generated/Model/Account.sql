--
-- Pinterest REST API.
-- Prepared SQL queries for 'Account' definition.
--


--
-- SELECT template for table `Account`
--
SELECT `account_type`, `id`, `profile_image`, `website_url`, `username`, `about`, `business_name`, `board_count`, `pin_count`, `follower_count`, `following_count`, `monthly_views` FROM `Account` WHERE 1;

--
-- INSERT template for table `Account`
--
INSERT INTO `Account`(`account_type`, `id`, `profile_image`, `website_url`, `username`, `about`, `business_name`, `board_count`, `pin_count`, `follower_count`, `following_count`, `monthly_views`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Account`
--
UPDATE `Account` SET `account_type` = ?, `id` = ?, `profile_image` = ?, `website_url` = ?, `username` = ?, `about` = ?, `business_name` = ?, `board_count` = ?, `pin_count` = ?, `follower_count` = ?, `following_count` = ?, `monthly_views` = ? WHERE 1;

--
-- DELETE template for table `Account`
--
DELETE FROM `Account` WHERE 0;

