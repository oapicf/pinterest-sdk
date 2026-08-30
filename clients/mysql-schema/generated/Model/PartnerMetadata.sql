--
-- Pinterest REST API.
-- Prepared SQL queries for 'PartnerMetadata' definition.
--


--
-- SELECT template for table `PartnerMetadata`
--
SELECT `subscriber_key` FROM `PartnerMetadata` WHERE 1;

--
-- INSERT template for table `PartnerMetadata`
--
INSERT INTO `PartnerMetadata`(`subscriber_key`) VALUES (?);

--
-- UPDATE template for table `PartnerMetadata`
--
UPDATE `PartnerMetadata` SET `subscriber_key` = ? WHERE 1;

--
-- DELETE template for table `PartnerMetadata`
--
DELETE FROM `PartnerMetadata` WHERE 0;

