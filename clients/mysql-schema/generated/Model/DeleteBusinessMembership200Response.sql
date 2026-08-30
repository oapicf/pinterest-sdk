--
-- Pinterest REST API.
-- Prepared SQL queries for 'delete_business_membership_200_response' definition.
--


--
-- SELECT template for table `delete_business_membership_200_response`
--
SELECT `deleted_members` FROM `delete_business_membership_200_response` WHERE 1;

--
-- INSERT template for table `delete_business_membership_200_response`
--
INSERT INTO `delete_business_membership_200_response`(`deleted_members`) VALUES (?);

--
-- UPDATE template for table `delete_business_membership_200_response`
--
UPDATE `delete_business_membership_200_response` SET `deleted_members` = ? WHERE 1;

--
-- DELETE template for table `delete_business_membership_200_response`
--
DELETE FROM `delete_business_membership_200_response` WHERE 0;

