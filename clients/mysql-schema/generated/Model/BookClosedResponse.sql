--
-- Pinterest REST API.
-- Prepared SQL queries for 'BookClosedResponse' definition.
--


--
-- SELECT template for table `BookClosedResponse`
--
SELECT `conversion_metrics_ready`, `non_conversion_metrics_ready` FROM `BookClosedResponse` WHERE 1;

--
-- INSERT template for table `BookClosedResponse`
--
INSERT INTO `BookClosedResponse`(`conversion_metrics_ready`, `non_conversion_metrics_ready`) VALUES (?, ?);

--
-- UPDATE template for table `BookClosedResponse`
--
UPDATE `BookClosedResponse` SET `conversion_metrics_ready` = ?, `non_conversion_metrics_ready` = ? WHERE 1;

--
-- DELETE template for table `BookClosedResponse`
--
DELETE FROM `BookClosedResponse` WHERE 0;

