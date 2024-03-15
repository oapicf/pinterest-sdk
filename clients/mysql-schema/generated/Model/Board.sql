--
-- Pinterest REST API.
-- Prepared SQL queries for 'Board' definition.
--


--
-- SELECT template for table `Board`
--
SELECT `id`, `created_at`, `board_pins_modified_at`, `name`, `description`, `collaborator_count`, `pin_count`, `follower_count`, `media`, `owner`, `privacy` FROM `Board` WHERE 1;

--
-- INSERT template for table `Board`
--
INSERT INTO `Board`(`id`, `created_at`, `board_pins_modified_at`, `name`, `description`, `collaborator_count`, `pin_count`, `follower_count`, `media`, `owner`, `privacy`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Board`
--
UPDATE `Board` SET `id` = ?, `created_at` = ?, `board_pins_modified_at` = ?, `name` = ?, `description` = ?, `collaborator_count` = ?, `pin_count` = ?, `follower_count` = ?, `media` = ?, `owner` = ?, `privacy` = ? WHERE 1;

--
-- DELETE template for table `Board`
--
DELETE FROM `Board` WHERE 0;

