--
-- Pinterest REST API.
-- Prepared SQL queries for 'Keyword' definition.
--


--
-- SELECT template for table `Keyword`
--
SELECT `archived`, `bid`, `id`, `match_type`, `parent_id`, `parent_type`, `type`, `value` FROM `Keyword` WHERE 1;

--
-- INSERT template for table `Keyword`
--
INSERT INTO `Keyword`(`archived`, `bid`, `id`, `match_type`, `parent_id`, `parent_type`, `type`, `value`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Keyword`
--
UPDATE `Keyword` SET `archived` = ?, `bid` = ?, `id` = ?, `match_type` = ?, `parent_id` = ?, `parent_type` = ?, `type` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `Keyword`
--
DELETE FROM `Keyword` WHERE 0;

