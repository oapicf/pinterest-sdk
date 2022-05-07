--
-- Pinterest REST API.
-- Prepared SQL queries for 'CurrencyFilter' definition.
--


--
-- SELECT template for table `CurrencyFilter`
--
SELECT `CURRENCY` FROM `CurrencyFilter` WHERE 1;

--
-- INSERT template for table `CurrencyFilter`
--
INSERT INTO `CurrencyFilter`(`CURRENCY`) VALUES (?);

--
-- UPDATE template for table `CurrencyFilter`
--
UPDATE `CurrencyFilter` SET `CURRENCY` = ? WHERE 1;

--
-- DELETE template for table `CurrencyFilter`
--
DELETE FROM `CurrencyFilter` WHERE 0;

