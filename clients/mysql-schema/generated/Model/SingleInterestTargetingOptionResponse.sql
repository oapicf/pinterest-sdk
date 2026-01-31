--
-- Pinterest REST API.
-- Prepared SQL queries for 'SingleInterestTargetingOptionResponse' definition.
--


--
-- SELECT template for table `SingleInterestTargetingOptionResponse`
--
SELECT `child_interests`, `id`, `level`, `name` FROM `SingleInterestTargetingOptionResponse` WHERE 1;

--
-- INSERT template for table `SingleInterestTargetingOptionResponse`
--
INSERT INTO `SingleInterestTargetingOptionResponse`(`child_interests`, `id`, `level`, `name`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `SingleInterestTargetingOptionResponse`
--
UPDATE `SingleInterestTargetingOptionResponse` SET `child_interests` = ?, `id` = ?, `level` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `SingleInterestTargetingOptionResponse`
--
DELETE FROM `SingleInterestTargetingOptionResponse` WHERE 0;

