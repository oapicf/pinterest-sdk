--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AppsflyerAudienceSyncCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'appsflyer_audience_sync_create'
--
SELECT container_id, url_adid_sha256, url_email_sha256 FROM appsflyer_audience_sync_create WHERE 1=1;

--
-- INSERT template for table 'appsflyer_audience_sync_create'
--
INSERT INTO appsflyer_audience_sync_create (container_id, url_adid_sha256, url_email_sha256) VALUES (?, ?, ?);

--
-- UPDATE template for table 'appsflyer_audience_sync_create'
--
UPDATE appsflyer_audience_sync_create SET container_id = ?, url_adid_sha256 = ?, url_email_sha256 = ? WHERE 1=2;

--
-- DELETE template for table 'appsflyer_audience_sync_create'
--
DELETE FROM appsflyer_audience_sync_create WHERE 1=2;

