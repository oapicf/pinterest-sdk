--
-- Pinterest REST API.
-- Prepared SQL queries for 'ErrorDetail' definition.
--


--
-- SELECT template for table `ErrorDetail`
--
SELECT `count`, `error_code`, `message` FROM `ErrorDetail` WHERE 1;

--
-- INSERT template for table `ErrorDetail`
--
INSERT INTO `ErrorDetail`(`count`, `error_code`, `message`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ErrorDetail`
--
UPDATE `ErrorDetail` SET `count` = ?, `error_code` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `ErrorDetail`
--
DELETE FROM `ErrorDetail` WHERE 0;

