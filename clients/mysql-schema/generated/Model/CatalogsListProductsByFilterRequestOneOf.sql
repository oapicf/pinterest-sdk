--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsListProductsByFilterRequest_oneOf' definition.
--


--
-- SELECT template for table `CatalogsListProductsByFilterRequest_oneOf`
--
SELECT `feed_id`, `filters` FROM `CatalogsListProductsByFilterRequest_oneOf` WHERE 1;

--
-- INSERT template for table `CatalogsListProductsByFilterRequest_oneOf`
--
INSERT INTO `CatalogsListProductsByFilterRequest_oneOf`(`feed_id`, `filters`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsListProductsByFilterRequest_oneOf`
--
UPDATE `CatalogsListProductsByFilterRequest_oneOf` SET `feed_id` = ?, `filters` = ? WHERE 1;

--
-- DELETE template for table `CatalogsListProductsByFilterRequest_oneOf`
--
DELETE FROM `CatalogsListProductsByFilterRequest_oneOf` WHERE 0;

