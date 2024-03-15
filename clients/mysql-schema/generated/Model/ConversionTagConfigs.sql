--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionTagConfigs' definition.
--


--
-- SELECT template for table `ConversionTagConfigs`
--
SELECT `aem_enabled`, `md_frequency`, `aem_fnln_enabled`, `aem_ph_enabled`, `aem_ge_enabled`, `aem_db_enabled`, `aem_loc_enabled` FROM `ConversionTagConfigs` WHERE 1;

--
-- INSERT template for table `ConversionTagConfigs`
--
INSERT INTO `ConversionTagConfigs`(`aem_enabled`, `md_frequency`, `aem_fnln_enabled`, `aem_ph_enabled`, `aem_ge_enabled`, `aem_db_enabled`, `aem_loc_enabled`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionTagConfigs`
--
UPDATE `ConversionTagConfigs` SET `aem_enabled` = ?, `md_frequency` = ?, `aem_fnln_enabled` = ?, `aem_ph_enabled` = ?, `aem_ge_enabled` = ?, `aem_db_enabled` = ?, `aem_loc_enabled` = ? WHERE 1;

--
-- DELETE template for table `ConversionTagConfigs`
--
DELETE FROM `ConversionTagConfigs` WHERE 0;

