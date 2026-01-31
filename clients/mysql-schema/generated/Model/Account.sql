--
-- Pinterest REST API.
-- Prepared SQL queries for 'Account' definition.
--


--
-- SELECT template for table `Account`
--
SELECT `about`, `account_type`, `board_count`, `business_name`, `follower_count`, `following_count`, `id`, `monthly_views`, `pin_count`, `profile_image`, `username`, `website_url` FROM `Account` WHERE 1;

--
-- INSERT template for table `Account`
--
INSERT INTO `Account`(`about`, `account_type`, `board_count`, `business_name`, `follower_count`, `following_count`, `id`, `monthly_views`, `pin_count`, `profile_image`, `username`, `website_url`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Account`
--
UPDATE `Account` SET `about` = ?, `account_type` = ?, `board_count` = ?, `business_name` = ?, `follower_count` = ?, `following_count` = ?, `id` = ?, `monthly_views` = ?, `pin_count` = ?, `profile_image` = ?, `username` = ?, `website_url` = ? WHERE 1;

--
-- DELETE template for table `Account`
--
DELETE FROM `Account` WHERE 0;

