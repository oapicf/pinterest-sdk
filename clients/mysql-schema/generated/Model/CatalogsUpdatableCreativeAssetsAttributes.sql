--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsUpdatableCreativeAssetsAttributes' definition.
--


--
-- SELECT template for table `CatalogsUpdatableCreativeAssetsAttributes`
--
SELECT `android_deep_link`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `description`, `google_product_category`, `ios_deep_link`, `link`, `title`, `visibility` FROM `CatalogsUpdatableCreativeAssetsAttributes` WHERE 1;

--
-- INSERT template for table `CatalogsUpdatableCreativeAssetsAttributes`
--
INSERT INTO `CatalogsUpdatableCreativeAssetsAttributes`(`android_deep_link`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `description`, `google_product_category`, `ios_deep_link`, `link`, `title`, `visibility`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsUpdatableCreativeAssetsAttributes`
--
UPDATE `CatalogsUpdatableCreativeAssetsAttributes` SET `android_deep_link` = ?, `custom_label_0` = ?, `custom_label_1` = ?, `custom_label_2` = ?, `custom_label_3` = ?, `custom_label_4` = ?, `description` = ?, `google_product_category` = ?, `ios_deep_link` = ?, `link` = ?, `title` = ?, `visibility` = ? WHERE 1;

--
-- DELETE template for table `CatalogsUpdatableCreativeAssetsAttributes`
--
DELETE FROM `CatalogsUpdatableCreativeAssetsAttributes` WHERE 0;

