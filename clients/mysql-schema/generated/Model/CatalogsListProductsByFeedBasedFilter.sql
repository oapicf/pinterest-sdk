--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsListProductsByFeedBasedFilter' definition.
--


--
-- SELECT template for table `CatalogsListProductsByFeedBasedFilter`
--
SELECT `feed_id`, `filters` FROM `CatalogsListProductsByFeedBasedFilter` WHERE 1;

--
-- INSERT template for table `CatalogsListProductsByFeedBasedFilter`
--
INSERT INTO `CatalogsListProductsByFeedBasedFilter`(`feed_id`, `filters`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsListProductsByFeedBasedFilter`
--
UPDATE `CatalogsListProductsByFeedBasedFilter` SET `feed_id` = ?, `filters` = ? WHERE 1;

--
-- DELETE template for table `CatalogsListProductsByFeedBasedFilter`
--
DELETE FROM `CatalogsListProductsByFeedBasedFilter` WHERE 0;

