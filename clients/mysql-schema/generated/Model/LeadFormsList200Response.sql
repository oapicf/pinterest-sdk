--
-- Pinterest REST API.
-- Prepared SQL queries for 'lead_forms_list_200_response' definition.
--


--
-- SELECT template for table `lead_forms_list_200_response`
--
SELECT `items`, `bookmark` FROM `lead_forms_list_200_response` WHERE 1;

--
-- INSERT template for table `lead_forms_list_200_response`
--
INSERT INTO `lead_forms_list_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `lead_forms_list_200_response`
--
UPDATE `lead_forms_list_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `lead_forms_list_200_response`
--
DELETE FROM `lead_forms_list_200_response` WHERE 0;

