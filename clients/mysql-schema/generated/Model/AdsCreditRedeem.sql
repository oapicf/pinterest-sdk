--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdsCreditRedeem' definition.
--


--
-- SELECT template for table `AdsCreditRedeem`
--
SELECT `errorCode`, `errorMessage`, `success` FROM `AdsCreditRedeem` WHERE 1;

--
-- INSERT template for table `AdsCreditRedeem`
--
INSERT INTO `AdsCreditRedeem`(`errorCode`, `errorMessage`, `success`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdsCreditRedeem`
--
UPDATE `AdsCreditRedeem` SET `errorCode` = ?, `errorMessage` = ?, `success` = ? WHERE 1;

--
-- DELETE template for table `AdsCreditRedeem`
--
DELETE FROM `AdsCreditRedeem` WHERE 0;

