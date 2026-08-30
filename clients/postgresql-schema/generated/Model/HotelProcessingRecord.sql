--
-- "Pinterest REST API"
-- Prepared SQL queries for 'HotelProcessingRecord' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'hotel_processing_record'
--
SELECT errors, hotel_id, status, warnings FROM hotel_processing_record WHERE 1=1;

--
-- INSERT template for table 'hotel_processing_record'
--
INSERT INTO hotel_processing_record (errors, hotel_id, status, warnings) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'hotel_processing_record'
--
UPDATE hotel_processing_record SET errors = ?, hotel_id = ?, status = ?, warnings = ? WHERE 1=2;

--
-- DELETE template for table 'hotel_processing_record'
--
DELETE FROM hotel_processing_record WHERE 1=2;

