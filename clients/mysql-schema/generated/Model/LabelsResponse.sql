--
-- Pinterest REST API.
-- Prepared SQL queries for 'LabelsResponse' definition.
--


--
-- SELECT template for table `LabelsResponse`
--
SELECT `errors`, `labels` FROM `LabelsResponse` WHERE 1;

--
-- INSERT template for table `LabelsResponse`
--
INSERT INTO `LabelsResponse`(`errors`, `labels`) VALUES (?, ?);

--
-- UPDATE template for table `LabelsResponse`
--
UPDATE `LabelsResponse` SET `errors` = ?, `labels` = ? WHERE 1;

--
-- DELETE template for table `LabelsResponse`
--
DELETE FROM `LabelsResponse` WHERE 0;

