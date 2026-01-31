--
-- Pinterest REST API.
-- Prepared SQL queries for 'Board' definition.
--


--
-- SELECT template for table `Board`
--
SELECT `board_pins_modified_at`, `collaborator_count`, `created_at`, `description`, `follower_count`, `id`, `is_ads_only`, `media`, `name`, `owner`, `pin_count`, `privacy` FROM `Board` WHERE 1;

--
-- INSERT template for table `Board`
--
INSERT INTO `Board`(`board_pins_modified_at`, `collaborator_count`, `created_at`, `description`, `follower_count`, `id`, `is_ads_only`, `media`, `name`, `owner`, `pin_count`, `privacy`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Board`
--
UPDATE `Board` SET `board_pins_modified_at` = ?, `collaborator_count` = ?, `created_at` = ?, `description` = ?, `follower_count` = ?, `id` = ?, `is_ads_only` = ?, `media` = ?, `name` = ?, `owner` = ?, `pin_count` = ?, `privacy` = ? WHERE 1;

--
-- DELETE template for table `Board`
--
DELETE FROM `Board` WHERE 0;

