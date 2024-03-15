--
-- Pinterest REST API.
-- Prepared SQL queries for 'RelatedTerms_related_terms_list_inner' definition.
--


--
-- SELECT template for table `RelatedTerms_related_terms_list_inner`
--
SELECT `term`, `related_terms` FROM `RelatedTerms_related_terms_list_inner` WHERE 1;

--
-- INSERT template for table `RelatedTerms_related_terms_list_inner`
--
INSERT INTO `RelatedTerms_related_terms_list_inner`(`term`, `related_terms`) VALUES (?, ?);

--
-- UPDATE template for table `RelatedTerms_related_terms_list_inner`
--
UPDATE `RelatedTerms_related_terms_list_inner` SET `term` = ?, `related_terms` = ? WHERE 1;

--
-- DELETE template for table `RelatedTerms_related_terms_list_inner`
--
DELETE FROM `RelatedTerms_related_terms_list_inner` WHERE 0;

