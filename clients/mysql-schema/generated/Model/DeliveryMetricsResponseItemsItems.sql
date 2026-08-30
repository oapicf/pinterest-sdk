--
-- Pinterest REST API.
-- Prepared SQL queries for 'DeliveryMetricsResponseItemsItems' definition.
--


--
-- SELECT template for table `DeliveryMetricsResponseItemsItems`
--
SELECT `category`, `definition`, `display_name`, `name` FROM `DeliveryMetricsResponseItemsItems` WHERE 1;

--
-- INSERT template for table `DeliveryMetricsResponseItemsItems`
--
INSERT INTO `DeliveryMetricsResponseItemsItems`(`category`, `definition`, `display_name`, `name`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `DeliveryMetricsResponseItemsItems`
--
UPDATE `DeliveryMetricsResponseItemsItems` SET `category` = ?, `definition` = ?, `display_name` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `DeliveryMetricsResponseItemsItems`
--
DELETE FROM `DeliveryMetricsResponseItemsItems` WHERE 0;

