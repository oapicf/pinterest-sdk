--
-- Pinterest REST API.
-- Prepared SQL queries for 'EntityLabel' definition.
--


--
-- SELECT template for table `EntityLabel`
--
SELECT `entity_id`, `entity_type`, `label_id`, `status` FROM `EntityLabel` WHERE 1;

--
-- INSERT template for table `EntityLabel`
--
INSERT INTO `EntityLabel`(`entity_id`, `entity_type`, `label_id`, `status`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `EntityLabel`
--
UPDATE `EntityLabel` SET `entity_id` = ?, `entity_type` = ?, `label_id` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `EntityLabel`
--
DELETE FROM `EntityLabel` WHERE 0;

