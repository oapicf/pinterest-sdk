--
-- Pinterest REST API.
-- Prepared SQL queries for 'followers_list_200_response' definition.
--


--
-- SELECT template for table `followers_list_200_response`
--
SELECT `bookmark`, `items` FROM `followers_list_200_response` WHERE 1;

--
-- INSERT template for table `followers_list_200_response`
--
INSERT INTO `followers_list_200_response`(`bookmark`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `followers_list_200_response`
--
UPDATE `followers_list_200_response` SET `bookmark` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `followers_list_200_response`
--
DELETE FROM `followers_list_200_response` WHERE 0;

