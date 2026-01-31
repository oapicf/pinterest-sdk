--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemValidationIssues' definition.
--


--
-- SELECT template for table `CatalogsItemValidationIssues`
--
SELECT `errors`, `item_id`, `item_number`, `warnings` FROM `CatalogsItemValidationIssues` WHERE 1;

--
-- INSERT template for table `CatalogsItemValidationIssues`
--
INSERT INTO `CatalogsItemValidationIssues`(`errors`, `item_id`, `item_number`, `warnings`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsItemValidationIssues`
--
UPDATE `CatalogsItemValidationIssues` SET `errors` = ?, `item_id` = ?, `item_number` = ?, `warnings` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemValidationIssues`
--
DELETE FROM `CatalogsItemValidationIssues` WHERE 0;

