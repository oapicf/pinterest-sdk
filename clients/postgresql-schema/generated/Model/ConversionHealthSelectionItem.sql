--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionHealthSelectionItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_health_selection_item'
--
SELECT conversion_type, criteria, ingestion_source, status FROM conversion_health_selection_item WHERE 1=1;

--
-- INSERT template for table 'conversion_health_selection_item'
--
INSERT INTO conversion_health_selection_item (conversion_type, criteria, ingestion_source, status) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'conversion_health_selection_item'
--
UPDATE conversion_health_selection_item SET conversion_type = ?, criteria = ?, ingestion_source = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_health_selection_item'
--
DELETE FROM conversion_health_selection_item WHERE 1=2;

