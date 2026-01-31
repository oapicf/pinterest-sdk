--
-- Pinterest REST API.
-- Prepared SQL queries for 'labels_list_200_response' definition.
--


--
-- SELECT template for table `labels_list_200_response`
--
SELECT `bookmark`, `items` FROM `labels_list_200_response` WHERE 1;

--
-- INSERT template for table `labels_list_200_response`
--
INSERT INTO `labels_list_200_response`(`bookmark`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `labels_list_200_response`
--
UPDATE `labels_list_200_response` SET `bookmark` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `labels_list_200_response`
--
DELETE FROM `labels_list_200_response` WHERE 0;

