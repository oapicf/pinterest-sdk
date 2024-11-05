--
-- Pinterest REST API.
-- Prepared SQL queries for 'UpdateInvitesResultsResponseArray_items_inner' definition.
--


--
-- SELECT template for table `UpdateInvitesResultsResponseArray_items_inner`
--
SELECT `exception`, `invite` FROM `UpdateInvitesResultsResponseArray_items_inner` WHERE 1;

--
-- INSERT template for table `UpdateInvitesResultsResponseArray_items_inner`
--
INSERT INTO `UpdateInvitesResultsResponseArray_items_inner`(`exception`, `invite`) VALUES (?, ?);

--
-- UPDATE template for table `UpdateInvitesResultsResponseArray_items_inner`
--
UPDATE `UpdateInvitesResultsResponseArray_items_inner` SET `exception` = ?, `invite` = ? WHERE 1;

--
-- DELETE template for table `UpdateInvitesResultsResponseArray_items_inner`
--
DELETE FROM `UpdateInvitesResultsResponseArray_items_inner` WHERE 0;

