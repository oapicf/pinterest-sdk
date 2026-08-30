--
-- Pinterest REST API.
-- Prepared SQL queries for 'BrandAccountProfileImageUpdate' definition.
--


--
-- SELECT template for table `BrandAccountProfileImageUpdate`
--
SELECT `content_type`, `data` FROM `BrandAccountProfileImageUpdate` WHERE 1;

--
-- INSERT template for table `BrandAccountProfileImageUpdate`
--
INSERT INTO `BrandAccountProfileImageUpdate`(`content_type`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `BrandAccountProfileImageUpdate`
--
UPDATE `BrandAccountProfileImageUpdate` SET `content_type` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `BrandAccountProfileImageUpdate`
--
DELETE FROM `BrandAccountProfileImageUpdate` WHERE 0;

