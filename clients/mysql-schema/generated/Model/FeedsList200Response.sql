--
-- Pinterest REST API.
-- Prepared SQL queries for 'feeds_list_200_response' definition.
--


--
-- SELECT template for table `feeds_list_200_response`
--
SELECT `items`, `bookmark` FROM `feeds_list_200_response` WHERE 1;

--
-- INSERT template for table `feeds_list_200_response`
--
INSERT INTO `feeds_list_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `feeds_list_200_response`
--
UPDATE `feeds_list_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `feeds_list_200_response`
--
DELETE FROM `feeds_list_200_response` WHERE 0;

