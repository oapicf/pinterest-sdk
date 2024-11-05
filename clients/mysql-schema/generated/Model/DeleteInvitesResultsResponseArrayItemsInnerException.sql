--
-- Pinterest REST API.
-- Prepared SQL queries for 'DeleteInvitesResultsResponseArray_items_inner_exception' definition.
--


--
-- SELECT template for table `DeleteInvitesResultsResponseArray_items_inner_exception`
--
SELECT `invite_id`, `message` FROM `DeleteInvitesResultsResponseArray_items_inner_exception` WHERE 1;

--
-- INSERT template for table `DeleteInvitesResultsResponseArray_items_inner_exception`
--
INSERT INTO `DeleteInvitesResultsResponseArray_items_inner_exception`(`invite_id`, `message`) VALUES (?, ?);

--
-- UPDATE template for table `DeleteInvitesResultsResponseArray_items_inner_exception`
--
UPDATE `DeleteInvitesResultsResponseArray_items_inner_exception` SET `invite_id` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `DeleteInvitesResultsResponseArray_items_inner_exception`
--
DELETE FROM `DeleteInvitesResultsResponseArray_items_inner_exception` WHERE 0;

