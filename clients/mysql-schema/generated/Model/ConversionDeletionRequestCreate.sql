--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionDeletionRequestCreate' definition.
--


--
-- SELECT template for table `ConversionDeletionRequestCreate`
--
SELECT `deletion_targets` FROM `ConversionDeletionRequestCreate` WHERE 1;

--
-- INSERT template for table `ConversionDeletionRequestCreate`
--
INSERT INTO `ConversionDeletionRequestCreate`(`deletion_targets`) VALUES (?);

--
-- UPDATE template for table `ConversionDeletionRequestCreate`
--
UPDATE `ConversionDeletionRequestCreate` SET `deletion_targets` = ? WHERE 1;

--
-- DELETE template for table `ConversionDeletionRequestCreate`
--
DELETE FROM `ConversionDeletionRequestCreate` WHERE 0;

