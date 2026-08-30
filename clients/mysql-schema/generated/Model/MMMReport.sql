--
-- Pinterest REST API.
-- Prepared SQL queries for 'MMMReport' definition.
--


--
-- SELECT template for table `MMMReport`
--
SELECT `message`, `report_status`, `size`, `status`, `token`, `url` FROM `MMMReport` WHERE 1;

--
-- INSERT template for table `MMMReport`
--
INSERT INTO `MMMReport`(`message`, `report_status`, `size`, `status`, `token`, `url`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `MMMReport`
--
UPDATE `MMMReport` SET `message` = ?, `report_status` = ?, `size` = ?, `status` = ?, `token` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `MMMReport`
--
DELETE FROM `MMMReport` WHERE 0;

