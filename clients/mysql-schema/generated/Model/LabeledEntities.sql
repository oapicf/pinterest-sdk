--
-- Pinterest REST API.
-- Prepared SQL queries for 'LabeledEntities' definition.
--


--
-- SELECT template for table `LabeledEntities`
--
SELECT `entities_labels`, `errors` FROM `LabeledEntities` WHERE 1;

--
-- INSERT template for table `LabeledEntities`
--
INSERT INTO `LabeledEntities`(`entities_labels`, `errors`) VALUES (?, ?);

--
-- UPDATE template for table `LabeledEntities`
--
UPDATE `LabeledEntities` SET `entities_labels` = ?, `errors` = ? WHERE 1;

--
-- DELETE template for table `LabeledEntities`
--
DELETE FROM `LabeledEntities` WHERE 0;

