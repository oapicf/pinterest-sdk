--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountOwner' definition.
--


--
-- SELECT template for table `AdAccountOwner`
--
SELECT `id`, `username` FROM `AdAccountOwner` WHERE 1;

--
-- INSERT template for table `AdAccountOwner`
--
INSERT INTO `AdAccountOwner`(`id`, `username`) VALUES (?, ?);

--
-- UPDATE template for table `AdAccountOwner`
--
UPDATE `AdAccountOwner` SET `id` = ?, `username` = ? WHERE 1;

--
-- DELETE template for table `AdAccountOwner`
--
DELETE FROM `AdAccountOwner` WHERE 0;

