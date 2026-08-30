--
-- Pinterest REST API.
-- Prepared SQL queries for 'KeywordsCreate' definition.
--


--
-- SELECT template for table `KeywordsCreate`
--
SELECT `keywords`, `parent_id` FROM `KeywordsCreate` WHERE 1;

--
-- INSERT template for table `KeywordsCreate`
--
INSERT INTO `KeywordsCreate`(`keywords`, `parent_id`) VALUES (?, ?);

--
-- UPDATE template for table `KeywordsCreate`
--
UPDATE `KeywordsCreate` SET `keywords` = ?, `parent_id` = ? WHERE 1;

--
-- DELETE template for table `KeywordsCreate`
--
DELETE FROM `KeywordsCreate` WHERE 0;

