--
-- Pinterest REST API.
-- Prepared SQL queries for 'ads_list_200_response' definition.
--


--
-- SELECT template for table `ads_list_200_response`
--
SELECT `bookmark`, `items` FROM `ads_list_200_response` WHERE 1;

--
-- INSERT template for table `ads_list_200_response`
--
INSERT INTO `ads_list_200_response`(`bookmark`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `ads_list_200_response`
--
UPDATE `ads_list_200_response` SET `bookmark` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `ads_list_200_response`
--
DELETE FROM `ads_list_200_response` WHERE 0;

