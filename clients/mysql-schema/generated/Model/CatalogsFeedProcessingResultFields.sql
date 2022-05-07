--
-- Pinterest REST API.
-- Prepared SQL queries for 'catalogs_feed_processing_result_fields' definition.
--


--
-- SELECT template for table `catalogs_feed_processing_result_fields`
--
SELECT `ingestion_details`, `status`, `product_counts`, `validation_details` FROM `catalogs_feed_processing_result_fields` WHERE 1;

--
-- INSERT template for table `catalogs_feed_processing_result_fields`
--
INSERT INTO `catalogs_feed_processing_result_fields`(`ingestion_details`, `status`, `product_counts`, `validation_details`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `catalogs_feed_processing_result_fields`
--
UPDATE `catalogs_feed_processing_result_fields` SET `ingestion_details` = ?, `status` = ?, `product_counts` = ?, `validation_details` = ? WHERE 1;

--
-- DELETE template for table `catalogs_feed_processing_result_fields`
--
DELETE FROM `catalogs_feed_processing_result_fields` WHERE 0;

