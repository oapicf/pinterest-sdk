--
-- Pinterest REST API.
-- Prepared SQL queries for 'CreateAssetAccessRequestResponse' definition.
--


--
-- SELECT template for table `CreateAssetAccessRequestResponse`
--
SELECT `exceptions`, `invites` FROM `CreateAssetAccessRequestResponse` WHERE 1;

--
-- INSERT template for table `CreateAssetAccessRequestResponse`
--
INSERT INTO `CreateAssetAccessRequestResponse`(`exceptions`, `invites`) VALUES (?, ?);

--
-- UPDATE template for table `CreateAssetAccessRequestResponse`
--
UPDATE `CreateAssetAccessRequestResponse` SET `exceptions` = ?, `invites` = ? WHERE 1;

--
-- DELETE template for table `CreateAssetAccessRequestResponse`
--
DELETE FROM `CreateAssetAccessRequestResponse` WHERE 0;

