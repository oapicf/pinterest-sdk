--
-- Pinterest REST API.
-- Prepared SQL queries for 'ItemValidationEvent' definition.
--


--
-- SELECT template for table `ItemValidationEvent`
--
SELECT `attribute`, `code`, `message` FROM `ItemValidationEvent` WHERE 1;

--
-- INSERT template for table `ItemValidationEvent`
--
INSERT INTO `ItemValidationEvent`(`attribute`, `code`, `message`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ItemValidationEvent`
--
UPDATE `ItemValidationEvent` SET `attribute` = ?, `code` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `ItemValidationEvent`
--
DELETE FROM `ItemValidationEvent` WHERE 0;

