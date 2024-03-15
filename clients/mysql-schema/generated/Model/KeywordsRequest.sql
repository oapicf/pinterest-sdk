--
-- Pinterest REST API.
-- Prepared SQL queries for 'KeywordsRequest' definition.
--


--
-- SELECT template for table `KeywordsRequest`
--
SELECT `keywords`, `parent_id` FROM `KeywordsRequest` WHERE 1;

--
-- INSERT template for table `KeywordsRequest`
--
INSERT INTO `KeywordsRequest`(`keywords`, `parent_id`) VALUES (?, ?);

--
-- UPDATE template for table `KeywordsRequest`
--
UPDATE `KeywordsRequest` SET `keywords` = ?, `parent_id` = ? WHERE 1;

--
-- DELETE template for table `KeywordsRequest`
--
DELETE FROM `KeywordsRequest` WHERE 0;

