--
-- Pinterest REST API.
-- Prepared SQL queries for 'KeywordUpdateBody' definition.
--


--
-- SELECT template for table `KeywordUpdateBody`
--
SELECT `keywords` FROM `KeywordUpdateBody` WHERE 1;

--
-- INSERT template for table `KeywordUpdateBody`
--
INSERT INTO `KeywordUpdateBody`(`keywords`) VALUES (?);

--
-- UPDATE template for table `KeywordUpdateBody`
--
UPDATE `KeywordUpdateBody` SET `keywords` = ? WHERE 1;

--
-- DELETE template for table `KeywordUpdateBody`
--
DELETE FROM `KeywordUpdateBody` WHERE 0;

