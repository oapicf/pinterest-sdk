--
-- Pinterest REST API.
-- Prepared SQL queries for 'Keyword' definition.
--


--
-- SELECT template for table `Keyword`
--
SELECT `archived`, `id`, `parent_id`, `parent_type`, `type`, `bid`, `match_type`, `value` FROM `Keyword` WHERE 1;

--
-- INSERT template for table `Keyword`
--
INSERT INTO `Keyword`(`archived`, `id`, `parent_id`, `parent_type`, `type`, `bid`, `match_type`, `value`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Keyword`
--
UPDATE `Keyword` SET `archived` = ?, `id` = ?, `parent_id` = ?, `parent_type` = ?, `type` = ?, `bid` = ?, `match_type` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `Keyword`
--
DELETE FROM `Keyword` WHERE 0;

