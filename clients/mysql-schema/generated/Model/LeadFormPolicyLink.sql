--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadFormPolicyLink' definition.
--


--
-- SELECT template for table `LeadFormPolicyLink`
--
SELECT `label`, `link` FROM `LeadFormPolicyLink` WHERE 1;

--
-- INSERT template for table `LeadFormPolicyLink`
--
INSERT INTO `LeadFormPolicyLink`(`label`, `link`) VALUES (?, ?);

--
-- UPDATE template for table `LeadFormPolicyLink`
--
UPDATE `LeadFormPolicyLink` SET `label` = ?, `link` = ? WHERE 1;

--
-- DELETE template for table `LeadFormPolicyLink`
--
DELETE FROM `LeadFormPolicyLink` WHERE 0;

