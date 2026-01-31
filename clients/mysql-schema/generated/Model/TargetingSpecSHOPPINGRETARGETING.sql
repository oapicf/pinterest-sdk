--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingSpecShoppingRetargeting' definition.
--


--
-- SELECT template for table `TargetingSpecShoppingRetargeting`
--
SELECT `exclusion_window`, `lookback_window`, `tag_types` FROM `TargetingSpecShoppingRetargeting` WHERE 1;

--
-- INSERT template for table `TargetingSpecShoppingRetargeting`
--
INSERT INTO `TargetingSpecShoppingRetargeting`(`exclusion_window`, `lookback_window`, `tag_types`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TargetingSpecShoppingRetargeting`
--
UPDATE `TargetingSpecShoppingRetargeting` SET `exclusion_window` = ?, `lookback_window` = ?, `tag_types` = ? WHERE 1;

--
-- DELETE template for table `TargetingSpecShoppingRetargeting`
--
DELETE FROM `TargetingSpecShoppingRetargeting` WHERE 0;

