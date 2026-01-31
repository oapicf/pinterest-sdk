--
-- Pinterest REST API.
-- Prepared SQL queries for 'PromotionTemplateValue' definition.
--


--
-- SELECT template for table `PromotionTemplateValue`
--
SELECT `amount`, `currency_code`, `custom_text`, `percent` FROM `PromotionTemplateValue` WHERE 1;

--
-- INSERT template for table `PromotionTemplateValue`
--
INSERT INTO `PromotionTemplateValue`(`amount`, `currency_code`, `custom_text`, `percent`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PromotionTemplateValue`
--
UPDATE `PromotionTemplateValue` SET `amount` = ?, `currency_code` = ?, `custom_text` = ?, `percent` = ? WHERE 1;

--
-- DELETE template for table `PromotionTemplateValue`
--
DELETE FROM `PromotionTemplateValue` WHERE 0;

