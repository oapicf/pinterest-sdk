--
-- Pinterest REST API.
-- Prepared SQL queries for 'BookClosed' definition.
--


--
-- SELECT template for table `BookClosed`
--
SELECT `conversion_metrics_ready`, `non_conversion_metrics_ready` FROM `BookClosed` WHERE 1;

--
-- INSERT template for table `BookClosed`
--
INSERT INTO `BookClosed`(`conversion_metrics_ready`, `non_conversion_metrics_ready`) VALUES (?, ?);

--
-- UPDATE template for table `BookClosed`
--
UPDATE `BookClosed` SET `conversion_metrics_ready` = ?, `non_conversion_metrics_ready` = ? WHERE 1;

--
-- DELETE template for table `BookClosed`
--
DELETE FROM `BookClosed` WHERE 0;

