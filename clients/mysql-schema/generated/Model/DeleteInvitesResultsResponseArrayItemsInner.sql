--
-- Pinterest REST API.
-- Prepared SQL queries for 'DeleteInvitesResultsResponseArray_items_inner' definition.
--


--
-- SELECT template for table `DeleteInvitesResultsResponseArray_items_inner`
--
SELECT `exception`, `invite` FROM `DeleteInvitesResultsResponseArray_items_inner` WHERE 1;

--
-- INSERT template for table `DeleteInvitesResultsResponseArray_items_inner`
--
INSERT INTO `DeleteInvitesResultsResponseArray_items_inner`(`exception`, `invite`) VALUES (?, ?);

--
-- UPDATE template for table `DeleteInvitesResultsResponseArray_items_inner`
--
UPDATE `DeleteInvitesResultsResponseArray_items_inner` SET `exception` = ?, `invite` = ? WHERE 1;

--
-- DELETE template for table `DeleteInvitesResultsResponseArray_items_inner`
--
DELETE FROM `DeleteInvitesResultsResponseArray_items_inner` WHERE 0;

