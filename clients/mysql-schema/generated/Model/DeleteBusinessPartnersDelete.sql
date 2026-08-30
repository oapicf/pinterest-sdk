--
-- Pinterest REST API.
-- Prepared SQL queries for 'DeleteBusinessPartnersDelete' definition.
--


--
-- SELECT template for table `DeleteBusinessPartnersDelete`
--
SELECT `partner_ids`, `partner_type` FROM `DeleteBusinessPartnersDelete` WHERE 1;

--
-- INSERT template for table `DeleteBusinessPartnersDelete`
--
INSERT INTO `DeleteBusinessPartnersDelete`(`partner_ids`, `partner_type`) VALUES (?, ?);

--
-- UPDATE template for table `DeleteBusinessPartnersDelete`
--
UPDATE `DeleteBusinessPartnersDelete` SET `partner_ids` = ?, `partner_type` = ? WHERE 1;

--
-- DELETE template for table `DeleteBusinessPartnersDelete`
--
DELETE FROM `DeleteBusinessPartnersDelete` WHERE 0;

