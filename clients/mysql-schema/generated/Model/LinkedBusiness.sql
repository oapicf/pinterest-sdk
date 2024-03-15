--
-- Pinterest REST API.
-- Prepared SQL queries for 'LinkedBusiness' definition.
--


--
-- SELECT template for table `LinkedBusiness`
--
SELECT `username`, `image_small_url`, `image_medium_url`, `image_large_url`, `image_xlarge_url` FROM `LinkedBusiness` WHERE 1;

--
-- INSERT template for table `LinkedBusiness`
--
INSERT INTO `LinkedBusiness`(`username`, `image_small_url`, `image_medium_url`, `image_large_url`, `image_xlarge_url`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `LinkedBusiness`
--
UPDATE `LinkedBusiness` SET `username` = ?, `image_small_url` = ?, `image_medium_url` = ?, `image_large_url` = ?, `image_xlarge_url` = ? WHERE 1;

--
-- DELETE template for table `LinkedBusiness`
--
DELETE FROM `LinkedBusiness` WHERE 0;

