--
-- Pinterest REST API.
-- Prepared SQL queries for 'ProductGroupAnalyticsResponse_inner' definition.
--


--
-- SELECT template for table `ProductGroupAnalyticsResponse_inner`
--
SELECT `PRODUCT_GROUP_ID`, `DATE` FROM `ProductGroupAnalyticsResponse_inner` WHERE 1;

--
-- INSERT template for table `ProductGroupAnalyticsResponse_inner`
--
INSERT INTO `ProductGroupAnalyticsResponse_inner`(`PRODUCT_GROUP_ID`, `DATE`) VALUES (?, ?);

--
-- UPDATE template for table `ProductGroupAnalyticsResponse_inner`
--
UPDATE `ProductGroupAnalyticsResponse_inner` SET `PRODUCT_GROUP_ID` = ?, `DATE` = ? WHERE 1;

--
-- DELETE template for table `ProductGroupAnalyticsResponse_inner`
--
DELETE FROM `ProductGroupAnalyticsResponse_inner` WHERE 0;

