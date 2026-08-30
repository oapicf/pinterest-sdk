--
-- "Pinterest REST API"
-- Prepared SQL queries for 'SchedulePlacementMultipliers' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'schedule_placement_multipliers'
--
SELECT browse, related_pins, "search" FROM schedule_placement_multipliers WHERE 1=1;

--
-- INSERT template for table 'schedule_placement_multipliers'
--
INSERT INTO schedule_placement_multipliers (browse, related_pins, "search") VALUES (?, ?, ?);

--
-- UPDATE template for table 'schedule_placement_multipliers'
--
UPDATE schedule_placement_multipliers SET browse = ?, related_pins = ?, "search" = ? WHERE 1=2;

--
-- DELETE template for table 'schedule_placement_multipliers'
--
DELETE FROM schedule_placement_multipliers WHERE 1=2;

