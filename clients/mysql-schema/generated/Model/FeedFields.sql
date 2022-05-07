--
-- Pinterest REST API.
-- Prepared SQL queries for 'feed_fields' definition.
--


--
-- SELECT template for table `feed_fields`
--
SELECT `default_country`, `default_availability`, `default_currency`, `name`, `format`, `default_locale`, `credentials`, `location`, `preferred_processing_schedule`, `status` FROM `feed_fields` WHERE 1;

--
-- INSERT template for table `feed_fields`
--
INSERT INTO `feed_fields`(`default_country`, `default_availability`, `default_currency`, `name`, `format`, `default_locale`, `credentials`, `location`, `preferred_processing_schedule`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `feed_fields`
--
UPDATE `feed_fields` SET `default_country` = ?, `default_availability` = ?, `default_currency` = ?, `name` = ?, `format` = ?, `default_locale` = ?, `credentials` = ?, `location` = ?, `preferred_processing_schedule` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `feed_fields`
--
DELETE FROM `feed_fields` WHERE 0;

