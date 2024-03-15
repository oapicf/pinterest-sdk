--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelGuestRatings' definition.
--


--
-- SELECT template for table `CatalogsHotelGuestRatings`
--
SELECT `score`, `number_of_reviewers`, `max_score`, `rating_system` FROM `CatalogsHotelGuestRatings` WHERE 1;

--
-- INSERT template for table `CatalogsHotelGuestRatings`
--
INSERT INTO `CatalogsHotelGuestRatings`(`score`, `number_of_reviewers`, `max_score`, `rating_system`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelGuestRatings`
--
UPDATE `CatalogsHotelGuestRatings` SET `score` = ?, `number_of_reviewers` = ?, `max_score` = ?, `rating_system` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelGuestRatings`
--
DELETE FROM `CatalogsHotelGuestRatings` WHERE 0;

