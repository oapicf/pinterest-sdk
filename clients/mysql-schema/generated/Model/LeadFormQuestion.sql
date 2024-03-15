--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadFormQuestion' definition.
--


--
-- SELECT template for table `LeadFormQuestion`
--
SELECT `question_type`, `custom_question_field_type`, `custom_question_label`, `custom_question_options` FROM `LeadFormQuestion` WHERE 1;

--
-- INSERT template for table `LeadFormQuestion`
--
INSERT INTO `LeadFormQuestion`(`question_type`, `custom_question_field_type`, `custom_question_label`, `custom_question_options`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `LeadFormQuestion`
--
UPDATE `LeadFormQuestion` SET `question_type` = ?, `custom_question_field_type` = ?, `custom_question_label` = ?, `custom_question_options` = ? WHERE 1;

--
-- DELETE template for table `LeadFormQuestion`
--
DELETE FROM `LeadFormQuestion` WHERE 0;

