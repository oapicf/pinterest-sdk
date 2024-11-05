--
-- Pinterest REST API.
-- Prepared SQL queries for 'BusinessAccessError' definition.
--


--
-- SELECT template for table `BusinessAccessError`
--
SELECT `code`, `message` FROM `BusinessAccessError` WHERE 1;

--
-- INSERT template for table `BusinessAccessError`
--
INSERT INTO `BusinessAccessError`(`code`, `message`) VALUES (?, ?);

--
-- UPDATE template for table `BusinessAccessError`
--
UPDATE `BusinessAccessError` SET `code` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `BusinessAccessError`
--
DELETE FROM `BusinessAccessError` WHERE 0;

