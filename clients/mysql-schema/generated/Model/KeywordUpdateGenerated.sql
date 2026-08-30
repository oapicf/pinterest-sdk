--
-- Pinterest REST API.
-- Prepared SQL queries for 'KeywordUpdateGenerated' definition.
--


--
-- SELECT template for table `KeywordUpdateGenerated`
--
SELECT `archived`, `bid`, `id` FROM `KeywordUpdateGenerated` WHERE 1;

--
-- INSERT template for table `KeywordUpdateGenerated`
--
INSERT INTO `KeywordUpdateGenerated`(`archived`, `bid`, `id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `KeywordUpdateGenerated`
--
UPDATE `KeywordUpdateGenerated` SET `archived` = ?, `bid` = ?, `id` = ? WHERE 1;

--
-- DELETE template for table `KeywordUpdateGenerated`
--
DELETE FROM `KeywordUpdateGenerated` WHERE 0;

