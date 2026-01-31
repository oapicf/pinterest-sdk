--
-- Pinterest REST API.
-- Prepared SQL queries for 'TermsOfService' definition.
--


--
-- SELECT template for table `TermsOfService`
--
SELECT `ad_account_id`, `has_accepted`, `html`, `id` FROM `TermsOfService` WHERE 1;

--
-- INSERT template for table `TermsOfService`
--
INSERT INTO `TermsOfService`(`ad_account_id`, `has_accepted`, `html`, `id`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `TermsOfService`
--
UPDATE `TermsOfService` SET `ad_account_id` = ?, `has_accepted` = ?, `html` = ?, `id` = ? WHERE 1;

--
-- DELETE template for table `TermsOfService`
--
DELETE FROM `TermsOfService` WHERE 0;

