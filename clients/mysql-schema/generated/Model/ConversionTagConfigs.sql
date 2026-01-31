--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionTagConfigs' definition.
--


--
-- SELECT template for table `ConversionTagConfigs`
--
SELECT `aem_db_enabled`, `aem_enabled`, `aem_external_id_enabled`, `aem_fnln_enabled`, `aem_ge_enabled`, `aem_loc_enabled`, `aem_ph_enabled`, `md_frequency`, `no_code_capi_domains` FROM `ConversionTagConfigs` WHERE 1;

--
-- INSERT template for table `ConversionTagConfigs`
--
INSERT INTO `ConversionTagConfigs`(`aem_db_enabled`, `aem_enabled`, `aem_external_id_enabled`, `aem_fnln_enabled`, `aem_ge_enabled`, `aem_loc_enabled`, `aem_ph_enabled`, `md_frequency`, `no_code_capi_domains`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionTagConfigs`
--
UPDATE `ConversionTagConfigs` SET `aem_db_enabled` = ?, `aem_enabled` = ?, `aem_external_id_enabled` = ?, `aem_fnln_enabled` = ?, `aem_ge_enabled` = ?, `aem_loc_enabled` = ?, `aem_ph_enabled` = ?, `md_frequency` = ?, `no_code_capi_domains` = ? WHERE 1;

--
-- DELETE template for table `ConversionTagConfigs`
--
DELETE FROM `ConversionTagConfigs` WHERE 0;

