--
-- Pinterest REST API.
-- Prepared SQL queries for 'QualityComponentIssue' definition.
--


--
-- SELECT template for table `QualityComponentIssue`
--
SELECT `id`, `name`, `reason` FROM `QualityComponentIssue` WHERE 1;

--
-- INSERT template for table `QualityComponentIssue`
--
INSERT INTO `QualityComponentIssue`(`id`, `name`, `reason`) VALUES (?, ?, ?);

--
-- UPDATE template for table `QualityComponentIssue`
--
UPDATE `QualityComponentIssue` SET `id` = ?, `name` = ?, `reason` = ? WHERE 1;

--
-- DELETE template for table `QualityComponentIssue`
--
DELETE FROM `QualityComponentIssue` WHERE 0;

