--
-- Pinterest REST API.
-- Prepared SQL queries for 'ImageSize' definition.
--


--
-- SELECT template for table `ImageSize`
--
SELECT `1200x`, `150x150`, `400x300`, `600x` FROM `ImageSize` WHERE 1;

--
-- INSERT template for table `ImageSize`
--
INSERT INTO `ImageSize`(`1200x`, `150x150`, `400x300`, `600x`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ImageSize`
--
UPDATE `ImageSize` SET `1200x` = ?, `150x150` = ?, `400x300` = ?, `600x` = ? WHERE 1;

--
-- DELETE template for table `ImageSize`
--
DELETE FROM `ImageSize` WHERE 0;

