--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionProductReport' definition.
--


--
-- SELECT template for table `ConversionProductReport`
--
SELECT `message`, `report_status`, `size`, `token`, `url` FROM `ConversionProductReport` WHERE 1;

--
-- INSERT template for table `ConversionProductReport`
--
INSERT INTO `ConversionProductReport`(`message`, `report_status`, `size`, `token`, `url`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionProductReport`
--
UPDATE `ConversionProductReport` SET `message` = ?, `report_status` = ?, `size` = ?, `token` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `ConversionProductReport`
--
DELETE FROM `ConversionProductReport` WHERE 0;

