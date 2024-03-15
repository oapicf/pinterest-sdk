--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdsCreditRedeemResponse' definition.
--


--
-- SELECT template for table `AdsCreditRedeemResponse`
--
SELECT `success`, `errorCode`, `errorMessage` FROM `AdsCreditRedeemResponse` WHERE 1;

--
-- INSERT template for table `AdsCreditRedeemResponse`
--
INSERT INTO `AdsCreditRedeemResponse`(`success`, `errorCode`, `errorMessage`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdsCreditRedeemResponse`
--
UPDATE `AdsCreditRedeemResponse` SET `success` = ?, `errorCode` = ?, `errorMessage` = ? WHERE 1;

--
-- DELETE template for table `AdsCreditRedeemResponse`
--
DELETE FROM `AdsCreditRedeemResponse` WHERE 0;

