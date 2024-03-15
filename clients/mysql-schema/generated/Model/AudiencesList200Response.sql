--
-- Pinterest REST API.
-- Prepared SQL queries for 'audiences_list_200_response' definition.
--


--
-- SELECT template for table `audiences_list_200_response`
--
SELECT `items`, `bookmark` FROM `audiences_list_200_response` WHERE 1;

--
-- INSERT template for table `audiences_list_200_response`
--
INSERT INTO `audiences_list_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `audiences_list_200_response`
--
UPDATE `audiences_list_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `audiences_list_200_response`
--
DELETE FROM `audiences_list_200_response` WHERE 0;

