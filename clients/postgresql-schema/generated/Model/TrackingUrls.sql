--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TrackingUrls' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'tracking_urls'
--
SELECT audience_verification, buyable_button, click, engagement, impression FROM tracking_urls WHERE 1=1;

--
-- INSERT template for table 'tracking_urls'
--
INSERT INTO tracking_urls (audience_verification, buyable_button, click, engagement, impression) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'tracking_urls'
--
UPDATE tracking_urls SET audience_verification = ?, buyable_button = ?, click = ?, engagement = ?, impression = ? WHERE 1=2;

--
-- DELETE template for table 'tracking_urls'
--
DELETE FROM tracking_urls WHERE 1=2;

