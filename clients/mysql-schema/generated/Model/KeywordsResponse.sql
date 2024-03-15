--
-- Pinterest REST API.
-- Prepared SQL queries for 'KeywordsResponse' definition.
--


--
-- SELECT template for table `KeywordsResponse`
--
SELECT `errors`, `keywords` FROM `KeywordsResponse` WHERE 1;

--
-- INSERT template for table `KeywordsResponse`
--
INSERT INTO `KeywordsResponse`(`errors`, `keywords`) VALUES (?, ?);

--
-- UPDATE template for table `KeywordsResponse`
--
UPDATE `KeywordsResponse` SET `errors` = ?, `keywords` = ? WHERE 1;

--
-- DELETE template for table `KeywordsResponse`
--
DELETE FROM `KeywordsResponse` WHERE 0;

