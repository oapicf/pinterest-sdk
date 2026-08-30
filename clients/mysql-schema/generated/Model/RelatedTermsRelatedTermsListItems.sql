--
-- Pinterest REST API.
-- Prepared SQL queries for 'RelatedTermsRelatedTermsListItems' definition.
--


--
-- SELECT template for table `RelatedTermsRelatedTermsListItems`
--
SELECT `related_terms`, `term` FROM `RelatedTermsRelatedTermsListItems` WHERE 1;

--
-- INSERT template for table `RelatedTermsRelatedTermsListItems`
--
INSERT INTO `RelatedTermsRelatedTermsListItems`(`related_terms`, `term`) VALUES (?, ?);

--
-- UPDATE template for table `RelatedTermsRelatedTermsListItems`
--
UPDATE `RelatedTermsRelatedTermsListItems` SET `related_terms` = ?, `term` = ? WHERE 1;

--
-- DELETE template for table `RelatedTermsRelatedTermsListItems`
--
DELETE FROM `RelatedTermsRelatedTermsListItems` WHERE 0;

