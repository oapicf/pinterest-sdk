--
-- Pinterest REST API.
-- Prepared SQL queries for 'InviteExceptionResponse' definition.
--


--
-- SELECT template for table `InviteExceptionResponse`
--
SELECT `invite_or_request_id`, `code`, `message`, `users_or_partner_ids` FROM `InviteExceptionResponse` WHERE 1;

--
-- INSERT template for table `InviteExceptionResponse`
--
INSERT INTO `InviteExceptionResponse`(`invite_or_request_id`, `code`, `message`, `users_or_partner_ids`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `InviteExceptionResponse`
--
UPDATE `InviteExceptionResponse` SET `invite_or_request_id` = ?, `code` = ?, `message` = ?, `users_or_partner_ids` = ? WHERE 1;

--
-- DELETE template for table `InviteExceptionResponse`
--
DELETE FROM `InviteExceptionResponse` WHERE 0;

