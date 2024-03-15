--
-- Pinterest REST API.
-- Prepared SQL queries for 'RelatedTerms' definition.
--


--
-- SELECT template for table `RelatedTerms`
--
SELECT `id`, `related_term_count`, `related_terms_list` FROM `RelatedTerms` WHERE 1;

--
-- INSERT template for table `RelatedTerms`
--
INSERT INTO `RelatedTerms`(`id`, `related_term_count`, `related_terms_list`) VALUES (?, ?, ?);

--
-- UPDATE template for table `RelatedTerms`
--
UPDATE `RelatedTerms` SET `id` = ?, `related_term_count` = ?, `related_terms_list` = ? WHERE 1;

--
-- DELETE template for table `RelatedTerms`
--
DELETE FROM `RelatedTerms` WHERE 0;

