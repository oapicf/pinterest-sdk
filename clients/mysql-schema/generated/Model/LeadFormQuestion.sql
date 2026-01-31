--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadFormQuestion' definition.
--


--
-- SELECT template for table `LeadFormQuestion`
--
SELECT `custom_question_field_type`, `custom_question_label`, `custom_question_options`, `question_type` FROM `LeadFormQuestion` WHERE 1;

--
-- INSERT template for table `LeadFormQuestion`
--
INSERT INTO `LeadFormQuestion`(`custom_question_field_type`, `custom_question_label`, `custom_question_options`, `question_type`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `LeadFormQuestion`
--
UPDATE `LeadFormQuestion` SET `custom_question_field_type` = ?, `custom_question_label` = ?, `custom_question_options` = ?, `question_type` = ? WHERE 1;

--
-- DELETE template for table `LeadFormQuestion`
--
DELETE FROM `LeadFormQuestion` WHERE 0;

