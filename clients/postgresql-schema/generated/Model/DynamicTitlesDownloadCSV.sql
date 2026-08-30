--
-- "Pinterest REST API"
-- Prepared SQL queries for 'DynamicTitlesDownloadCSV' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'dynamic_titles_download_csv'
--
SELECT download_url FROM dynamic_titles_download_csv WHERE 1=1;

--
-- INSERT template for table 'dynamic_titles_download_csv'
--
INSERT INTO dynamic_titles_download_csv (download_url) VALUES (?);

--
-- UPDATE template for table 'dynamic_titles_download_csv'
--
UPDATE dynamic_titles_download_csv SET download_url = ? WHERE 1=2;

--
-- DELETE template for table 'dynamic_titles_download_csv'
--
DELETE FROM dynamic_titles_download_csv WHERE 1=2;

