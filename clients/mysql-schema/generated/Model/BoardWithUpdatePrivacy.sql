--
-- Pinterest REST API.
-- Prepared SQL queries for 'BoardWithUpdatePrivacy' definition.
--


--
-- SELECT template for table `BoardWithUpdatePrivacy`
--
SELECT `board_pins_modified_at`, `collaborator_count`, `created_at`, `description`, `follower_count`, `id`, `is_ads_only`, `media`, `name`, `owner`, `pin_count`, `privacy` FROM `BoardWithUpdatePrivacy` WHERE 1;

--
-- INSERT template for table `BoardWithUpdatePrivacy`
--
INSERT INTO `BoardWithUpdatePrivacy`(`board_pins_modified_at`, `collaborator_count`, `created_at`, `description`, `follower_count`, `id`, `is_ads_only`, `media`, `name`, `owner`, `pin_count`, `privacy`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BoardWithUpdatePrivacy`
--
UPDATE `BoardWithUpdatePrivacy` SET `board_pins_modified_at` = ?, `collaborator_count` = ?, `created_at` = ?, `description` = ?, `follower_count` = ?, `id` = ?, `is_ads_only` = ?, `media` = ?, `name` = ?, `owner` = ?, `pin_count` = ?, `privacy` = ? WHERE 1;

--
-- DELETE template for table `BoardWithUpdatePrivacy`
--
DELETE FROM `BoardWithUpdatePrivacy` WHERE 0;

