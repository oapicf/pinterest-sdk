--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemValidationIssues' definition.
--


--
-- SELECT template for table `CatalogsItemValidationIssues`
--
SELECT `item_number`, `item_id`, `errors`, `warnings` FROM `CatalogsItemValidationIssues` WHERE 1;

--
-- INSERT template for table `CatalogsItemValidationIssues`
--
INSERT INTO `CatalogsItemValidationIssues`(`item_number`, `item_id`, `errors`, `warnings`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsItemValidationIssues`
--
UPDATE `CatalogsItemValidationIssues` SET `item_number` = ?, `item_id` = ?, `errors` = ?, `warnings` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemValidationIssues`
--
DELETE FROM `CatalogsItemValidationIssues` WHERE 0;

