--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOAccountItem' definition.
--


--
-- SELECT template for table `SSIOAccountItem`
--
SELECT `id`, `io_terms_id`, `io_terms`, `us_terms_id`, `us_terms`, `row_terms_id`, `row_terms`, `io_type`, `addresses` FROM `SSIOAccountItem` WHERE 1;

--
-- INSERT template for table `SSIOAccountItem`
--
INSERT INTO `SSIOAccountItem`(`id`, `io_terms_id`, `io_terms`, `us_terms_id`, `us_terms`, `row_terms_id`, `row_terms`, `io_type`, `addresses`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SSIOAccountItem`
--
UPDATE `SSIOAccountItem` SET `id` = ?, `io_terms_id` = ?, `io_terms` = ?, `us_terms_id` = ?, `us_terms` = ?, `row_terms_id` = ?, `row_terms` = ?, `io_type` = ?, `addresses` = ? WHERE 1;

--
-- DELETE template for table `SSIOAccountItem`
--
DELETE FROM `SSIOAccountItem` WHERE 0;

