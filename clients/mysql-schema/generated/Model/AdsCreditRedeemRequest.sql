--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdsCreditRedeemRequest' definition.
--


--
-- SELECT template for table `AdsCreditRedeemRequest`
--
SELECT `offerCodeHash`, `validateOnly` FROM `AdsCreditRedeemRequest` WHERE 1;

--
-- INSERT template for table `AdsCreditRedeemRequest`
--
INSERT INTO `AdsCreditRedeemRequest`(`offerCodeHash`, `validateOnly`) VALUES (?, ?);

--
-- UPDATE template for table `AdsCreditRedeemRequest`
--
UPDATE `AdsCreditRedeemRequest` SET `offerCodeHash` = ?, `validateOnly` = ? WHERE 1;

--
-- DELETE template for table `AdsCreditRedeemRequest`
--
DELETE FROM `AdsCreditRedeemRequest` WHERE 0;

