--
-- Pinterest REST API.
-- Prepared SQL queries for 'ad_groups_list_200_response' definition.
--


--
-- SELECT template for table `ad_groups_list_200_response`
--
SELECT `items`, `bookmark` FROM `ad_groups_list_200_response` WHERE 1;

--
-- INSERT template for table `ad_groups_list_200_response`
--
INSERT INTO `ad_groups_list_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `ad_groups_list_200_response`
--
UPDATE `ad_groups_list_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `ad_groups_list_200_response`
--
DELETE FROM `ad_groups_list_200_response` WHERE 0;

