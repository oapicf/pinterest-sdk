--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdsCreditRedeemResponse' definition.
--


--
-- SELECT template for table `AdsCreditRedeemResponse`
--
SELECT `errorCode`, `errorMessage`, `success` FROM `AdsCreditRedeemResponse` WHERE 1;

--
-- INSERT template for table `AdsCreditRedeemResponse`
--
INSERT INTO `AdsCreditRedeemResponse`(`errorCode`, `errorMessage`, `success`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdsCreditRedeemResponse`
--
UPDATE `AdsCreditRedeemResponse` SET `errorCode` = ?, `errorMessage` = ?, `success` = ? WHERE 1;

--
-- DELETE template for table `AdsCreditRedeemResponse`
--
DELETE FROM `AdsCreditRedeemResponse` WHERE 0;

