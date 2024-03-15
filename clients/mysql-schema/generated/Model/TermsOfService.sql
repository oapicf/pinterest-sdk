--
-- Pinterest REST API.
-- Prepared SQL queries for 'TermsOfService' definition.
--


--
-- SELECT template for table `TermsOfService`
--
SELECT `id`, `html`, `has_accepted`, `ad_account_id` FROM `TermsOfService` WHERE 1;

--
-- INSERT template for table `TermsOfService`
--
INSERT INTO `TermsOfService`(`id`, `html`, `has_accepted`, `ad_account_id`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `TermsOfService`
--
UPDATE `TermsOfService` SET `id` = ?, `html` = ?, `has_accepted` = ?, `ad_account_id` = ? WHERE 1;

--
-- DELETE template for table `TermsOfService`
--
DELETE FROM `TermsOfService` WHERE 0;

