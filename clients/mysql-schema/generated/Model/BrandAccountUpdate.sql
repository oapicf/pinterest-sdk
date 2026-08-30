--
-- Pinterest REST API.
-- Prepared SQL queries for 'BrandAccountUpdate' definition.
--


--
-- SELECT template for table `BrandAccountUpdate`
--
SELECT `about`, `country`, `name`, `profile_image`, `username`, `website` FROM `BrandAccountUpdate` WHERE 1;

--
-- INSERT template for table `BrandAccountUpdate`
--
INSERT INTO `BrandAccountUpdate`(`about`, `country`, `name`, `profile_image`, `username`, `website`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BrandAccountUpdate`
--
UPDATE `BrandAccountUpdate` SET `about` = ?, `country` = ?, `name` = ?, `profile_image` = ?, `username` = ?, `website` = ? WHERE 1;

--
-- DELETE template for table `BrandAccountUpdate`
--
DELETE FROM `BrandAccountUpdate` WHERE 0;

