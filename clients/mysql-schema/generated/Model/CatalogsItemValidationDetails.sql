--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemValidationDetails' definition.
--


--
-- SELECT template for table `CatalogsItemValidationDetails`
--
SELECT `attribute_name`, `provided_value` FROM `CatalogsItemValidationDetails` WHERE 1;

--
-- INSERT template for table `CatalogsItemValidationDetails`
--
INSERT INTO `CatalogsItemValidationDetails`(`attribute_name`, `provided_value`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsItemValidationDetails`
--
UPDATE `CatalogsItemValidationDetails` SET `attribute_name` = ?, `provided_value` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemValidationDetails`
--
DELETE FROM `CatalogsItemValidationDetails` WHERE 0;

