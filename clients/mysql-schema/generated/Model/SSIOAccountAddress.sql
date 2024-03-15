--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOAccountAddress' definition.
--


--
-- SELECT template for table `SSIOAccountAddress`
--
SELECT `display`, `purpose`, `address_id`, `order_legal_entity` FROM `SSIOAccountAddress` WHERE 1;

--
-- INSERT template for table `SSIOAccountAddress`
--
INSERT INTO `SSIOAccountAddress`(`display`, `purpose`, `address_id`, `order_legal_entity`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `SSIOAccountAddress`
--
UPDATE `SSIOAccountAddress` SET `display` = ?, `purpose` = ?, `address_id` = ?, `order_legal_entity` = ? WHERE 1;

--
-- DELETE template for table `SSIOAccountAddress`
--
DELETE FROM `SSIOAccountAddress` WHERE 0;

