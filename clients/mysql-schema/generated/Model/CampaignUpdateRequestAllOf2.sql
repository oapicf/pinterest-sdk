--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignUpdateRequestAllOf2' definition.
--


--
-- SELECT template for table `CampaignUpdateRequestAllOf2`
--
SELECT `bid_options`, `intended_promotion_type`, `is_ltv_optimized`, `is_performance_plus`, `is_top_of_search`, `objective_type` FROM `CampaignUpdateRequestAllOf2` WHERE 1;

--
-- INSERT template for table `CampaignUpdateRequestAllOf2`
--
INSERT INTO `CampaignUpdateRequestAllOf2`(`bid_options`, `intended_promotion_type`, `is_ltv_optimized`, `is_performance_plus`, `is_top_of_search`, `objective_type`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignUpdateRequestAllOf2`
--
UPDATE `CampaignUpdateRequestAllOf2` SET `bid_options` = ?, `intended_promotion_type` = ?, `is_ltv_optimized` = ?, `is_performance_plus` = ?, `is_top_of_search` = ?, `objective_type` = ? WHERE 1;

--
-- DELETE template for table `CampaignUpdateRequestAllOf2`
--
DELETE FROM `CampaignUpdateRequestAllOf2` WHERE 0;

