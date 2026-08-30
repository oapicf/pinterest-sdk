--
-- Pinterest REST API.
-- Prepared SQL queries for 'Keywords' definition.
--


--
-- SELECT template for table `Keywords`
--
SELECT `errors`, `keywords` FROM `Keywords` WHERE 1;

--
-- INSERT template for table `Keywords`
--
INSERT INTO `Keywords`(`errors`, `keywords`) VALUES (?, ?);

--
-- UPDATE template for table `Keywords`
--
UPDATE `Keywords` SET `errors` = ?, `keywords` = ? WHERE 1;

--
-- DELETE template for table `Keywords`
--
DELETE FROM `Keywords` WHERE 0;

