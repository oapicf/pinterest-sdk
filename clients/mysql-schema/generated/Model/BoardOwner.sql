--
-- Pinterest REST API.
-- Prepared SQL queries for 'BoardOwner' definition.
--


--
-- SELECT template for table `BoardOwner`
--
SELECT `username` FROM `BoardOwner` WHERE 1;

--
-- INSERT template for table `BoardOwner`
--
INSERT INTO `BoardOwner`(`username`) VALUES (?);

--
-- UPDATE template for table `BoardOwner`
--
UPDATE `BoardOwner` SET `username` = ? WHERE 1;

--
-- DELETE template for table `BoardOwner`
--
DELETE FROM `BoardOwner` WHERE 0;

