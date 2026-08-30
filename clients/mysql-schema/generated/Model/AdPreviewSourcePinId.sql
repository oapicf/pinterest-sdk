--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdPreviewSourcePinId' definition.
--


--
-- SELECT template for table `AdPreviewSourcePinId`
--
SELECT `creative_type`, `pin_id` FROM `AdPreviewSourcePinId` WHERE 1;

--
-- INSERT template for table `AdPreviewSourcePinId`
--
INSERT INTO `AdPreviewSourcePinId`(`creative_type`, `pin_id`) VALUES (?, ?);

--
-- UPDATE template for table `AdPreviewSourcePinId`
--
UPDATE `AdPreviewSourcePinId` SET `creative_type` = ?, `pin_id` = ? WHERE 1;

--
-- DELETE template for table `AdPreviewSourcePinId`
--
DELETE FROM `AdPreviewSourcePinId` WHERE 0;

