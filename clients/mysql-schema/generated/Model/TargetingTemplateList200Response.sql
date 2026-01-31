--
-- Pinterest REST API.
-- Prepared SQL queries for 'targeting_template_list_200_response' definition.
--


--
-- SELECT template for table `targeting_template_list_200_response`
--
SELECT `bookmark`, `items` FROM `targeting_template_list_200_response` WHERE 1;

--
-- INSERT template for table `targeting_template_list_200_response`
--
INSERT INTO `targeting_template_list_200_response`(`bookmark`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `targeting_template_list_200_response`
--
UPDATE `targeting_template_list_200_response` SET `bookmark` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `targeting_template_list_200_response`
--
DELETE FROM `targeting_template_list_200_response` WHERE 0;

