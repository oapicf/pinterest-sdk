--
-- Pinterest REST API.
-- Prepared SQL queries for 'SummaryPin' definition.
--


--
-- SELECT template for table `SummaryPin`
--
SELECT `alt_text`, `description`, `id`, `link`, `media`, `title` FROM `SummaryPin` WHERE 1;

--
-- INSERT template for table `SummaryPin`
--
INSERT INTO `SummaryPin`(`alt_text`, `description`, `id`, `link`, `media`, `title`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SummaryPin`
--
UPDATE `SummaryPin` SET `alt_text` = ?, `description` = ?, `id` = ?, `link` = ?, `media` = ?, `title` = ? WHERE 1;

--
-- DELETE template for table `SummaryPin`
--
DELETE FROM `SummaryPin` WHERE 0;

