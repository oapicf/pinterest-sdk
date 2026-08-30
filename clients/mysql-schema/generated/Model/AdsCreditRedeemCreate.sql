--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdsCreditRedeemCreate' definition.
--


--
-- SELECT template for table `AdsCreditRedeemCreate`
--
SELECT `offerCodeHash`, `validateOnly` FROM `AdsCreditRedeemCreate` WHERE 1;

--
-- INSERT template for table `AdsCreditRedeemCreate`
--
INSERT INTO `AdsCreditRedeemCreate`(`offerCodeHash`, `validateOnly`) VALUES (?, ?);

--
-- UPDATE template for table `AdsCreditRedeemCreate`
--
UPDATE `AdsCreditRedeemCreate` SET `offerCodeHash` = ?, `validateOnly` = ? WHERE 1;

--
-- DELETE template for table `AdsCreditRedeemCreate`
--
DELETE FROM `AdsCreditRedeemCreate` WHERE 0;

