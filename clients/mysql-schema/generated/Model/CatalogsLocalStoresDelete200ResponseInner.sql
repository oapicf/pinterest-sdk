--
-- Pinterest REST API.
-- Prepared SQL queries for 'catalogs_local_stores_delete_200_response_inner' definition.
--


--
-- SELECT template for table `catalogs_local_stores_delete_200_response_inner`
--
SELECT `id`, `status` FROM `catalogs_local_stores_delete_200_response_inner` WHERE 1;

--
-- INSERT template for table `catalogs_local_stores_delete_200_response_inner`
--
INSERT INTO `catalogs_local_stores_delete_200_response_inner`(`id`, `status`) VALUES (?, ?);

--
-- UPDATE template for table `catalogs_local_stores_delete_200_response_inner`
--
UPDATE `catalogs_local_stores_delete_200_response_inner` SET `id` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `catalogs_local_stores_delete_200_response_inner`
--
DELETE FROM `catalogs_local_stores_delete_200_response_inner` WHERE 0;

