--
-- Pinterest REST API.
-- Prepared SQL queries for 'AppsflyerAudienceCreate' definition.
--


--
-- SELECT template for table `AppsflyerAudienceCreate`
--
SELECT `name`, `platform` FROM `AppsflyerAudienceCreate` WHERE 1;

--
-- INSERT template for table `AppsflyerAudienceCreate`
--
INSERT INTO `AppsflyerAudienceCreate`(`name`, `platform`) VALUES (?, ?);

--
-- UPDATE template for table `AppsflyerAudienceCreate`
--
UPDATE `AppsflyerAudienceCreate` SET `name` = ?, `platform` = ? WHERE 1;

--
-- DELETE template for table `AppsflyerAudienceCreate`
--
DELETE FROM `AppsflyerAudienceCreate` WHERE 0;

