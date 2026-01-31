--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOAccountItem' definition.
--


--
-- SELECT template for table `SSIOAccountItem`
--
SELECT `addresses`, `id`, `io_terms`, `io_terms_id`, `io_type`, `row_terms`, `row_terms_id`, `us_terms`, `us_terms_id` FROM `SSIOAccountItem` WHERE 1;

--
-- INSERT template for table `SSIOAccountItem`
--
INSERT INTO `SSIOAccountItem`(`addresses`, `id`, `io_terms`, `io_terms_id`, `io_type`, `row_terms`, `row_terms_id`, `us_terms`, `us_terms_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SSIOAccountItem`
--
UPDATE `SSIOAccountItem` SET `addresses` = ?, `id` = ?, `io_terms` = ?, `io_terms_id` = ?, `io_type` = ?, `row_terms` = ?, `row_terms_id` = ?, `us_terms` = ?, `us_terms_id` = ? WHERE 1;

--
-- DELETE template for table `SSIOAccountItem`
--
DELETE FROM `SSIOAccountItem` WHERE 0;

