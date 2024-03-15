--
-- Pinterest REST API.
-- Prepared SQL queries for 'TemplateResponse_date_range_dynamic_date_range' definition.
--


--
-- SELECT template for table `TemplateResponse_date_range_dynamic_date_range`
--
SELECT `type`, `range` FROM `TemplateResponse_date_range_dynamic_date_range` WHERE 1;

--
-- INSERT template for table `TemplateResponse_date_range_dynamic_date_range`
--
INSERT INTO `TemplateResponse_date_range_dynamic_date_range`(`type`, `range`) VALUES (?, ?);

--
-- UPDATE template for table `TemplateResponse_date_range_dynamic_date_range`
--
UPDATE `TemplateResponse_date_range_dynamic_date_range` SET `type` = ?, `range` = ? WHERE 1;

--
-- DELETE template for table `TemplateResponse_date_range_dynamic_date_range`
--
DELETE FROM `TemplateResponse_date_range_dynamic_date_range` WHERE 0;

