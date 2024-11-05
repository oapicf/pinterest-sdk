--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsAttributes' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsAttributes`
--
SELECT `title`, `description`, `link`, `ios_deep_link`, `android_deep_link`, `google_product_category`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `visibility`, `image_link`, `video_link` FROM `CatalogsCreativeAssetsAttributes` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsAttributes`
--
INSERT INTO `CatalogsCreativeAssetsAttributes`(`title`, `description`, `link`, `ios_deep_link`, `android_deep_link`, `google_product_category`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `visibility`, `image_link`, `video_link`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsAttributes`
--
UPDATE `CatalogsCreativeAssetsAttributes` SET `title` = ?, `description` = ?, `link` = ?, `ios_deep_link` = ?, `android_deep_link` = ?, `google_product_category` = ?, `custom_label_0` = ?, `custom_label_1` = ?, `custom_label_2` = ?, `custom_label_3` = ?, `custom_label_4` = ?, `visibility` = ?, `image_link` = ?, `video_link` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsAttributes`
--
DELETE FROM `CatalogsCreativeAssetsAttributes` WHERE 0;

