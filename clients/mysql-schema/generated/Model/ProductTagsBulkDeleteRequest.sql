--
-- Pinterest REST API.
-- Prepared SQL queries for 'ProductTagsBulkDeleteRequest' definition.
--


--
-- SELECT template for table `ProductTagsBulkDeleteRequest`
--
SELECT `product_tags` FROM `ProductTagsBulkDeleteRequest` WHERE 1;

--
-- INSERT template for table `ProductTagsBulkDeleteRequest`
--
INSERT INTO `ProductTagsBulkDeleteRequest`(`product_tags`) VALUES (?);

--
-- UPDATE template for table `ProductTagsBulkDeleteRequest`
--
UPDATE `ProductTagsBulkDeleteRequest` SET `product_tags` = ? WHERE 1;

--
-- DELETE template for table `ProductTagsBulkDeleteRequest`
--
DELETE FROM `ProductTagsBulkDeleteRequest` WHERE 0;

