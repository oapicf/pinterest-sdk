--
-- Pinterest REST API.
-- Prepared SQL queries for 'catalogs_list_200_response' definition.
--


--
-- SELECT template for table `catalogs_list_200_response`
--
SELECT `items`, `bookmark` FROM `catalogs_list_200_response` WHERE 1;

--
-- INSERT template for table `catalogs_list_200_response`
--
INSERT INTO `catalogs_list_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `catalogs_list_200_response`
--
UPDATE `catalogs_list_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `catalogs_list_200_response`
--
DELETE FROM `catalogs_list_200_response` WHERE 0;

