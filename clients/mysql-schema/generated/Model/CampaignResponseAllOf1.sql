--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignResponse_allOf_1' definition.
--


--
-- SELECT template for table `CampaignResponse_allOf_1`
--
SELECT `objective_type`, `created_time`, `updated_time`, `type` FROM `CampaignResponse_allOf_1` WHERE 1;

--
-- INSERT template for table `CampaignResponse_allOf_1`
--
INSERT INTO `CampaignResponse_allOf_1`(`objective_type`, `created_time`, `updated_time`, `type`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CampaignResponse_allOf_1`
--
UPDATE `CampaignResponse_allOf_1` SET `objective_type` = ?, `created_time` = ?, `updated_time` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `CampaignResponse_allOf_1`
--
DELETE FROM `CampaignResponse_allOf_1` WHERE 0;

