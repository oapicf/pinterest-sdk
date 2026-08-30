--
-- Pinterest REST API.
-- Prepared SQL queries for 'KeywordCreateItem' definition.
--


--
-- SELECT template for table `KeywordCreateItem`
--
SELECT `bid`, `match_type`, `value` FROM `KeywordCreateItem` WHERE 1;

--
-- INSERT template for table `KeywordCreateItem`
--
INSERT INTO `KeywordCreateItem`(`bid`, `match_type`, `value`) VALUES (?, ?, ?);

--
-- UPDATE template for table `KeywordCreateItem`
--
UPDATE `KeywordCreateItem` SET `bid` = ?, `match_type` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `KeywordCreateItem`
--
DELETE FROM `KeywordCreateItem` WHERE 0;

