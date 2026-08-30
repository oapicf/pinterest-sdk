--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TargetingTemplateAudienceSizing' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'targeting_template_audience_sizing'
--
SELECT reach_estimate FROM targeting_template_audience_sizing WHERE 1=1;

--
-- INSERT template for table 'targeting_template_audience_sizing'
--
INSERT INTO targeting_template_audience_sizing (reach_estimate) VALUES (?);

--
-- UPDATE template for table 'targeting_template_audience_sizing'
--
UPDATE targeting_template_audience_sizing SET reach_estimate = ? WHERE 1=2;

--
-- DELETE template for table 'targeting_template_audience_sizing'
--
DELETE FROM targeting_template_audience_sizing WHERE 1=2;

