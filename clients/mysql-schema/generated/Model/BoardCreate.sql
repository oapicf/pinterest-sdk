--
-- Pinterest REST API.
-- Prepared SQL queries for 'BoardCreate' definition.
--


--
-- SELECT template for table `BoardCreate`
--
SELECT `description`, `is_ads_only`, `name`, `privacy` FROM `BoardCreate` WHERE 1;

--
-- INSERT template for table `BoardCreate`
--
INSERT INTO `BoardCreate`(`description`, `is_ads_only`, `name`, `privacy`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `BoardCreate`
--
UPDATE `BoardCreate` SET `description` = ?, `is_ads_only` = ?, `name` = ?, `privacy` = ? WHERE 1;

--
-- DELETE template for table `BoardCreate`
--
DELETE FROM `BoardCreate` WHERE 0;

