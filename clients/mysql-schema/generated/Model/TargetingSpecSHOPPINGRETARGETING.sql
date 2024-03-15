--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingSpec_SHOPPING_RETARGETING' definition.
--


--
-- SELECT template for table `TargetingSpec_SHOPPING_RETARGETING`
--
SELECT `lookback_window`, `tag_types`, `exclusion_window` FROM `TargetingSpec_SHOPPING_RETARGETING` WHERE 1;

--
-- INSERT template for table `TargetingSpec_SHOPPING_RETARGETING`
--
INSERT INTO `TargetingSpec_SHOPPING_RETARGETING`(`lookback_window`, `tag_types`, `exclusion_window`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TargetingSpec_SHOPPING_RETARGETING`
--
UPDATE `TargetingSpec_SHOPPING_RETARGETING` SET `lookback_window` = ?, `tag_types` = ?, `exclusion_window` = ? WHERE 1;

--
-- DELETE template for table `TargetingSpec_SHOPPING_RETARGETING`
--
DELETE FROM `TargetingSpec_SHOPPING_RETARGETING` WHERE 0;

