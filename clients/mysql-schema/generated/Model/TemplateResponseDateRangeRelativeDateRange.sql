--
-- Pinterest REST API.
-- Prepared SQL queries for 'TemplateResponse_date_range_relative_date_range' definition.
--


--
-- SELECT template for table `TemplateResponse_date_range_relative_date_range`
--
SELECT `end_days_in_past`, `start_days_in_past`, `type` FROM `TemplateResponse_date_range_relative_date_range` WHERE 1;

--
-- INSERT template for table `TemplateResponse_date_range_relative_date_range`
--
INSERT INTO `TemplateResponse_date_range_relative_date_range`(`end_days_in_past`, `start_days_in_past`, `type`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TemplateResponse_date_range_relative_date_range`
--
UPDATE `TemplateResponse_date_range_relative_date_range` SET `end_days_in_past` = ?, `start_days_in_past` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `TemplateResponse_date_range_relative_date_range`
--
DELETE FROM `TemplateResponse_date_range_relative_date_range` WHERE 0;

