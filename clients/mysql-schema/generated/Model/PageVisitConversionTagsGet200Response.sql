--
-- Pinterest REST API.
-- Prepared SQL queries for 'page_visit_conversion_tags_get_200_response' definition.
--


--
-- SELECT template for table `page_visit_conversion_tags_get_200_response`
--
SELECT `items`, `bookmark` FROM `page_visit_conversion_tags_get_200_response` WHERE 1;

--
-- INSERT template for table `page_visit_conversion_tags_get_200_response`
--
INSERT INTO `page_visit_conversion_tags_get_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `page_visit_conversion_tags_get_200_response`
--
UPDATE `page_visit_conversion_tags_get_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `page_visit_conversion_tags_get_200_response`
--
DELETE FROM `page_visit_conversion_tags_get_200_response` WHERE 0;

