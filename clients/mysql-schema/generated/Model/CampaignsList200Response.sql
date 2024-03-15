--
-- Pinterest REST API.
-- Prepared SQL queries for 'campaigns_list_200_response' definition.
--


--
-- SELECT template for table `campaigns_list_200_response`
--
SELECT `items`, `bookmark` FROM `campaigns_list_200_response` WHERE 1;

--
-- INSERT template for table `campaigns_list_200_response`
--
INSERT INTO `campaigns_list_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `campaigns_list_200_response`
--
UPDATE `campaigns_list_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `campaigns_list_200_response`
--
DELETE FROM `campaigns_list_200_response` WHERE 0;

