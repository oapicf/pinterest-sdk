--
-- Pinterest REST API.
-- Prepared SQL queries for 'RespondToInviteResultItem' definition.
--


--
-- SELECT template for table `RespondToInviteResultItem`
--
SELECT `exception`, `invite` FROM `RespondToInviteResultItem` WHERE 1;

--
-- INSERT template for table `RespondToInviteResultItem`
--
INSERT INTO `RespondToInviteResultItem`(`exception`, `invite`) VALUES (?, ?);

--
-- UPDATE template for table `RespondToInviteResultItem`
--
UPDATE `RespondToInviteResultItem` SET `exception` = ?, `invite` = ? WHERE 1;

--
-- DELETE template for table `RespondToInviteResultItem`
--
DELETE FROM `RespondToInviteResultItem` WHERE 0;

