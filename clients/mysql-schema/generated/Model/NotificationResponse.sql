--
-- Pinterest REST API.
-- Prepared SQL queries for 'NotificationResponse' definition.
--


--
-- SELECT template for table `NotificationResponse`
--
SELECT `success`, `received_at`, `error_msg` FROM `NotificationResponse` WHERE 1;

--
-- INSERT template for table `NotificationResponse`
--
INSERT INTO `NotificationResponse`(`success`, `received_at`, `error_msg`) VALUES (?, ?, ?);

--
-- UPDATE template for table `NotificationResponse`
--
UPDATE `NotificationResponse` SET `success` = ?, `received_at` = ?, `error_msg` = ? WHERE 1;

--
-- DELETE template for table `NotificationResponse`
--
DELETE FROM `NotificationResponse` WHERE 0;

