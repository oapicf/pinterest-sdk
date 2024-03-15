--
-- Pinterest REST API.
-- Prepared SQL queries for 'Ad_account_owner' definition.
--


--
-- SELECT template for table `Ad_account_owner`
--
SELECT `username`, `id` FROM `Ad_account_owner` WHERE 1;

--
-- INSERT template for table `Ad_account_owner`
--
INSERT INTO `Ad_account_owner`(`username`, `id`) VALUES (?, ?);

--
-- UPDATE template for table `Ad_account_owner`
--
UPDATE `Ad_account_owner` SET `username` = ?, `id` = ? WHERE 1;

--
-- DELETE template for table `Ad_account_owner`
--
DELETE FROM `Ad_account_owner` WHERE 0;

