--
-- Pinterest REST API.
-- Prepared SQL queries for 'keywords_get_200_response' definition.
--


--
-- SELECT template for table `keywords_get_200_response`
--
SELECT `items`, `bookmark` FROM `keywords_get_200_response` WHERE 1;

--
-- INSERT template for table `keywords_get_200_response`
--
INSERT INTO `keywords_get_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `keywords_get_200_response`
--
UPDATE `keywords_get_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `keywords_get_200_response`
--
DELETE FROM `keywords_get_200_response` WHERE 0;

