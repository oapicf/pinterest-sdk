--
-- Pinterest REST API.
-- Prepared SQL queries for 'SingleInterestTargetingOptionResponse' definition.
--


--
-- SELECT template for table `SingleInterestTargetingOptionResponse`
--
SELECT `id`, `name`, `child_interests`, `level` FROM `SingleInterestTargetingOptionResponse` WHERE 1;

--
-- INSERT template for table `SingleInterestTargetingOptionResponse`
--
INSERT INTO `SingleInterestTargetingOptionResponse`(`id`, `name`, `child_interests`, `level`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `SingleInterestTargetingOptionResponse`
--
UPDATE `SingleInterestTargetingOptionResponse` SET `id` = ?, `name` = ?, `child_interests` = ?, `level` = ? WHERE 1;

--
-- DELETE template for table `SingleInterestTargetingOptionResponse`
--
DELETE FROM `SingleInterestTargetingOptionResponse` WHERE 0;

