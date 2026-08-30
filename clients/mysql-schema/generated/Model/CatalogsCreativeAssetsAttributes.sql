--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsAttributes' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsAttributes`
--
SELECT `android_deep_link`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `description`, `google_product_category`, `ios_deep_link`, `link`, `title`, `visibility`, `ai_disclosures`, `image_link`, `video_link` FROM `CatalogsCreativeAssetsAttributes` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsAttributes`
--
INSERT INTO `CatalogsCreativeAssetsAttributes`(`android_deep_link`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `description`, `google_product_category`, `ios_deep_link`, `link`, `title`, `visibility`, `ai_disclosures`, `image_link`, `video_link`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsAttributes`
--
UPDATE `CatalogsCreativeAssetsAttributes` SET `android_deep_link` = ?, `custom_label_0` = ?, `custom_label_1` = ?, `custom_label_2` = ?, `custom_label_3` = ?, `custom_label_4` = ?, `description` = ?, `google_product_category` = ?, `ios_deep_link` = ?, `link` = ?, `title` = ?, `visibility` = ?, `ai_disclosures` = ?, `image_link` = ?, `video_link` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsAttributes`
--
DELETE FROM `CatalogsCreativeAssetsAttributes` WHERE 0;

