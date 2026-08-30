--
-- Pinterest REST API.
-- Prepared SQL queries for 'ProductTagItem' definition.
--


--
-- SELECT template for table `ProductTagItem`
--
SELECT `pin_id` FROM `ProductTagItem` WHERE 1;

--
-- INSERT template for table `ProductTagItem`
--
INSERT INTO `ProductTagItem`(`pin_id`) VALUES (?);

--
-- UPDATE template for table `ProductTagItem`
--
UPDATE `ProductTagItem` SET `pin_id` = ? WHERE 1;

--
-- DELETE template for table `ProductTagItem`
--
DELETE FROM `ProductTagItem` WHERE 0;

