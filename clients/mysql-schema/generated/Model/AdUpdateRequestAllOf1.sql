--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdUpdateRequestAllOf1' definition.
--


--
-- SELECT template for table `AdUpdateRequestAllOf1`
--
SELECT `id`, `pin_id` FROM `AdUpdateRequestAllOf1` WHERE 1;

--
-- INSERT template for table `AdUpdateRequestAllOf1`
--
INSERT INTO `AdUpdateRequestAllOf1`(`id`, `pin_id`) VALUES (?, ?);

--
-- UPDATE template for table `AdUpdateRequestAllOf1`
--
UPDATE `AdUpdateRequestAllOf1` SET `id` = ?, `pin_id` = ? WHERE 1;

--
-- DELETE template for table `AdUpdateRequestAllOf1`
--
DELETE FROM `AdUpdateRequestAllOf1` WHERE 0;

