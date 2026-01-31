--
-- Pinterest REST API.
-- Prepared SQL queries for 'ProductCategoriesDemographic' definition.
--


--
-- SELECT template for table `ProductCategoriesDemographic`
--
SELECT `age`, `gender` FROM `ProductCategoriesDemographic` WHERE 1;

--
-- INSERT template for table `ProductCategoriesDemographic`
--
INSERT INTO `ProductCategoriesDemographic`(`age`, `gender`) VALUES (?, ?);

--
-- UPDATE template for table `ProductCategoriesDemographic`
--
UPDATE `ProductCategoriesDemographic` SET `age` = ?, `gender` = ? WHERE 1;

--
-- DELETE template for table `ProductCategoriesDemographic`
--
DELETE FROM `ProductCategoriesDemographic` WHERE 0;

