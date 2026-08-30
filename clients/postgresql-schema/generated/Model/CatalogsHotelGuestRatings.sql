--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsHotelGuestRatings' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_hotel_guest_ratings'
--
SELECT max_score, number_of_reviewers, rating_system, score FROM catalogs_hotel_guest_ratings WHERE 1=1;

--
-- INSERT template for table 'catalogs_hotel_guest_ratings'
--
INSERT INTO catalogs_hotel_guest_ratings (max_score, number_of_reviewers, rating_system, score) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_hotel_guest_ratings'
--
UPDATE catalogs_hotel_guest_ratings SET max_score = ?, number_of_reviewers = ?, rating_system = ?, score = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_hotel_guest_ratings'
--
DELETE FROM catalogs_hotel_guest_ratings WHERE 1=2;

