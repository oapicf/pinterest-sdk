--
-- Pinterest REST API.
-- Prepared SQL queries for 'DeletePartnersResponse' definition.
--


--
-- SELECT template for table `DeletePartnersResponse`
--
SELECT `deleted_partners` FROM `DeletePartnersResponse` WHERE 1;

--
-- INSERT template for table `DeletePartnersResponse`
--
INSERT INTO `DeletePartnersResponse`(`deleted_partners`) VALUES (?);

--
-- UPDATE template for table `DeletePartnersResponse`
--
UPDATE `DeletePartnersResponse` SET `deleted_partners` = ? WHERE 1;

--
-- DELETE template for table `DeletePartnersResponse`
--
DELETE FROM `DeletePartnersResponse` WHERE 0;

