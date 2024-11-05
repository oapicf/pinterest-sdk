--
-- Pinterest REST API.
-- Prepared SQL queries for 'UpdatePartnerResultsResponseArray_items_inner' definition.
--


--
-- SELECT template for table `UpdatePartnerResultsResponseArray_items_inner`
--
SELECT `exception`, `member_or_partner_id` FROM `UpdatePartnerResultsResponseArray_items_inner` WHERE 1;

--
-- INSERT template for table `UpdatePartnerResultsResponseArray_items_inner`
--
INSERT INTO `UpdatePartnerResultsResponseArray_items_inner`(`exception`, `member_or_partner_id`) VALUES (?, ?);

--
-- UPDATE template for table `UpdatePartnerResultsResponseArray_items_inner`
--
UPDATE `UpdatePartnerResultsResponseArray_items_inner` SET `exception` = ?, `member_or_partner_id` = ? WHERE 1;

--
-- DELETE template for table `UpdatePartnerResultsResponseArray_items_inner`
--
DELETE FROM `UpdatePartnerResultsResponseArray_items_inner` WHERE 0;

