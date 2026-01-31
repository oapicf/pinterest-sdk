--
-- Pinterest REST API.
-- Prepared SQL queries for 'QualityComponentDetails' definition.
--


--
-- SELECT template for table `QualityComponentDetails`
--
SELECT `coverage`, `issues`, `overlap` FROM `QualityComponentDetails` WHERE 1;

--
-- INSERT template for table `QualityComponentDetails`
--
INSERT INTO `QualityComponentDetails`(`coverage`, `issues`, `overlap`) VALUES (?, ?, ?);

--
-- UPDATE template for table `QualityComponentDetails`
--
UPDATE `QualityComponentDetails` SET `coverage` = ?, `issues` = ?, `overlap` = ? WHERE 1;

--
-- DELETE template for table `QualityComponentDetails`
--
DELETE FROM `QualityComponentDetails` WHERE 0;

