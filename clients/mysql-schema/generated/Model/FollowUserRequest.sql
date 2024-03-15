--
-- Pinterest REST API.
-- Prepared SQL queries for 'FollowUserRequest' definition.
--


--
-- SELECT template for table `FollowUserRequest`
--
SELECT `auto_follow` FROM `FollowUserRequest` WHERE 1;

--
-- INSERT template for table `FollowUserRequest`
--
INSERT INTO `FollowUserRequest`(`auto_follow`) VALUES (?);

--
-- UPDATE template for table `FollowUserRequest`
--
UPDATE `FollowUserRequest` SET `auto_follow` = ? WHERE 1;

--
-- DELETE template for table `FollowUserRequest`
--
DELETE FROM `FollowUserRequest` WHERE 0;

