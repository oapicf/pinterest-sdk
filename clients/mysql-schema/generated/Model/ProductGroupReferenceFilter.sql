--
-- Pinterest REST API.
-- Prepared SQL queries for 'ProductGroupReferenceFilter' definition.
--


--
-- SELECT template for table `ProductGroupReferenceFilter`
--
SELECT `PRODUCT_GROUP` FROM `ProductGroupReferenceFilter` WHERE 1;

--
-- INSERT template for table `ProductGroupReferenceFilter`
--
INSERT INTO `ProductGroupReferenceFilter`(`PRODUCT_GROUP`) VALUES (?);

--
-- UPDATE template for table `ProductGroupReferenceFilter`
--
UPDATE `ProductGroupReferenceFilter` SET `PRODUCT_GROUP` = ? WHERE 1;

--
-- DELETE template for table `ProductGroupReferenceFilter`
--
DELETE FROM `ProductGroupReferenceFilter` WHERE 0;

