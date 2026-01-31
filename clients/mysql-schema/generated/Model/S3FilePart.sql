--
-- Pinterest REST API.
-- Prepared SQL queries for 'S3FilePart' definition.
--


--
-- SELECT template for table `S3FilePart`
--
SELECT `part_number`, `presigned_url` FROM `S3FilePart` WHERE 1;

--
-- INSERT template for table `S3FilePart`
--
INSERT INTO `S3FilePart`(`part_number`, `presigned_url`) VALUES (?, ?);

--
-- UPDATE template for table `S3FilePart`
--
UPDATE `S3FilePart` SET `part_number` = ?, `presigned_url` = ? WHERE 1;

--
-- DELETE template for table `S3FilePart`
--
DELETE FROM `S3FilePart` WHERE 0;

