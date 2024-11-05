--
-- Pinterest REST API.
-- Prepared SQL queries for 'MembersToDeleteBody' definition.
--


--
-- SELECT template for table `MembersToDeleteBody`
--
SELECT `members` FROM `MembersToDeleteBody` WHERE 1;

--
-- INSERT template for table `MembersToDeleteBody`
--
INSERT INTO `MembersToDeleteBody`(`members`) VALUES (?);

--
-- UPDATE template for table `MembersToDeleteBody`
--
UPDATE `MembersToDeleteBody` SET `members` = ? WHERE 1;

--
-- DELETE template for table `MembersToDeleteBody`
--
DELETE FROM `MembersToDeleteBody` WHERE 0;

