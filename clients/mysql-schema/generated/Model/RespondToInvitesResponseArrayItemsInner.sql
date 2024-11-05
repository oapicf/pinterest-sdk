--
-- Pinterest REST API.
-- Prepared SQL queries for 'RespondToInvitesResponseArray_items_inner' definition.
--


--
-- SELECT template for table `RespondToInvitesResponseArray_items_inner`
--
SELECT `exception`, `invite` FROM `RespondToInvitesResponseArray_items_inner` WHERE 1;

--
-- INSERT template for table `RespondToInvitesResponseArray_items_inner`
--
INSERT INTO `RespondToInvitesResponseArray_items_inner`(`exception`, `invite`) VALUES (?, ?);

--
-- UPDATE template for table `RespondToInvitesResponseArray_items_inner`
--
UPDATE `RespondToInvitesResponseArray_items_inner` SET `exception` = ?, `invite` = ? WHERE 1;

--
-- DELETE template for table `RespondToInvitesResponseArray_items_inner`
--
DELETE FROM `RespondToInvitesResponseArray_items_inner` WHERE 0;

