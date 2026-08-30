--
-- "Pinterest REST API"
-- Prepared SQL queries for 'Exception' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'exception'
--
SELECT code, message FROM "exception" WHERE 1=1;

--
-- INSERT template for table 'exception'
--
INSERT INTO "exception" (code, message) VALUES (?, ?);

--
-- UPDATE template for table 'exception'
--
UPDATE "exception" SET code = ?, message = ? WHERE 1=2;

--
-- DELETE template for table 'exception'
--
DELETE FROM "exception" WHERE 1=2;

