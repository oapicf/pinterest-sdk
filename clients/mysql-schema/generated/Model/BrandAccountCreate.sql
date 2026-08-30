--
-- Pinterest REST API.
-- Prepared SQL queries for 'BrandAccountCreate' definition.
--


--
-- SELECT template for table `BrandAccountCreate`
--
SELECT `about`, `country`, `name`, `profile_image`, `username`, `website` FROM `BrandAccountCreate` WHERE 1;

--
-- INSERT template for table `BrandAccountCreate`
--
INSERT INTO `BrandAccountCreate`(`about`, `country`, `name`, `profile_image`, `username`, `website`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BrandAccountCreate`
--
UPDATE `BrandAccountCreate` SET `about` = ?, `country` = ?, `name` = ?, `profile_image` = ?, `username` = ?, `website` = ? WHERE 1;

--
-- DELETE template for table `BrandAccountCreate`
--
DELETE FROM `BrandAccountCreate` WHERE 0;

