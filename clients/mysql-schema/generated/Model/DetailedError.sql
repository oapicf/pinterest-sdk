--
-- Pinterest REST API.
-- Prepared SQL queries for 'DetailedError' definition.
--


--
-- SELECT template for table `DetailedError`
--
SELECT `code`, `message`, `details` FROM `DetailedError` WHERE 1;

--
-- INSERT template for table `DetailedError`
--
INSERT INTO `DetailedError`(`code`, `message`, `details`) VALUES (?, ?, ?);

--
-- UPDATE template for table `DetailedError`
--
UPDATE `DetailedError` SET `code` = ?, `message` = ?, `details` = ? WHERE 1;

--
-- DELETE template for table `DetailedError`
--
DELETE FROM `DetailedError` WHERE 0;

