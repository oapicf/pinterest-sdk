--
-- Pinterest REST API.
-- Prepared SQL queries for 'ProductTagsError' definition.
--


--
-- SELECT template for table `ProductTagsError`
--
SELECT `code`, `details`, `message` FROM `ProductTagsError` WHERE 1;

--
-- INSERT template for table `ProductTagsError`
--
INSERT INTO `ProductTagsError`(`code`, `details`, `message`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ProductTagsError`
--
UPDATE `ProductTagsError` SET `code` = ?, `details` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `ProductTagsError`
--
DELETE FROM `ProductTagsError` WHERE 0;

