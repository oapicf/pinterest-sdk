--
-- Pinterest REST API.
-- Prepared SQL queries for 'CarouselSlot' definition.
--


--
-- SELECT template for table `CarouselSlot`
--
SELECT `description`, `link`, `title` FROM `CarouselSlot` WHERE 1;

--
-- INSERT template for table `CarouselSlot`
--
INSERT INTO `CarouselSlot`(`description`, `link`, `title`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CarouselSlot`
--
UPDATE `CarouselSlot` SET `description` = ?, `link` = ?, `title` = ? WHERE 1;

--
-- DELETE template for table `CarouselSlot`
--
DELETE FROM `CarouselSlot` WHERE 0;

