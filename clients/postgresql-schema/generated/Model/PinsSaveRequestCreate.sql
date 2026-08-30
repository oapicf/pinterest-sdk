--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinsSaveRequestCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pins_save_request_create'
--
SELECT board_id, board_section_id FROM pins_save_request_create WHERE 1=1;

--
-- INSERT template for table 'pins_save_request_create'
--
INSERT INTO pins_save_request_create (board_id, board_section_id) VALUES (?, ?);

--
-- UPDATE template for table 'pins_save_request_create'
--
UPDATE pins_save_request_create SET board_id = ?, board_section_id = ? WHERE 1=2;

--
-- DELETE template for table 'pins_save_request_create'
--
DELETE FROM pins_save_request_create WHERE 1=2;

