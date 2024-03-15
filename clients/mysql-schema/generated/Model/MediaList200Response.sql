--
-- Pinterest REST API.
-- Prepared SQL queries for 'media_list_200_response' definition.
--


--
-- SELECT template for table `media_list_200_response`
--
SELECT `items`, `bookmark` FROM `media_list_200_response` WHERE 1;

--
-- INSERT template for table `media_list_200_response`
--
INSERT INTO `media_list_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `media_list_200_response`
--
UPDATE `media_list_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `media_list_200_response`
--
DELETE FROM `media_list_200_response` WHERE 0;

