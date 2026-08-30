--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinterestProductCategoriesFilter' definition.
--


--
-- SELECT template for table `PinterestProductCategoriesFilter`
--
SELECT `PINTEREST_PRODUCT_CATEGORIES` FROM `PinterestProductCategoriesFilter` WHERE 1;

--
-- INSERT template for table `PinterestProductCategoriesFilter`
--
INSERT INTO `PinterestProductCategoriesFilter`(`PINTEREST_PRODUCT_CATEGORIES`) VALUES (?);

--
-- UPDATE template for table `PinterestProductCategoriesFilter`
--
UPDATE `PinterestProductCategoriesFilter` SET `PINTEREST_PRODUCT_CATEGORIES` = ? WHERE 1;

--
-- DELETE template for table `PinterestProductCategoriesFilter`
--
DELETE FROM `PinterestProductCategoriesFilter` WHERE 0;

