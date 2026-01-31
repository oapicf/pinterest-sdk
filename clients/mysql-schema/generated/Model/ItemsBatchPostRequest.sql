--
-- Pinterest REST API.
-- Prepared SQL queries for 'items_batch_post_request' definition.
--


--
-- SELECT template for table `items_batch_post_request`
--
SELECT `catalog_id`, `catalog_type`, `country`, `items`, `language`, `operation` FROM `items_batch_post_request` WHERE 1;

--
-- INSERT template for table `items_batch_post_request`
--
INSERT INTO `items_batch_post_request`(`catalog_id`, `catalog_type`, `country`, `items`, `language`, `operation`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `items_batch_post_request`
--
UPDATE `items_batch_post_request` SET `catalog_id` = ?, `catalog_type` = ?, `country` = ?, `items` = ?, `language` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `items_batch_post_request`
--
DELETE FROM `items_batch_post_request` WHERE 0;

