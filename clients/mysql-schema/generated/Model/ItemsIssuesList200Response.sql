--
-- Pinterest REST API.
-- Prepared SQL queries for 'items_issues_list_200_response' definition.
--


--
-- SELECT template for table `items_issues_list_200_response`
--
SELECT `items`, `bookmark` FROM `items_issues_list_200_response` WHERE 1;

--
-- INSERT template for table `items_issues_list_200_response`
--
INSERT INTO `items_issues_list_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `items_issues_list_200_response`
--
UPDATE `items_issues_list_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `items_issues_list_200_response`
--
DELETE FROM `items_issues_list_200_response` WHERE 0;

