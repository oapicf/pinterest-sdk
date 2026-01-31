--
-- Pinterest REST API.
-- Prepared SQL queries for 'TemplateResponse_date_range_absolute_date_range' definition.
--


--
-- SELECT template for table `TemplateResponse_date_range_absolute_date_range`
--
SELECT `end_date`, `start_date`, `type` FROM `TemplateResponse_date_range_absolute_date_range` WHERE 1;

--
-- INSERT template for table `TemplateResponse_date_range_absolute_date_range`
--
INSERT INTO `TemplateResponse_date_range_absolute_date_range`(`end_date`, `start_date`, `type`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TemplateResponse_date_range_absolute_date_range`
--
UPDATE `TemplateResponse_date_range_absolute_date_range` SET `end_date` = ?, `start_date` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `TemplateResponse_date_range_absolute_date_range`
--
DELETE FROM `TemplateResponse_date_range_absolute_date_range` WHERE 0;

