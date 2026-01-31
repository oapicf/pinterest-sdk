--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroupUint32Criteria' definition.
--


--
-- SELECT template for table `CatalogsProductGroupUint32Criteria`
--
SELECT `negated`, `operator`, `value` FROM `CatalogsProductGroupUint32Criteria` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroupUint32Criteria`
--
INSERT INTO `CatalogsProductGroupUint32Criteria`(`negated`, `operator`, `value`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsProductGroupUint32Criteria`
--
UPDATE `CatalogsProductGroupUint32Criteria` SET `negated` = ?, `operator` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroupUint32Criteria`
--
DELETE FROM `CatalogsProductGroupUint32Criteria` WHERE 0;

