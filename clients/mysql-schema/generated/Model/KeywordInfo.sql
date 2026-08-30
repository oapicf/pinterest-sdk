--
-- Pinterest REST API.
-- Prepared SQL queries for 'KeywordInfo' definition.
--


--
-- SELECT template for table `KeywordInfo`
--
SELECT `name`, `pct_growth_mom` FROM `KeywordInfo` WHERE 1;

--
-- INSERT template for table `KeywordInfo`
--
INSERT INTO `KeywordInfo`(`name`, `pct_growth_mom`) VALUES (?, ?);

--
-- UPDATE template for table `KeywordInfo`
--
UPDATE `KeywordInfo` SET `name` = ?, `pct_growth_mom` = ? WHERE 1;

--
-- DELETE template for table `KeywordInfo`
--
DELETE FROM `KeywordInfo` WHERE 0;

