--
-- Pinterest REST API.
-- Prepared SQL queries for 'IneligibleProductTagErrorItem' definition.
--


--
-- SELECT template for table `IneligibleProductTagErrorItem`
--
SELECT `error_message`, `pin_id` FROM `IneligibleProductTagErrorItem` WHERE 1;

--
-- INSERT template for table `IneligibleProductTagErrorItem`
--
INSERT INTO `IneligibleProductTagErrorItem`(`error_message`, `pin_id`) VALUES (?, ?);

--
-- UPDATE template for table `IneligibleProductTagErrorItem`
--
UPDATE `IneligibleProductTagErrorItem` SET `error_message` = ?, `pin_id` = ? WHERE 1;

--
-- DELETE template for table `IneligibleProductTagErrorItem`
--
DELETE FROM `IneligibleProductTagErrorItem` WHERE 0;

