--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionTagCreate' definition.
--


--
-- SELECT template for table `ConversionTagCreate`
--
SELECT `aem_db_enabled`, `aem_enabled`, `aem_external_id_enabled`, `aem_fnln_enabled`, `aem_ge_enabled`, `aem_loc_enabled`, `aem_ph_enabled`, `md_frequency`, `name` FROM `ConversionTagCreate` WHERE 1;

--
-- INSERT template for table `ConversionTagCreate`
--
INSERT INTO `ConversionTagCreate`(`aem_db_enabled`, `aem_enabled`, `aem_external_id_enabled`, `aem_fnln_enabled`, `aem_ge_enabled`, `aem_loc_enabled`, `aem_ph_enabled`, `md_frequency`, `name`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionTagCreate`
--
UPDATE `ConversionTagCreate` SET `aem_db_enabled` = ?, `aem_enabled` = ?, `aem_external_id_enabled` = ?, `aem_fnln_enabled` = ?, `aem_ge_enabled` = ?, `aem_loc_enabled` = ?, `aem_ph_enabled` = ?, `md_frequency` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `ConversionTagCreate`
--
DELETE FROM `ConversionTagCreate` WHERE 0;

