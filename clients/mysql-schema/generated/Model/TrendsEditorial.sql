--
-- Pinterest REST API.
-- Prepared SQL queries for 'TrendsEditorial' definition.
--


--
-- SELECT template for table `TrendsEditorial`
--
SELECT `board_url`, `description`, `interests`, `pins_url`, `related_keywords`, `title` FROM `TrendsEditorial` WHERE 1;

--
-- INSERT template for table `TrendsEditorial`
--
INSERT INTO `TrendsEditorial`(`board_url`, `description`, `interests`, `pins_url`, `related_keywords`, `title`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TrendsEditorial`
--
UPDATE `TrendsEditorial` SET `board_url` = ?, `description` = ?, `interests` = ?, `pins_url` = ?, `related_keywords` = ?, `title` = ? WHERE 1;

--
-- DELETE template for table `TrendsEditorial`
--
DELETE FROM `TrendsEditorial` WHERE 0;

