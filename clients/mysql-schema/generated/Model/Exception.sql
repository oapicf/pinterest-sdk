--
-- Pinterest REST API.
-- Prepared SQL queries for 'Exception' definition.
--


--
-- SELECT template for table `Exception`
--
SELECT `code`, `message` FROM `Exception` WHERE 1;

--
-- INSERT template for table `Exception`
--
INSERT INTO `Exception`(`code`, `message`) VALUES (?, ?);

--
-- UPDATE template for table `Exception`
--
UPDATE `Exception` SET `code` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `Exception`
--
DELETE FROM `Exception` WHERE 0;

