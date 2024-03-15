--
-- Pinterest REST API.
-- Prepared SQL queries for 'KeywordError' definition.
--


--
-- SELECT template for table `KeywordError`
--
SELECT `data`, `error_messages` FROM `KeywordError` WHERE 1;

--
-- INSERT template for table `KeywordError`
--
INSERT INTO `KeywordError`(`data`, `error_messages`) VALUES (?, ?);

--
-- UPDATE template for table `KeywordError`
--
UPDATE `KeywordError` SET `data` = ?, `error_messages` = ? WHERE 1;

--
-- DELETE template for table `KeywordError`
--
DELETE FROM `KeywordError` WHERE 0;

