--
-- Pinterest REST API.
-- Prepared SQL queries for 'Board_owner' definition.
--


--
-- SELECT template for table `Board_owner`
--
SELECT `username` FROM `Board_owner` WHERE 1;

--
-- INSERT template for table `Board_owner`
--
INSERT INTO `Board_owner`(`username`) VALUES (?);

--
-- UPDATE template for table `Board_owner`
--
UPDATE `Board_owner` SET `username` = ? WHERE 1;

--
-- DELETE template for table `Board_owner`
--
DELETE FROM `Board_owner` WHERE 0;

