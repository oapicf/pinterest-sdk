--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsUpdatableCreativeAssetsAttributes' definition.
--


--
-- SELECT template for table `CatalogsUpdatableCreativeAssetsAttributes`
--
SELECT `title`, `description`, `link`, `ios_deep_link`, `android_deep_link`, `google_product_category`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `visibility` FROM `CatalogsUpdatableCreativeAssetsAttributes` WHERE 1;

--
-- INSERT template for table `CatalogsUpdatableCreativeAssetsAttributes`
--
INSERT INTO `CatalogsUpdatableCreativeAssetsAttributes`(`title`, `description`, `link`, `ios_deep_link`, `android_deep_link`, `google_product_category`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `visibility`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsUpdatableCreativeAssetsAttributes`
--
UPDATE `CatalogsUpdatableCreativeAssetsAttributes` SET `title` = ?, `description` = ?, `link` = ?, `ios_deep_link` = ?, `android_deep_link` = ?, `google_product_category` = ?, `custom_label_0` = ?, `custom_label_1` = ?, `custom_label_2` = ?, `custom_label_3` = ?, `custom_label_4` = ?, `visibility` = ? WHERE 1;

--
-- DELETE template for table `CatalogsUpdatableCreativeAssetsAttributes`
--
DELETE FROM `CatalogsUpdatableCreativeAssetsAttributes` WHERE 0;

