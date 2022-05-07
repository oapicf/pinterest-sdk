--
-- Pinterest REST API.
-- Prepared SQL queries for 'MinPriceFilter' definition.
--


--
-- SELECT template for table `MinPriceFilter`
--
SELECT `MIN_PRICE` FROM `MinPriceFilter` WHERE 1;

--
-- INSERT template for table `MinPriceFilter`
--
INSERT INTO `MinPriceFilter`(`MIN_PRICE`) VALUES (?);

--
-- UPDATE template for table `MinPriceFilter`
--
UPDATE `MinPriceFilter` SET `MIN_PRICE` = ? WHERE 1;

--
-- DELETE template for table `MinPriceFilter`
--
DELETE FROM `MinPriceFilter` WHERE 0;

