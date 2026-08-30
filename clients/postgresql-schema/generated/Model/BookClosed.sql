--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BookClosed' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'book_closed'
--
SELECT conversion_metrics_ready, non_conversion_metrics_ready FROM book_closed WHERE 1=1;

--
-- INSERT template for table 'book_closed'
--
INSERT INTO book_closed (conversion_metrics_ready, non_conversion_metrics_ready) VALUES (?, ?);

--
-- UPDATE template for table 'book_closed'
--
UPDATE book_closed SET conversion_metrics_ready = ?, non_conversion_metrics_ready = ? WHERE 1=2;

--
-- DELETE template for table 'book_closed'
--
DELETE FROM book_closed WHERE 1=2;

