--
-- Pinterest REST API.
-- Prepared SQL queries for 'EntityLabelError' definition.
--


--
-- SELECT template for table `EntityLabelError`
--
SELECT `data`, `error_messages` FROM `EntityLabelError` WHERE 1;

--
-- INSERT template for table `EntityLabelError`
--
INSERT INTO `EntityLabelError`(`data`, `error_messages`) VALUES (?, ?);

--
-- UPDATE template for table `EntityLabelError`
--
UPDATE `EntityLabelError` SET `data` = ?, `error_messages` = ? WHERE 1;

--
-- DELETE template for table `EntityLabelError`
--
DELETE FROM `EntityLabelError` WHERE 0;

