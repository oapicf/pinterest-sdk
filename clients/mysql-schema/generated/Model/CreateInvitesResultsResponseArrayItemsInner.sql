--
-- Pinterest REST API.
-- Prepared SQL queries for 'CreateInvitesResultsResponseArray_items_inner' definition.
--


--
-- SELECT template for table `CreateInvitesResultsResponseArray_items_inner`
--
SELECT `exception`, `invite` FROM `CreateInvitesResultsResponseArray_items_inner` WHERE 1;

--
-- INSERT template for table `CreateInvitesResultsResponseArray_items_inner`
--
INSERT INTO `CreateInvitesResultsResponseArray_items_inner`(`exception`, `invite`) VALUES (?, ?);

--
-- UPDATE template for table `CreateInvitesResultsResponseArray_items_inner`
--
UPDATE `CreateInvitesResultsResponseArray_items_inner` SET `exception` = ?, `invite` = ? WHERE 1;

--
-- DELETE template for table `CreateInvitesResultsResponseArray_items_inner`
--
DELETE FROM `CreateInvitesResultsResponseArray_items_inner` WHERE 0;

