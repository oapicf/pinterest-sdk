--
-- Pinterest REST API.
-- Prepared SQL queries for 'ProductGroupAnalyticsResponse_inner' definition.
--


--
-- SELECT template for table `ProductGroupAnalyticsResponse_inner`
--
SELECT `DATE`, `PRODUCT_GROUP_ID` FROM `ProductGroupAnalyticsResponse_inner` WHERE 1;

--
-- INSERT template for table `ProductGroupAnalyticsResponse_inner`
--
INSERT INTO `ProductGroupAnalyticsResponse_inner`(`DATE`, `PRODUCT_GROUP_ID`) VALUES (?, ?);

--
-- UPDATE template for table `ProductGroupAnalyticsResponse_inner`
--
UPDATE `ProductGroupAnalyticsResponse_inner` SET `DATE` = ?, `PRODUCT_GROUP_ID` = ? WHERE 1;

--
-- DELETE template for table `ProductGroupAnalyticsResponse_inner`
--
DELETE FROM `ProductGroupAnalyticsResponse_inner` WHERE 0;

