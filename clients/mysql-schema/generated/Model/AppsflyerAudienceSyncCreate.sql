--
-- Pinterest REST API.
-- Prepared SQL queries for 'AppsflyerAudienceSyncCreate' definition.
--


--
-- SELECT template for table `AppsflyerAudienceSyncCreate`
--
SELECT `container_id`, `url_adid_sha256`, `url_email_sha256` FROM `AppsflyerAudienceSyncCreate` WHERE 1;

--
-- INSERT template for table `AppsflyerAudienceSyncCreate`
--
INSERT INTO `AppsflyerAudienceSyncCreate`(`container_id`, `url_adid_sha256`, `url_email_sha256`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AppsflyerAudienceSyncCreate`
--
UPDATE `AppsflyerAudienceSyncCreate` SET `container_id` = ?, `url_adid_sha256` = ?, `url_email_sha256` = ? WHERE 1;

--
-- DELETE template for table `AppsflyerAudienceSyncCreate`
--
DELETE FROM `AppsflyerAudienceSyncCreate` WHERE 0;

