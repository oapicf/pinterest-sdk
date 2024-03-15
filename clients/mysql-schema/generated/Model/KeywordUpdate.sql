--
-- Pinterest REST API.
-- Prepared SQL queries for 'KeywordUpdate' definition.
--


--
-- SELECT template for table `KeywordUpdate`
--
SELECT `id`, `archived`, `bid` FROM `KeywordUpdate` WHERE 1;

--
-- INSERT template for table `KeywordUpdate`
--
INSERT INTO `KeywordUpdate`(`id`, `archived`, `bid`) VALUES (?, ?, ?);

--
-- UPDATE template for table `KeywordUpdate`
--
UPDATE `KeywordUpdate` SET `id` = ?, `archived` = ?, `bid` = ? WHERE 1;

--
-- DELETE template for table `KeywordUpdate`
--
DELETE FROM `KeywordUpdate` WHERE 0;

