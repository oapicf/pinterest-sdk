--
-- Pinterest REST API.
-- Prepared SQL queries for 'BrandAccountProfileImage' definition.
--


--
-- SELECT template for table `BrandAccountProfileImage`
--
SELECT `content_type`, `data` FROM `BrandAccountProfileImage` WHERE 1;

--
-- INSERT template for table `BrandAccountProfileImage`
--
INSERT INTO `BrandAccountProfileImage`(`content_type`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `BrandAccountProfileImage`
--
UPDATE `BrandAccountProfileImage` SET `content_type` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `BrandAccountProfileImage`
--
DELETE FROM `BrandAccountProfileImage` WHERE 0;

