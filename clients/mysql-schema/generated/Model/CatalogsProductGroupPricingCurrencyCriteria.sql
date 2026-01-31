--
-- Pinterest REST API.
-- Prepared SQL queries for 'catalogs_product_group_pricing_currency_criteria' definition.
--


--
-- SELECT template for table `catalogs_product_group_pricing_currency_criteria`
--
SELECT `currency`, `negated`, `operator`, `value` FROM `catalogs_product_group_pricing_currency_criteria` WHERE 1;

--
-- INSERT template for table `catalogs_product_group_pricing_currency_criteria`
--
INSERT INTO `catalogs_product_group_pricing_currency_criteria`(`currency`, `negated`, `operator`, `value`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `catalogs_product_group_pricing_currency_criteria`
--
UPDATE `catalogs_product_group_pricing_currency_criteria` SET `currency` = ?, `negated` = ?, `operator` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `catalogs_product_group_pricing_currency_criteria`
--
DELETE FROM `catalogs_product_group_pricing_currency_criteria` WHERE 0;

