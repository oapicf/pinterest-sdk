--
-- Pinterest REST API.
-- Prepared SQL queries for 'AppsflyerAudience' definition.
--


--
-- SELECT template for table `AppsflyerAudience`
--
SELECT `container_id`, `name`, `platform` FROM `AppsflyerAudience` WHERE 1;

--
-- INSERT template for table `AppsflyerAudience`
--
INSERT INTO `AppsflyerAudience`(`container_id`, `name`, `platform`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AppsflyerAudience`
--
UPDATE `AppsflyerAudience` SET `container_id` = ?, `name` = ?, `platform` = ? WHERE 1;

--
-- DELETE template for table `AppsflyerAudience`
--
DELETE FROM `AppsflyerAudience` WHERE 0;

