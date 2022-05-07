--
-- Pinterest REST API.
-- Prepared SQL queries for 'BoardUpdate' definition.
--


--
-- SELECT template for table `BoardUpdate`
--
SELECT `name`, `description`, `privacy` FROM `BoardUpdate` WHERE 1;

--
-- INSERT template for table `BoardUpdate`
--
INSERT INTO `BoardUpdate`(`name`, `description`, `privacy`) VALUES (?, ?, ?);

--
-- UPDATE template for table `BoardUpdate`
--
UPDATE `BoardUpdate` SET `name` = ?, `description` = ?, `privacy` = ? WHERE 1;

--
-- DELETE template for table `BoardUpdate`
--
DELETE FROM `BoardUpdate` WHERE 0;

