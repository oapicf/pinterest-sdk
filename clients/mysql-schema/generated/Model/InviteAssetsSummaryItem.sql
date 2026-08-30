--
-- Pinterest REST API.
-- Prepared SQL queries for 'InviteAssetsSummaryItem' definition.
--


--
-- SELECT template for table `InviteAssetsSummaryItem`
--
SELECT `id`, `permissions` FROM `InviteAssetsSummaryItem` WHERE 1;

--
-- INSERT template for table `InviteAssetsSummaryItem`
--
INSERT INTO `InviteAssetsSummaryItem`(`id`, `permissions`) VALUES (?, ?);

--
-- UPDATE template for table `InviteAssetsSummaryItem`
--
UPDATE `InviteAssetsSummaryItem` SET `id` = ?, `permissions` = ? WHERE 1;

--
-- DELETE template for table `InviteAssetsSummaryItem`
--
DELETE FROM `InviteAssetsSummaryItem` WHERE 0;

