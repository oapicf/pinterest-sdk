--
-- Pinterest REST API.
-- Prepared SQL queries for 'CustomerSegmentCreate' definition.
--


--
-- SELECT template for table `CustomerSegmentCreate`
--
SELECT `audience_ids`, `name` FROM `CustomerSegmentCreate` WHERE 1;

--
-- INSERT template for table `CustomerSegmentCreate`
--
INSERT INTO `CustomerSegmentCreate`(`audience_ids`, `name`) VALUES (?, ?);

--
-- UPDATE template for table `CustomerSegmentCreate`
--
UPDATE `CustomerSegmentCreate` SET `audience_ids` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `CustomerSegmentCreate`
--
DELETE FROM `CustomerSegmentCreate` WHERE 0;

