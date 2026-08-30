--
-- Pinterest REST API.
-- Prepared SQL queries for 'LabeledEntitiesCreate' definition.
--


--
-- SELECT template for table `LabeledEntitiesCreate`
--
SELECT `entity_ids` FROM `LabeledEntitiesCreate` WHERE 1;

--
-- INSERT template for table `LabeledEntitiesCreate`
--
INSERT INTO `LabeledEntitiesCreate`(`entity_ids`) VALUES (?);

--
-- UPDATE template for table `LabeledEntitiesCreate`
--
UPDATE `LabeledEntitiesCreate` SET `entity_ids` = ? WHERE 1;

--
-- DELETE template for table `LabeledEntitiesCreate`
--
DELETE FROM `LabeledEntitiesCreate` WHERE 0;

