--
-- Pinterest REST API.
-- Prepared SQL queries for 'billing_profiles_get_200_response' definition.
--


--
-- SELECT template for table `billing_profiles_get_200_response`
--
SELECT `items`, `bookmark` FROM `billing_profiles_get_200_response` WHERE 1;

--
-- INSERT template for table `billing_profiles_get_200_response`
--
INSERT INTO `billing_profiles_get_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `billing_profiles_get_200_response`
--
UPDATE `billing_profiles_get_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `billing_profiles_get_200_response`
--
DELETE FROM `billing_profiles_get_200_response` WHERE 0;

