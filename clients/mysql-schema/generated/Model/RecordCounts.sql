--
-- Pinterest REST API.
-- Prepared SQL queries for 'RecordCounts' definition.
--


--
-- SELECT template for table `RecordCounts`
--
SELECT `invalid`, `processed`, `valid` FROM `RecordCounts` WHERE 1;

--
-- INSERT template for table `RecordCounts`
--
INSERT INTO `RecordCounts`(`invalid`, `processed`, `valid`) VALUES (?, ?, ?);

--
-- UPDATE template for table `RecordCounts`
--
UPDATE `RecordCounts` SET `invalid` = ?, `processed` = ?, `valid` = ? WHERE 1;

--
-- DELETE template for table `RecordCounts`
--
DELETE FROM `RecordCounts` WHERE 0;

