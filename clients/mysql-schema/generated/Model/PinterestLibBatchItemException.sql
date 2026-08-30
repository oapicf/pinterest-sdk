--
-- Pinterest REST API.
-- Prepared SQL queries for 'Pinterest.Lib.BatchItemException' definition.
--


--
-- SELECT template for table `Pinterest.Lib.BatchItemException`
--
SELECT `code`, `message` FROM `Pinterest.Lib.BatchItemException` WHERE 1;

--
-- INSERT template for table `Pinterest.Lib.BatchItemException`
--
INSERT INTO `Pinterest.Lib.BatchItemException`(`code`, `message`) VALUES (?, ?);

--
-- UPDATE template for table `Pinterest.Lib.BatchItemException`
--
UPDATE `Pinterest.Lib.BatchItemException` SET `code` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `Pinterest.Lib.BatchItemException`
--
DELETE FROM `Pinterest.Lib.BatchItemException` WHERE 0;

