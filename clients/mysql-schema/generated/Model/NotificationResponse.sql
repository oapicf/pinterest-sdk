--
-- Pinterest REST API.
-- Prepared SQL queries for 'NotificationResponse' definition.
--


--
-- SELECT template for table `NotificationResponse`
--
SELECT `error_msg`, `received_at`, `success` FROM `NotificationResponse` WHERE 1;

--
-- INSERT template for table `NotificationResponse`
--
INSERT INTO `NotificationResponse`(`error_msg`, `received_at`, `success`) VALUES (?, ?, ?);

--
-- UPDATE template for table `NotificationResponse`
--
UPDATE `NotificationResponse` SET `error_msg` = ?, `received_at` = ?, `success` = ? WHERE 1;

--
-- DELETE template for table `NotificationResponse`
--
DELETE FROM `NotificationResponse` WHERE 0;

