--
-- Pinterest REST API.
-- Prepared SQL queries for 'Media' definition.
--


--
-- SELECT template for table `Media`
--
SELECT `media_id`, `media_type`, `status` FROM `Media` WHERE 1;

--
-- INSERT template for table `Media`
--
INSERT INTO `Media`(`media_id`, `media_type`, `status`) VALUES (?, ?, ?);

--
-- UPDATE template for table `Media`
--
UPDATE `Media` SET `media_id` = ?, `media_type` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `Media`
--
DELETE FROM `Media` WHERE 0;

