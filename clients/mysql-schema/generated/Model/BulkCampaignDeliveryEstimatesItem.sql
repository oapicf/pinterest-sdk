--
-- Pinterest REST API.
-- Prepared SQL queries for 'BulkCampaignDeliveryEstimatesItem' definition.
--


--
-- SELECT template for table `BulkCampaignDeliveryEstimatesItem`
--
SELECT `adgroup_audience_sizes`, `conversion_rate`, `conversion_rates`, `curves`, `derived_metrics`, `errors`, `estimate_id`, `max_potential_spend` FROM `BulkCampaignDeliveryEstimatesItem` WHERE 1;

--
-- INSERT template for table `BulkCampaignDeliveryEstimatesItem`
--
INSERT INTO `BulkCampaignDeliveryEstimatesItem`(`adgroup_audience_sizes`, `conversion_rate`, `conversion_rates`, `curves`, `derived_metrics`, `errors`, `estimate_id`, `max_potential_spend`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BulkCampaignDeliveryEstimatesItem`
--
UPDATE `BulkCampaignDeliveryEstimatesItem` SET `adgroup_audience_sizes` = ?, `conversion_rate` = ?, `conversion_rates` = ?, `curves` = ?, `derived_metrics` = ?, `errors` = ?, `estimate_id` = ?, `max_potential_spend` = ? WHERE 1;

--
-- DELETE template for table `BulkCampaignDeliveryEstimatesItem`
--
DELETE FROM `BulkCampaignDeliveryEstimatesItem` WHERE 0;

