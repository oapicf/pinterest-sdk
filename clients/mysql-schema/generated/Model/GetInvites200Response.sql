--
-- Pinterest REST API.
-- Prepared SQL queries for 'get_invites_200_response' definition.
--


--
-- SELECT template for table `get_invites_200_response`
--
SELECT `items`, `bookmark` FROM `get_invites_200_response` WHERE 1;

--
-- INSERT template for table `get_invites_200_response`
--
INSERT INTO `get_invites_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `get_invites_200_response`
--
UPDATE `get_invites_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `get_invites_200_response`
--
DELETE FROM `get_invites_200_response` WHERE 0;

