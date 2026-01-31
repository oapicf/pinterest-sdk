--
-- Pinterest REST API.
-- Prepared SQL queries for 'DeliveryMetricsResponse_items_inner' definition.
--


--
-- SELECT template for table `DeliveryMetricsResponse_items_inner`
--
SELECT `category`, `definition`, `display_name`, `name` FROM `DeliveryMetricsResponse_items_inner` WHERE 1;

--
-- INSERT template for table `DeliveryMetricsResponse_items_inner`
--
INSERT INTO `DeliveryMetricsResponse_items_inner`(`category`, `definition`, `display_name`, `name`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `DeliveryMetricsResponse_items_inner`
--
UPDATE `DeliveryMetricsResponse_items_inner` SET `category` = ?, `definition` = ?, `display_name` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `DeliveryMetricsResponse_items_inner`
--
DELETE FROM `DeliveryMetricsResponse_items_inner` WHERE 0;

