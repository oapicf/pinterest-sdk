--
-- Pinterest REST API.
-- Prepared SQL queries for 'BoardWithUpdatePrivacyUpdate' definition.
--


--
-- SELECT template for table `BoardWithUpdatePrivacyUpdate`
--
SELECT `description`, `name`, `privacy` FROM `BoardWithUpdatePrivacyUpdate` WHERE 1;

--
-- INSERT template for table `BoardWithUpdatePrivacyUpdate`
--
INSERT INTO `BoardWithUpdatePrivacyUpdate`(`description`, `name`, `privacy`) VALUES (?, ?, ?);

--
-- UPDATE template for table `BoardWithUpdatePrivacyUpdate`
--
UPDATE `BoardWithUpdatePrivacyUpdate` SET `description` = ?, `name` = ?, `privacy` = ? WHERE 1;

--
-- DELETE template for table `BoardWithUpdatePrivacyUpdate`
--
DELETE FROM `BoardWithUpdatePrivacyUpdate` WHERE 0;

