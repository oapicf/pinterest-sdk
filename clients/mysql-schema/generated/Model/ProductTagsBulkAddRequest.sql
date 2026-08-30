--
-- Pinterest REST API.
-- Prepared SQL queries for 'ProductTagsBulkAddRequest' definition.
--


--
-- SELECT template for table `ProductTagsBulkAddRequest`
--
SELECT `product_tags` FROM `ProductTagsBulkAddRequest` WHERE 1;

--
-- INSERT template for table `ProductTagsBulkAddRequest`
--
INSERT INTO `ProductTagsBulkAddRequest`(`product_tags`) VALUES (?);

--
-- UPDATE template for table `ProductTagsBulkAddRequest`
--
UPDATE `ProductTagsBulkAddRequest` SET `product_tags` = ? WHERE 1;

--
-- DELETE template for table `ProductTagsBulkAddRequest`
--
DELETE FROM `ProductTagsBulkAddRequest` WHERE 0;

