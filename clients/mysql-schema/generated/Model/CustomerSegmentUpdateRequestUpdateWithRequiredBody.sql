--
-- Pinterest REST API.
-- Prepared SQL queries for 'CustomerSegmentUpdateRequestUpdateWithRequiredBody' definition.
--


--
-- SELECT template for table `CustomerSegmentUpdateRequestUpdateWithRequiredBody`
--
SELECT `audience_ids`, `id`, `operation_type` FROM `CustomerSegmentUpdateRequestUpdateWithRequiredBody` WHERE 1;

--
-- INSERT template for table `CustomerSegmentUpdateRequestUpdateWithRequiredBody`
--
INSERT INTO `CustomerSegmentUpdateRequestUpdateWithRequiredBody`(`audience_ids`, `id`, `operation_type`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CustomerSegmentUpdateRequestUpdateWithRequiredBody`
--
UPDATE `CustomerSegmentUpdateRequestUpdateWithRequiredBody` SET `audience_ids` = ?, `id` = ?, `operation_type` = ? WHERE 1;

--
-- DELETE template for table `CustomerSegmentUpdateRequestUpdateWithRequiredBody`
--
DELETE FROM `CustomerSegmentUpdateRequestUpdateWithRequiredBody` WHERE 0;

