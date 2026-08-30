--
-- Pinterest REST API.
-- Prepared SQL queries for 'CancelInviteResultItem' definition.
--


--
-- SELECT template for table `CancelInviteResultItem`
--
SELECT `exception`, `invite` FROM `CancelInviteResultItem` WHERE 1;

--
-- INSERT template for table `CancelInviteResultItem`
--
INSERT INTO `CancelInviteResultItem`(`exception`, `invite`) VALUES (?, ?);

--
-- UPDATE template for table `CancelInviteResultItem`
--
UPDATE `CancelInviteResultItem` SET `exception` = ?, `invite` = ? WHERE 1;

--
-- DELETE template for table `CancelInviteResultItem`
--
DELETE FROM `CancelInviteResultItem` WHERE 0;

