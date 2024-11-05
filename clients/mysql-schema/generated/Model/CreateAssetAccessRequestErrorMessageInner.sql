--
-- Pinterest REST API.
-- Prepared SQL queries for 'CreateAssetAccessRequestErrorMessage_inner' definition.
--


--
-- SELECT template for table `CreateAssetAccessRequestErrorMessage_inner`
--
SELECT `code`, `messages` FROM `CreateAssetAccessRequestErrorMessage_inner` WHERE 1;

--
-- INSERT template for table `CreateAssetAccessRequestErrorMessage_inner`
--
INSERT INTO `CreateAssetAccessRequestErrorMessage_inner`(`code`, `messages`) VALUES (?, ?);

--
-- UPDATE template for table `CreateAssetAccessRequestErrorMessage_inner`
--
UPDATE `CreateAssetAccessRequestErrorMessage_inner` SET `code` = ?, `messages` = ? WHERE 1;

--
-- DELETE template for table `CreateAssetAccessRequestErrorMessage_inner`
--
DELETE FROM `CreateAssetAccessRequestErrorMessage_inner` WHERE 0;

