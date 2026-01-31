--
-- Pinterest REST API.
-- Prepared SQL queries for 'items_issues_list_200_response' definition.
--


--
-- SELECT template for table `items_issues_list_200_response`
--
SELECT `bookmark`, `items` FROM `items_issues_list_200_response` WHERE 1;

--
-- INSERT template for table `items_issues_list_200_response`
--
INSERT INTO `items_issues_list_200_response`(`bookmark`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `items_issues_list_200_response`
--
UPDATE `items_issues_list_200_response` SET `bookmark` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `items_issues_list_200_response`
--
DELETE FROM `items_issues_list_200_response` WHERE 0;

