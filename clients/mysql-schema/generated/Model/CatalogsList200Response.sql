--
-- Pinterest REST API.
-- Prepared SQL queries for 'catalogs_list_200_response' definition.
--


--
-- SELECT template for table `catalogs_list_200_response`
--
SELECT `bookmark`, `items` FROM `catalogs_list_200_response` WHERE 1;

--
-- INSERT template for table `catalogs_list_200_response`
--
INSERT INTO `catalogs_list_200_response`(`bookmark`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `catalogs_list_200_response`
--
UPDATE `catalogs_list_200_response` SET `bookmark` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `catalogs_list_200_response`
--
DELETE FROM `catalogs_list_200_response` WHERE 0;

