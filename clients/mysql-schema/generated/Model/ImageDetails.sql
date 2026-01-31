--
-- Pinterest REST API.
-- Prepared SQL queries for 'ImageDetails' definition.
--


--
-- SELECT template for table `ImageDetails`
--
SELECT `height`, `url`, `width` FROM `ImageDetails` WHERE 1;

--
-- INSERT template for table `ImageDetails`
--
INSERT INTO `ImageDetails`(`height`, `url`, `width`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ImageDetails`
--
UPDATE `ImageDetails` SET `height` = ?, `url` = ?, `width` = ? WHERE 1;

--
-- DELETE template for table `ImageDetails`
--
DELETE FROM `ImageDetails` WHERE 0;

