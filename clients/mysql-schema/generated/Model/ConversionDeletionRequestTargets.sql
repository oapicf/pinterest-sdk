--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionDeletionRequestTargets' definition.
--


--
-- SELECT template for table `ConversionDeletionRequestTargets`
--
SELECT `user_emails`, `epiks` FROM `ConversionDeletionRequestTargets` WHERE 1;

--
-- INSERT template for table `ConversionDeletionRequestTargets`
--
INSERT INTO `ConversionDeletionRequestTargets`(`user_emails`, `epiks`) VALUES (?, ?);

--
-- UPDATE template for table `ConversionDeletionRequestTargets`
--
UPDATE `ConversionDeletionRequestTargets` SET `user_emails` = ?, `epiks` = ? WHERE 1;

--
-- DELETE template for table `ConversionDeletionRequestTargets`
--
DELETE FROM `ConversionDeletionRequestTargets` WHERE 0;

