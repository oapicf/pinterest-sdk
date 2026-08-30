--
-- Pinterest REST API.
-- Prepared SQL queries for 'FollowUser' definition.
--


--
-- SELECT template for table `FollowUser`
--
SELECT `type`, `username` FROM `FollowUser` WHERE 1;

--
-- INSERT template for table `FollowUser`
--
INSERT INTO `FollowUser`(`type`, `username`) VALUES (?, ?);

--
-- UPDATE template for table `FollowUser`
--
UPDATE `FollowUser` SET `type` = ?, `username` = ? WHERE 1;

--
-- DELETE template for table `FollowUser`
--
DELETE FROM `FollowUser` WHERE 0;

