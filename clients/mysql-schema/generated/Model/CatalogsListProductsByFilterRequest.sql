--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsListProductsByFilterRequest' definition.
--


--
-- SELECT template for table `CatalogsListProductsByFilterRequest`
--
SELECT `feed_id`, `filters` FROM `CatalogsListProductsByFilterRequest` WHERE 1;

--
-- INSERT template for table `CatalogsListProductsByFilterRequest`
--
INSERT INTO `CatalogsListProductsByFilterRequest`(`feed_id`, `filters`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsListProductsByFilterRequest`
--
UPDATE `CatalogsListProductsByFilterRequest` SET `feed_id` = ?, `filters` = ? WHERE 1;

--
-- DELETE template for table `CatalogsListProductsByFilterRequest`
--
DELETE FROM `CatalogsListProductsByFilterRequest` WHERE 0;

