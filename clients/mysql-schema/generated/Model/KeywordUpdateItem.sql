--
-- Pinterest REST API.
-- Prepared SQL queries for 'KeywordUpdateItem' definition.
--


--
-- SELECT template for table `KeywordUpdateItem`
--
SELECT `archived`, `bid`, `id` FROM `KeywordUpdateItem` WHERE 1;

--
-- INSERT template for table `KeywordUpdateItem`
--
INSERT INTO `KeywordUpdateItem`(`archived`, `bid`, `id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `KeywordUpdateItem`
--
UPDATE `KeywordUpdateItem` SET `archived` = ?, `bid` = ?, `id` = ? WHERE 1;

--
-- DELETE template for table `KeywordUpdateItem`
--
DELETE FROM `KeywordUpdateItem` WHERE 0;

