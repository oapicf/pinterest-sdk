--
-- Pinterest REST API.
-- Prepared SQL queries for 'AssetAccessRequestError' definition.
--


--
-- SELECT template for table `AssetAccessRequestError`
--
SELECT `code`, `messages` FROM `AssetAccessRequestError` WHERE 1;

--
-- INSERT template for table `AssetAccessRequestError`
--
INSERT INTO `AssetAccessRequestError`(`code`, `messages`) VALUES (?, ?);

--
-- UPDATE template for table `AssetAccessRequestError`
--
UPDATE `AssetAccessRequestError` SET `code` = ?, `messages` = ? WHERE 1;

--
-- DELETE template for table `AssetAccessRequestError`
--
DELETE FROM `AssetAccessRequestError` WHERE 0;

