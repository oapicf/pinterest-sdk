--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdBatchItem' definition.
--


--
-- SELECT template for table `AdBatchItem`
--
SELECT `data`, `exceptions` FROM `AdBatchItem` WHERE 1;

--
-- INSERT template for table `AdBatchItem`
--
INSERT INTO `AdBatchItem`(`data`, `exceptions`) VALUES (?, ?);

--
-- UPDATE template for table `AdBatchItem`
--
UPDATE `AdBatchItem` SET `data` = ?, `exceptions` = ? WHERE 1;

--
-- DELETE template for table `AdBatchItem`
--
DELETE FROM `AdBatchItem` WHERE 0;

