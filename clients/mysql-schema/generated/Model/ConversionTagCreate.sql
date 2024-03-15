--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionTagCreate' definition.
--


--
-- SELECT template for table `ConversionTagCreate`
--
SELECT `name`, `aem_enabled`, `md_frequency`, `aem_fnln_enabled`, `aem_ph_enabled`, `aem_ge_enabled`, `aem_db_enabled`, `aem_loc_enabled` FROM `ConversionTagCreate` WHERE 1;

--
-- INSERT template for table `ConversionTagCreate`
--
INSERT INTO `ConversionTagCreate`(`name`, `aem_enabled`, `md_frequency`, `aem_fnln_enabled`, `aem_ph_enabled`, `aem_ge_enabled`, `aem_db_enabled`, `aem_loc_enabled`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionTagCreate`
--
UPDATE `ConversionTagCreate` SET `name` = ?, `aem_enabled` = ?, `md_frequency` = ?, `aem_fnln_enabled` = ?, `aem_ph_enabled` = ?, `aem_ge_enabled` = ?, `aem_db_enabled` = ?, `aem_loc_enabled` = ? WHERE 1;

--
-- DELETE template for table `ConversionTagCreate`
--
DELETE FROM `ConversionTagCreate` WHERE 0;

