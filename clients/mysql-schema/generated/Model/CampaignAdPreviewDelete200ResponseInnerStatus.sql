--
-- Pinterest REST API.
-- Prepared SQL queries for 'campaign_ad_preview_delete_200_response_inner_status' definition.
--


--
-- SELECT template for table `campaign_ad_preview_delete_200_response_inner_status`
--
SELECT `statusCode`, `code`, `message` FROM `campaign_ad_preview_delete_200_response_inner_status` WHERE 1;

--
-- INSERT template for table `campaign_ad_preview_delete_200_response_inner_status`
--
INSERT INTO `campaign_ad_preview_delete_200_response_inner_status`(`statusCode`, `code`, `message`) VALUES (?, ?, ?);

--
-- UPDATE template for table `campaign_ad_preview_delete_200_response_inner_status`
--
UPDATE `campaign_ad_preview_delete_200_response_inner_status` SET `statusCode` = ?, `code` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `campaign_ad_preview_delete_200_response_inner_status`
--
DELETE FROM `campaign_ad_preview_delete_200_response_inner_status` WHERE 0;

