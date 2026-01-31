--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelGuestRatings' definition.
--


--
-- SELECT template for table `CatalogsHotelGuestRatings`
--
SELECT `max_score`, `number_of_reviewers`, `rating_system`, `score` FROM `CatalogsHotelGuestRatings` WHERE 1;

--
-- INSERT template for table `CatalogsHotelGuestRatings`
--
INSERT INTO `CatalogsHotelGuestRatings`(`max_score`, `number_of_reviewers`, `rating_system`, `score`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelGuestRatings`
--
UPDATE `CatalogsHotelGuestRatings` SET `max_score` = ?, `number_of_reviewers` = ?, `rating_system` = ?, `score` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelGuestRatings`
--
DELETE FROM `CatalogsHotelGuestRatings` WHERE 0;

