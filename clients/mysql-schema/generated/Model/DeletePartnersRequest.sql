--
-- Pinterest REST API.
-- Prepared SQL queries for 'DeletePartnersRequest' definition.
--


--
-- SELECT template for table `DeletePartnersRequest`
--
SELECT `partner_ids`, `partner_type` FROM `DeletePartnersRequest` WHERE 1;

--
-- INSERT template for table `DeletePartnersRequest`
--
INSERT INTO `DeletePartnersRequest`(`partner_ids`, `partner_type`) VALUES (?, ?);

--
-- UPDATE template for table `DeletePartnersRequest`
--
UPDATE `DeletePartnersRequest` SET `partner_ids` = ?, `partner_type` = ? WHERE 1;

--
-- DELETE template for table `DeletePartnersRequest`
--
DELETE FROM `DeletePartnersRequest` WHERE 0;

