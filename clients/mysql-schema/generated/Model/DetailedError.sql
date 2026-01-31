--
-- Pinterest REST API.
-- Prepared SQL queries for 'DetailedError' definition.
--


--
-- SELECT template for table `DetailedError`
--
SELECT `code`, `details`, `message` FROM `DetailedError` WHERE 1;

--
-- INSERT template for table `DetailedError`
--
INSERT INTO `DetailedError`(`code`, `details`, `message`) VALUES (?, ?, ?);

--
-- UPDATE template for table `DetailedError`
--
UPDATE `DetailedError` SET `code` = ?, `details` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `DetailedError`
--
DELETE FROM `DetailedError` WHERE 0;

