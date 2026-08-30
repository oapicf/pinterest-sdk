--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignDeliveryEstimatesResponse' definition.
--


--
-- SELECT template for table `CampaignDeliveryEstimatesResponse`
--
SELECT `curves`, `derived_metrics`, `max_potential_spend` FROM `CampaignDeliveryEstimatesResponse` WHERE 1;

--
-- INSERT template for table `CampaignDeliveryEstimatesResponse`
--
INSERT INTO `CampaignDeliveryEstimatesResponse`(`curves`, `derived_metrics`, `max_potential_spend`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CampaignDeliveryEstimatesResponse`
--
UPDATE `CampaignDeliveryEstimatesResponse` SET `curves` = ?, `derived_metrics` = ?, `max_potential_spend` = ? WHERE 1;

--
-- DELETE template for table `CampaignDeliveryEstimatesResponse`
--
DELETE FROM `CampaignDeliveryEstimatesResponse` WHERE 0;

