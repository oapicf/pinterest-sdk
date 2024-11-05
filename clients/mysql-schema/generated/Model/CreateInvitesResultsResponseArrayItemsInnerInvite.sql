--
-- Pinterest REST API.
-- Prepared SQL queries for 'CreateInvitesResultsResponseArray_items_inner_invite' definition.
--


--
-- SELECT template for table `CreateInvitesResultsResponseArray_items_inner_invite`
--
SELECT `id`, `user` FROM `CreateInvitesResultsResponseArray_items_inner_invite` WHERE 1;

--
-- INSERT template for table `CreateInvitesResultsResponseArray_items_inner_invite`
--
INSERT INTO `CreateInvitesResultsResponseArray_items_inner_invite`(`id`, `user`) VALUES (?, ?);

--
-- UPDATE template for table `CreateInvitesResultsResponseArray_items_inner_invite`
--
UPDATE `CreateInvitesResultsResponseArray_items_inner_invite` SET `id` = ?, `user` = ? WHERE 1;

--
-- DELETE template for table `CreateInvitesResultsResponseArray_items_inner_invite`
--
DELETE FROM `CreateInvitesResultsResponseArray_items_inner_invite` WHERE 0;

