--
-- Pinterest REST API.
-- Prepared SQL queries for 'feeds_list_200_response' definition.
--


--
-- SELECT template for table `feeds_list_200_response`
--
SELECT `bookmark`, `items` FROM `feeds_list_200_response` WHERE 1;

--
-- INSERT template for table `feeds_list_200_response`
--
INSERT INTO `feeds_list_200_response`(`bookmark`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `feeds_list_200_response`
--
UPDATE `feeds_list_200_response` SET `bookmark` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `feeds_list_200_response`
--
DELETE FROM `feeds_list_200_response` WHERE 0;

