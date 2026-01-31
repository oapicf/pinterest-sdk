--
-- Pinterest REST API.
-- Prepared SQL queries for 'BoardBase' definition.
--


--
-- SELECT template for table `BoardBase`
--
SELECT `board_pins_modified_at`, `collaborator_count`, `created_at`, `description`, `follower_count`, `id`, `is_ads_only`, `media`, `name`, `owner`, `pin_count` FROM `BoardBase` WHERE 1;

--
-- INSERT template for table `BoardBase`
--
INSERT INTO `BoardBase`(`board_pins_modified_at`, `collaborator_count`, `created_at`, `description`, `follower_count`, `id`, `is_ads_only`, `media`, `name`, `owner`, `pin_count`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BoardBase`
--
UPDATE `BoardBase` SET `board_pins_modified_at` = ?, `collaborator_count` = ?, `created_at` = ?, `description` = ?, `follower_count` = ?, `id` = ?, `is_ads_only` = ?, `media` = ?, `name` = ?, `owner` = ?, `pin_count` = ? WHERE 1;

--
-- DELETE template for table `BoardBase`
--
DELETE FROM `BoardBase` WHERE 0;

