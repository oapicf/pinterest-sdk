--
-- Pinterest REST API.
-- Prepared SQL queries for 'Pinterest.Lib.Error' definition.
--


--
-- SELECT template for table `Pinterest.Lib.Error`
--
SELECT `code`, `message` FROM `Pinterest.Lib.Error` WHERE 1;

--
-- INSERT template for table `Pinterest.Lib.Error`
--
INSERT INTO `Pinterest.Lib.Error`(`code`, `message`) VALUES (?, ?);

--
-- UPDATE template for table `Pinterest.Lib.Error`
--
UPDATE `Pinterest.Lib.Error` SET `code` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `Pinterest.Lib.Error`
--
DELETE FROM `Pinterest.Lib.Error` WHERE 0;

