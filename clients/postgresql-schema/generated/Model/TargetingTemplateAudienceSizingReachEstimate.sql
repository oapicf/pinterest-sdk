--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TargetingTemplateAudienceSizingReachEstimate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'targeting_template_audience_sizing_reach_estimate'
--
SELECT estimate, lower_bound, upper_bound FROM targeting_template_audience_sizing_reach_estimate WHERE 1=1;

--
-- INSERT template for table 'targeting_template_audience_sizing_reach_estimate'
--
INSERT INTO targeting_template_audience_sizing_reach_estimate (estimate, lower_bound, upper_bound) VALUES (?, ?, ?);

--
-- UPDATE template for table 'targeting_template_audience_sizing_reach_estimate'
--
UPDATE targeting_template_audience_sizing_reach_estimate SET estimate = ?, lower_bound = ?, upper_bound = ? WHERE 1=2;

--
-- DELETE template for table 'targeting_template_audience_sizing_reach_estimate'
--
DELETE FROM targeting_template_audience_sizing_reach_estimate WHERE 1=2;

