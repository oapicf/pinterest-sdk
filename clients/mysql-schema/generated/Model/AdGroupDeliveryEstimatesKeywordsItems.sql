--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupDeliveryEstimatesKeywordsItems' definition.
--


--
-- SELECT template for table `AdGroupDeliveryEstimatesKeywordsItems`
--
SELECT `match_type`, `value` FROM `AdGroupDeliveryEstimatesKeywordsItems` WHERE 1;

--
-- INSERT template for table `AdGroupDeliveryEstimatesKeywordsItems`
--
INSERT INTO `AdGroupDeliveryEstimatesKeywordsItems`(`match_type`, `value`) VALUES (?, ?);

--
-- UPDATE template for table `AdGroupDeliveryEstimatesKeywordsItems`
--
UPDATE `AdGroupDeliveryEstimatesKeywordsItems` SET `match_type` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `AdGroupDeliveryEstimatesKeywordsItems`
--
DELETE FROM `AdGroupDeliveryEstimatesKeywordsItems` WHERE 0;

