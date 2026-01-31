--
-- Pinterest REST API.
-- Prepared SQL queries for 'KeywordUpdate' definition.
--


--
-- SELECT template for table `KeywordUpdate`
--
SELECT `archived`, `bid`, `id` FROM `KeywordUpdate` WHERE 1;

--
-- INSERT template for table `KeywordUpdate`
--
INSERT INTO `KeywordUpdate`(`archived`, `bid`, `id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `KeywordUpdate`
--
UPDATE `KeywordUpdate` SET `archived` = ?, `bid` = ?, `id` = ? WHERE 1;

--
-- DELETE template for table `KeywordUpdate`
--
DELETE FROM `KeywordUpdate` WHERE 0;

