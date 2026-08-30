--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionDeletionRequestUserEmailTargets' definition.
--


--
-- SELECT template for table `ConversionDeletionRequestUserEmailTargets`
--
SELECT `user_emails` FROM `ConversionDeletionRequestUserEmailTargets` WHERE 1;

--
-- INSERT template for table `ConversionDeletionRequestUserEmailTargets`
--
INSERT INTO `ConversionDeletionRequestUserEmailTargets`(`user_emails`) VALUES (?);

--
-- UPDATE template for table `ConversionDeletionRequestUserEmailTargets`
--
UPDATE `ConversionDeletionRequestUserEmailTargets` SET `user_emails` = ? WHERE 1;

--
-- DELETE template for table `ConversionDeletionRequestUserEmailTargets`
--
DELETE FROM `ConversionDeletionRequestUserEmailTargets` WHERE 0;

