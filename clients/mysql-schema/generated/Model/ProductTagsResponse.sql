--
-- Pinterest REST API.
-- Prepared SQL queries for 'ProductTagsResponse' definition.
--


--
-- SELECT template for table `ProductTagsResponse`
--
SELECT `product_tags` FROM `ProductTagsResponse` WHERE 1;

--
-- INSERT template for table `ProductTagsResponse`
--
INSERT INTO `ProductTagsResponse`(`product_tags`) VALUES (?);

--
-- UPDATE template for table `ProductTagsResponse`
--
UPDATE `ProductTagsResponse` SET `product_tags` = ? WHERE 1;

--
-- DELETE template for table `ProductTagsResponse`
--
DELETE FROM `ProductTagsResponse` WHERE 0;

