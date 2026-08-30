--
-- Pinterest REST API.
-- Prepared SQL queries for 'SupplementalItemValidationEvent' definition.
--


--
-- SELECT template for table `SupplementalItemValidationEvent`
--
SELECT `attribute`, `code`, `message` FROM `SupplementalItemValidationEvent` WHERE 1;

--
-- INSERT template for table `SupplementalItemValidationEvent`
--
INSERT INTO `SupplementalItemValidationEvent`(`attribute`, `code`, `message`) VALUES (?, ?, ?);

--
-- UPDATE template for table `SupplementalItemValidationEvent`
--
UPDATE `SupplementalItemValidationEvent` SET `attribute` = ?, `code` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `SupplementalItemValidationEvent`
--
DELETE FROM `SupplementalItemValidationEvent` WHERE 0;

