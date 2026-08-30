--
-- Pinterest REST API.
-- Prepared SQL queries for 'PriceFilterPrice' definition.
--


--
-- SELECT template for table `PriceFilterPrice`
--
SELECT `currency`, `negated`, `operator`, `value` FROM `PriceFilterPrice` WHERE 1;

--
-- INSERT template for table `PriceFilterPrice`
--
INSERT INTO `PriceFilterPrice`(`currency`, `negated`, `operator`, `value`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PriceFilterPrice`
--
UPDATE `PriceFilterPrice` SET `currency` = ?, `negated` = ?, `operator` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `PriceFilterPrice`
--
DELETE FROM `PriceFilterPrice` WHERE 0;

