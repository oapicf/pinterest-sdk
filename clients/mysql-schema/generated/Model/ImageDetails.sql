--
-- Pinterest REST API.
-- Prepared SQL queries for 'ImageDetails' definition.
--


--
-- SELECT template for table `ImageDetails`
--
SELECT `width`, `height`, `url` FROM `ImageDetails` WHERE 1;

--
-- INSERT template for table `ImageDetails`
--
INSERT INTO `ImageDetails`(`width`, `height`, `url`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ImageDetails`
--
UPDATE `ImageDetails` SET `width` = ?, `height` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `ImageDetails`
--
DELETE FROM `ImageDetails` WHERE 0;

