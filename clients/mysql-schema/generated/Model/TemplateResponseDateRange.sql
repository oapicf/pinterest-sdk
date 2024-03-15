--
-- Pinterest REST API.
-- Prepared SQL queries for 'TemplateResponse_date_range' definition.
--


--
-- SELECT template for table `TemplateResponse_date_range`
--
SELECT `dynamic_date_range`, `relative_date_range`, `absolute_date_range` FROM `TemplateResponse_date_range` WHERE 1;

--
-- INSERT template for table `TemplateResponse_date_range`
--
INSERT INTO `TemplateResponse_date_range`(`dynamic_date_range`, `relative_date_range`, `absolute_date_range`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TemplateResponse_date_range`
--
UPDATE `TemplateResponse_date_range` SET `dynamic_date_range` = ?, `relative_date_range` = ?, `absolute_date_range` = ? WHERE 1;

--
-- DELETE template for table `TemplateResponse_date_range`
--
DELETE FROM `TemplateResponse_date_range` WHERE 0;

