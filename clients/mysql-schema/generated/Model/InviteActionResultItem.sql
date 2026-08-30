--
-- Pinterest REST API.
-- Prepared SQL queries for 'InviteActionResultItem' definition.
--


--
-- SELECT template for table `InviteActionResultItem`
--
SELECT `exception`, `invite` FROM `InviteActionResultItem` WHERE 1;

--
-- INSERT template for table `InviteActionResultItem`
--
INSERT INTO `InviteActionResultItem`(`exception`, `invite`) VALUES (?, ?);

--
-- UPDATE template for table `InviteActionResultItem`
--
UPDATE `InviteActionResultItem` SET `exception` = ?, `invite` = ? WHERE 1;

--
-- DELETE template for table `InviteActionResultItem`
--
DELETE FROM `InviteActionResultItem` WHERE 0;

