--
-- Pinterest REST API.
-- Prepared SQL queries for 'Keyword' definition.
--


--
-- SELECT template for table `Keyword`
--
SELECT `bid`, `match_type`, `value`, `archived`, `id`, `parent_id`, `parent_type`, `type` FROM `Keyword` WHERE 1;

--
-- INSERT template for table `Keyword`
--
INSERT INTO `Keyword`(`bid`, `match_type`, `value`, `archived`, `id`, `parent_id`, `parent_type`, `type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Keyword`
--
UPDATE `Keyword` SET `bid` = ?, `match_type` = ?, `value` = ?, `archived` = ?, `id` = ?, `parent_id` = ?, `parent_type` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `Keyword`
--
DELETE FROM `Keyword` WHERE 0;

