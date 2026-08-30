--
-- Pinterest REST API.
-- Prepared SQL queries for 'SingleInterestTargetingOption' definition.
--


--
-- SELECT template for table `SingleInterestTargetingOption`
--
SELECT `child_interests`, `id`, `level`, `name` FROM `SingleInterestTargetingOption` WHERE 1;

--
-- INSERT template for table `SingleInterestTargetingOption`
--
INSERT INTO `SingleInterestTargetingOption`(`child_interests`, `id`, `level`, `name`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `SingleInterestTargetingOption`
--
UPDATE `SingleInterestTargetingOption` SET `child_interests` = ?, `id` = ?, `level` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `SingleInterestTargetingOption`
--
DELETE FROM `SingleInterestTargetingOption` WHERE 0;

