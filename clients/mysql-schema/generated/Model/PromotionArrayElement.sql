--
-- Pinterest REST API.
-- Prepared SQL queries for 'PromotionArrayElement' definition.
--


--
-- SELECT template for table `PromotionArrayElement`
--
SELECT `data`, `exception` FROM `PromotionArrayElement` WHERE 1;

--
-- INSERT template for table `PromotionArrayElement`
--
INSERT INTO `PromotionArrayElement`(`data`, `exception`) VALUES (?, ?);

--
-- UPDATE template for table `PromotionArrayElement`
--
UPDATE `PromotionArrayElement` SET `data` = ?, `exception` = ? WHERE 1;

--
-- DELETE template for table `PromotionArrayElement`
--
DELETE FROM `PromotionArrayElement` WHERE 0;

