--
-- Pinterest REST API.
-- Prepared SQL queries for 'brand_accounts_create_request' definition.
--


--
-- SELECT template for table `brand_accounts_create_request`
--
SELECT `name`, `username`, `country`, `about`, `website`, `profile_image` FROM `brand_accounts_create_request` WHERE 1;

--
-- INSERT template for table `brand_accounts_create_request`
--
INSERT INTO `brand_accounts_create_request`(`name`, `username`, `country`, `about`, `website`, `profile_image`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `brand_accounts_create_request`
--
UPDATE `brand_accounts_create_request` SET `name` = ?, `username` = ?, `country` = ?, `about` = ?, `website` = ?, `profile_image` = ? WHERE 1;

--
-- DELETE template for table `brand_accounts_create_request`
--
DELETE FROM `brand_accounts_create_request` WHERE 0;

