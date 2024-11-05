--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaWithImage_allOf_images' definition.
--


--
-- SELECT template for table `PinMediaWithImage_allOf_images`
--
SELECT `150x150`, `400x300`, `600x`, `1200x` FROM `PinMediaWithImage_allOf_images` WHERE 1;

--
-- INSERT template for table `PinMediaWithImage_allOf_images`
--
INSERT INTO `PinMediaWithImage_allOf_images`(`150x150`, `400x300`, `600x`, `1200x`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PinMediaWithImage_allOf_images`
--
UPDATE `PinMediaWithImage_allOf_images` SET `150x150` = ?, `400x300` = ?, `600x` = ?, `1200x` = ? WHERE 1;

--
-- DELETE template for table `PinMediaWithImage_allOf_images`
--
DELETE FROM `PinMediaWithImage_allOf_images` WHERE 0;

