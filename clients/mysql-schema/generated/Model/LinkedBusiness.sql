--
-- Pinterest REST API.
-- Prepared SQL queries for 'LinkedBusiness' definition.
--


--
-- SELECT template for table `LinkedBusiness`
--
SELECT `image_large_url`, `image_medium_url`, `image_small_url`, `image_xlarge_url`, `username` FROM `LinkedBusiness` WHERE 1;

--
-- INSERT template for table `LinkedBusiness`
--
INSERT INTO `LinkedBusiness`(`image_large_url`, `image_medium_url`, `image_small_url`, `image_xlarge_url`, `username`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `LinkedBusiness`
--
UPDATE `LinkedBusiness` SET `image_large_url` = ?, `image_medium_url` = ?, `image_small_url` = ?, `image_xlarge_url` = ?, `username` = ? WHERE 1;

--
-- DELETE template for table `LinkedBusiness`
--
DELETE FROM `LinkedBusiness` WHERE 0;

