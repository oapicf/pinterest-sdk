--
-- Pinterest REST API.
-- Prepared SQL queries for 'DeleteBusinessPartners' definition.
--


--
-- SELECT template for table `DeleteBusinessPartners`
--
SELECT `deleted_partners` FROM `DeleteBusinessPartners` WHERE 1;

--
-- INSERT template for table `DeleteBusinessPartners`
--
INSERT INTO `DeleteBusinessPartners`(`deleted_partners`) VALUES (?);

--
-- UPDATE template for table `DeleteBusinessPartners`
--
UPDATE `DeleteBusinessPartners` SET `deleted_partners` = ? WHERE 1;

--
-- DELETE template for table `DeleteBusinessPartners`
--
DELETE FROM `DeleteBusinessPartners` WHERE 0;

