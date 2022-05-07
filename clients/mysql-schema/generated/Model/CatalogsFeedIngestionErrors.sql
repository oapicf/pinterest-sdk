--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedIngestionErrors' definition.
--


--
-- SELECT template for table `CatalogsFeedIngestionErrors`
--
SELECT `image_download_error`, `image_download_connection_timeout`, `image_format_unrecognize`, `line_level_internal_error`, `large_product_count_decrease` FROM `CatalogsFeedIngestionErrors` WHERE 1;

--
-- INSERT template for table `CatalogsFeedIngestionErrors`
--
INSERT INTO `CatalogsFeedIngestionErrors`(`image_download_error`, `image_download_connection_timeout`, `image_format_unrecognize`, `line_level_internal_error`, `large_product_count_decrease`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsFeedIngestionErrors`
--
UPDATE `CatalogsFeedIngestionErrors` SET `image_download_error` = ?, `image_download_connection_timeout` = ?, `image_format_unrecognize` = ?, `line_level_internal_error` = ?, `large_product_count_decrease` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedIngestionErrors`
--
DELETE FROM `CatalogsFeedIngestionErrors` WHERE 0;

