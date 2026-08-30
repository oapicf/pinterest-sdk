--
-- Pinterest REST API.
-- Prepared SQL queries for 'CancelInviteResultUser' definition.
--


--
-- SELECT template for table `CancelInviteResultUser`
--
SELECT `email`, `id`, `username` FROM `CancelInviteResultUser` WHERE 1;

--
-- INSERT template for table `CancelInviteResultUser`
--
INSERT INTO `CancelInviteResultUser`(`email`, `id`, `username`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CancelInviteResultUser`
--
UPDATE `CancelInviteResultUser` SET `email` = ?, `id` = ?, `username` = ? WHERE 1;

--
-- DELETE template for table `CancelInviteResultUser`
--
DELETE FROM `CancelInviteResultUser` WHERE 0;

