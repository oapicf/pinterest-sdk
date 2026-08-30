--
-- Pinterest REST API.
-- Prepared SQL queries for 'FollowUserCreate' definition.
--


--
-- SELECT template for table `FollowUserCreate`
--
SELECT `auto_follow` FROM `FollowUserCreate` WHERE 1;

--
-- INSERT template for table `FollowUserCreate`
--
INSERT INTO `FollowUserCreate`(`auto_follow`) VALUES (?);

--
-- UPDATE template for table `FollowUserCreate`
--
UPDATE `FollowUserCreate` SET `auto_follow` = ? WHERE 1;

--
-- DELETE template for table `FollowUserCreate`
--
DELETE FROM `FollowUserCreate` WHERE 0;

