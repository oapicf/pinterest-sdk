--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionHealthSelectionItem' definition.
--


--
-- SELECT template for table `ConversionHealthSelectionItem`
--
SELECT `conversionType`, `criteria`, `ingestionSource`, `status` FROM `ConversionHealthSelectionItem` WHERE 1;

--
-- INSERT template for table `ConversionHealthSelectionItem`
--
INSERT INTO `ConversionHealthSelectionItem`(`conversionType`, `criteria`, `ingestionSource`, `status`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `ConversionHealthSelectionItem`
--
UPDATE `ConversionHealthSelectionItem` SET `conversionType` = ?, `criteria` = ?, `ingestionSource` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `ConversionHealthSelectionItem`
--
DELETE FROM `ConversionHealthSelectionItem` WHERE 0;

