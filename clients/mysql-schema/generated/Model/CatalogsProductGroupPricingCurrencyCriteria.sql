--
-- Pinterest REST API.
-- Prepared SQL queries for 'catalogs_product_group_pricing_currency_criteria' definition.
--


--
-- SELECT template for table `catalogs_product_group_pricing_currency_criteria`
--
SELECT `operator`, `value`, `currency`, `negated` FROM `catalogs_product_group_pricing_currency_criteria` WHERE 1;

--
-- INSERT template for table `catalogs_product_group_pricing_currency_criteria`
--
INSERT INTO `catalogs_product_group_pricing_currency_criteria`(`operator`, `value`, `currency`, `negated`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `catalogs_product_group_pricing_currency_criteria`
--
UPDATE `catalogs_product_group_pricing_currency_criteria` SET `operator` = ?, `value` = ?, `currency` = ?, `negated` = ? WHERE 1;

--
-- DELETE template for table `catalogs_product_group_pricing_currency_criteria`
--
DELETE FROM `catalogs_product_group_pricing_currency_criteria` WHERE 0;

