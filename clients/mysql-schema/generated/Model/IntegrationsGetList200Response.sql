--
-- Pinterest REST API.
-- Prepared SQL queries for 'integrations_get_list_200_response' definition.
--


--
-- SELECT template for table `integrations_get_list_200_response`
--
SELECT `items`, `bookmark` FROM `integrations_get_list_200_response` WHERE 1;

--
-- INSERT template for table `integrations_get_list_200_response`
--
INSERT INTO `integrations_get_list_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `integrations_get_list_200_response`
--
UPDATE `integrations_get_list_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `integrations_get_list_200_response`
--
DELETE FROM `integrations_get_list_200_response` WHERE 0;

