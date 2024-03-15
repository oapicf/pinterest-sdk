--
-- Pinterest REST API.
-- Prepared SQL queries for 'KeywordsCommon' definition.
--


--
-- SELECT template for table `KeywordsCommon`
--
SELECT `bid`, `match_type`, `value` FROM `KeywordsCommon` WHERE 1;

--
-- INSERT template for table `KeywordsCommon`
--
INSERT INTO `KeywordsCommon`(`bid`, `match_type`, `value`) VALUES (?, ?, ?);

--
-- UPDATE template for table `KeywordsCommon`
--
UPDATE `KeywordsCommon` SET `bid` = ?, `match_type` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `KeywordsCommon`
--
DELETE FROM `KeywordsCommon` WHERE 0;

