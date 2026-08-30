--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LabelsResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'labels_response'
--
SELECT errors, labels FROM labels_response WHERE 1=1;

--
-- INSERT template for table 'labels_response'
--
INSERT INTO labels_response (errors, labels) VALUES (?, ?);

--
-- UPDATE template for table 'labels_response'
--
UPDATE labels_response SET errors = ?, labels = ? WHERE 1=2;

--
-- DELETE template for table 'labels_response'
--
DELETE FROM labels_response WHERE 1=2;

