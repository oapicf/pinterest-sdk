--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOAccountAddress' definition.
--


--
-- SELECT template for table `SSIOAccountAddress`
--
SELECT `address_id`, `display`, `order_legal_entity`, `purpose` FROM `SSIOAccountAddress` WHERE 1;

--
-- INSERT template for table `SSIOAccountAddress`
--
INSERT INTO `SSIOAccountAddress`(`address_id`, `display`, `order_legal_entity`, `purpose`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `SSIOAccountAddress`
--
UPDATE `SSIOAccountAddress` SET `address_id` = ?, `display` = ?, `order_legal_entity` = ?, `purpose` = ? WHERE 1;

--
-- DELETE template for table `SSIOAccountAddress`
--
DELETE FROM `SSIOAccountAddress` WHERE 0;

