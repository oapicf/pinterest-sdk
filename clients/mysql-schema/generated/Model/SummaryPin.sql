--
-- Pinterest REST API.
-- Prepared SQL queries for 'SummaryPin' definition.
--


--
-- SELECT template for table `SummaryPin`
--
SELECT `media`, `alt_text`, `link`, `title`, `description` FROM `SummaryPin` WHERE 1;

--
-- INSERT template for table `SummaryPin`
--
INSERT INTO `SummaryPin`(`media`, `alt_text`, `link`, `title`, `description`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `SummaryPin`
--
UPDATE `SummaryPin` SET `media` = ?, `alt_text` = ?, `link` = ?, `title` = ?, `description` = ? WHERE 1;

--
-- DELETE template for table `SummaryPin`
--
DELETE FROM `SummaryPin` WHERE 0;

