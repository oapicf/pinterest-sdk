--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsReport' definition.
--


--
-- SELECT template for table `CatalogsReport`
--
SELECT `report_status`, `url`, `size` FROM `CatalogsReport` WHERE 1;

--
-- INSERT template for table `CatalogsReport`
--
INSERT INTO `CatalogsReport`(`report_status`, `url`, `size`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsReport`
--
UPDATE `CatalogsReport` SET `report_status` = ?, `url` = ?, `size` = ? WHERE 1;

--
-- DELETE template for table `CatalogsReport`
--
DELETE FROM `CatalogsReport` WHERE 0;

