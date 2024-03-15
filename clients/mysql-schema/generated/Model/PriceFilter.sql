--
-- Pinterest REST API.
-- Prepared SQL queries for 'PriceFilter' definition.
--


--
-- SELECT template for table `PriceFilter`
--
SELECT `PRICE` FROM `PriceFilter` WHERE 1;

--
-- INSERT template for table `PriceFilter`
--
INSERT INTO `PriceFilter`(`PRICE`) VALUES (?);

--
-- UPDATE template for table `PriceFilter`
--
UPDATE `PriceFilter` SET `PRICE` = ? WHERE 1;

--
-- DELETE template for table `PriceFilter`
--
DELETE FROM `PriceFilter` WHERE 0;

