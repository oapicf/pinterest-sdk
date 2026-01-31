--
-- Pinterest REST API.
-- Prepared SQL queries for 'TemplateResponse_date_range_dynamic_date_range' definition.
--


--
-- SELECT template for table `TemplateResponse_date_range_dynamic_date_range`
--
SELECT `range`, `type` FROM `TemplateResponse_date_range_dynamic_date_range` WHERE 1;

--
-- INSERT template for table `TemplateResponse_date_range_dynamic_date_range`
--
INSERT INTO `TemplateResponse_date_range_dynamic_date_range`(`range`, `type`) VALUES (?, ?);

--
-- UPDATE template for table `TemplateResponse_date_range_dynamic_date_range`
--
UPDATE `TemplateResponse_date_range_dynamic_date_range` SET `range` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `TemplateResponse_date_range_dynamic_date_range`
--
DELETE FROM `TemplateResponse_date_range_dynamic_date_range` WHERE 0;

