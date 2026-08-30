--
-- Pinterest REST API.
-- Prepared SQL queries for 'CustomerListRecordRow' definition.
--


--
-- SELECT template for table `CustomerListRecordRow`
--
SELECT `email`, `external_id`, `hashed_phone_number`, `hashed_pinner_id`, `ip_address`, `liveramp_envelope`, `maid`, `user_agent` FROM `CustomerListRecordRow` WHERE 1;

--
-- INSERT template for table `CustomerListRecordRow`
--
INSERT INTO `CustomerListRecordRow`(`email`, `external_id`, `hashed_phone_number`, `hashed_pinner_id`, `ip_address`, `liveramp_envelope`, `maid`, `user_agent`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CustomerListRecordRow`
--
UPDATE `CustomerListRecordRow` SET `email` = ?, `external_id` = ?, `hashed_phone_number` = ?, `hashed_pinner_id` = ?, `ip_address` = ?, `liveramp_envelope` = ?, `maid` = ?, `user_agent` = ? WHERE 1;

--
-- DELETE template for table `CustomerListRecordRow`
--
DELETE FROM `CustomerListRecordRow` WHERE 0;

