--
-- "Pinterest REST API"
-- Prepared SQL queries for 'Label' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'label'
--
SELECT "id", label_type, status, "value" FROM "label" WHERE 1=1;

--
-- INSERT template for table 'label'
--
INSERT INTO "label" ("id", label_type, status, "value") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'label'
--
UPDATE "label" SET "id" = ?, label_type = ?, status = ?, "value" = ? WHERE 1=2;

--
-- DELETE template for table 'label'
--
DELETE FROM "label" WHERE 1=2;

