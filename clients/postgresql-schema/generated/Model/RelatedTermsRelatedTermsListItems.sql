--
-- "Pinterest REST API"
-- Prepared SQL queries for 'RelatedTermsRelatedTermsListItems' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'related_terms_related_terms_list_items'
--
SELECT related_terms, term FROM related_terms_related_terms_list_items WHERE 1=1;

--
-- INSERT template for table 'related_terms_related_terms_list_items'
--
INSERT INTO related_terms_related_terms_list_items (related_terms, term) VALUES (?, ?);

--
-- UPDATE template for table 'related_terms_related_terms_list_items'
--
UPDATE related_terms_related_terms_list_items SET related_terms = ?, term = ? WHERE 1=2;

--
-- DELETE template for table 'related_terms_related_terms_list_items'
--
DELETE FROM related_terms_related_terms_list_items WHERE 1=2;

