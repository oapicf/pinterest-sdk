--
-- Pinterest REST API.
-- Prepared SQL queries for 'Image_Base64' definition.
--


--
-- SELECT template for table `Image_Base64`
--
SELECT `content_type`, `data` FROM `Image_Base64` WHERE 1;

--
-- INSERT template for table `Image_Base64`
--
INSERT INTO `Image_Base64`(`content_type`, `data`) VALUES (?, ?);

--
-- UPDATE template for table `Image_Base64`
--
UPDATE `Image_Base64` SET `content_type` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `Image_Base64`
--
DELETE FROM `Image_Base64` WHERE 0;

