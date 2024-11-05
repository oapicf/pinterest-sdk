--
-- Pinterest REST API.
-- Prepared SQL queries for 'DeleteMemberAccessResult' definition.
--


--
-- SELECT template for table `DeleteMemberAccessResult`
--
SELECT `asset_id`, `member_id` FROM `DeleteMemberAccessResult` WHERE 1;

--
-- INSERT template for table `DeleteMemberAccessResult`
--
INSERT INTO `DeleteMemberAccessResult`(`asset_id`, `member_id`) VALUES (?, ?);

--
-- UPDATE template for table `DeleteMemberAccessResult`
--
UPDATE `DeleteMemberAccessResult` SET `asset_id` = ?, `member_id` = ? WHERE 1;

--
-- DELETE template for table `DeleteMemberAccessResult`
--
DELETE FROM `DeleteMemberAccessResult` WHERE 0;

