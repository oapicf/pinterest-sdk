--
-- Pinterest REST API.
-- Prepared SQL queries for 'search_partner_pins_200_response' definition.
--


--
-- SELECT template for table `search_partner_pins_200_response`
--
SELECT `bookmark`, `items` FROM `search_partner_pins_200_response` WHERE 1;

--
-- INSERT template for table `search_partner_pins_200_response`
--
INSERT INTO `search_partner_pins_200_response`(`bookmark`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `search_partner_pins_200_response`
--
UPDATE `search_partner_pins_200_response` SET `bookmark` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `search_partner_pins_200_response`
--
DELETE FROM `search_partner_pins_200_response` WHERE 0;

