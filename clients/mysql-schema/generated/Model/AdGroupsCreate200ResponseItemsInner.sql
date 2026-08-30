--
-- Pinterest REST API.
-- Prepared SQL queries for 'ad_groups_create_200_response_items_inner' definition.
--


--
-- SELECT template for table `ad_groups_create_200_response_items_inner`
--
SELECT `data`, `exceptions` FROM `ad_groups_create_200_response_items_inner` WHERE 1;

--
-- INSERT template for table `ad_groups_create_200_response_items_inner`
--
INSERT INTO `ad_groups_create_200_response_items_inner`(`data`, `exceptions`) VALUES (?, ?);

--
-- UPDATE template for table `ad_groups_create_200_response_items_inner`
--
UPDATE `ad_groups_create_200_response_items_inner` SET `data` = ?, `exceptions` = ? WHERE 1;

--
-- DELETE template for table `ad_groups_create_200_response_items_inner`
--
DELETE FROM `ad_groups_create_200_response_items_inner` WHERE 0;

