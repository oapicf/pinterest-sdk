--
-- Pinterest REST API.
-- Prepared SQL queries for 'Account' definition.
--


--
-- SELECT template for table `Account`
--
SELECT `account_type`, `profile_image`, `website_url`, `username` FROM `Account` WHERE 1;

--
-- INSERT template for table `Account`
--
INSERT INTO `Account`(`account_type`, `profile_image`, `website_url`, `username`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `Account`
--
UPDATE `Account` SET `account_type` = ?, `profile_image` = ?, `website_url` = ?, `username` = ? WHERE 1;

--
-- DELETE template for table `Account`
--
DELETE FROM `Account` WHERE 0;

