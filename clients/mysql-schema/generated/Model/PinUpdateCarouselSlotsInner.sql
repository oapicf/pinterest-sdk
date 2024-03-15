--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinUpdate_carousel_slots_inner' definition.
--


--
-- SELECT template for table `PinUpdate_carousel_slots_inner`
--
SELECT `title`, `description`, `link` FROM `PinUpdate_carousel_slots_inner` WHERE 1;

--
-- INSERT template for table `PinUpdate_carousel_slots_inner`
--
INSERT INTO `PinUpdate_carousel_slots_inner`(`title`, `description`, `link`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PinUpdate_carousel_slots_inner`
--
UPDATE `PinUpdate_carousel_slots_inner` SET `title` = ?, `description` = ?, `link` = ? WHERE 1;

--
-- DELETE template for table `PinUpdate_carousel_slots_inner`
--
DELETE FROM `PinUpdate_carousel_slots_inner` WHERE 0;

