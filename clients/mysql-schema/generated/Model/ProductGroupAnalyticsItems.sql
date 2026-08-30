--
-- Pinterest REST API.
-- Prepared SQL queries for 'ProductGroupAnalyticsItems' definition.
--


--
-- SELECT template for table `ProductGroupAnalyticsItems`
--
SELECT `DATE`, `PRODUCT_GROUP_ID` FROM `ProductGroupAnalyticsItems` WHERE 1;

--
-- INSERT template for table `ProductGroupAnalyticsItems`
--
INSERT INTO `ProductGroupAnalyticsItems`(`DATE`, `PRODUCT_GROUP_ID`) VALUES (?, ?);

--
-- UPDATE template for table `ProductGroupAnalyticsItems`
--
UPDATE `ProductGroupAnalyticsItems` SET `DATE` = ?, `PRODUCT_GROUP_ID` = ? WHERE 1;

--
-- DELETE template for table `ProductGroupAnalyticsItems`
--
DELETE FROM `ProductGroupAnalyticsItems` WHERE 0;

