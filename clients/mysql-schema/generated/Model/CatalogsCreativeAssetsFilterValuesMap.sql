--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsFilterValuesMap' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsFilterValuesMap`
--
SELECT `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `google_product_category_0`, `google_product_category_1`, `google_product_category_2`, `google_product_category_3`, `google_product_category_4`, `google_product_category_5`, `google_product_category_6`, `media_type` FROM `CatalogsCreativeAssetsFilterValuesMap` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsFilterValuesMap`
--
INSERT INTO `CatalogsCreativeAssetsFilterValuesMap`(`custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `google_product_category_0`, `google_product_category_1`, `google_product_category_2`, `google_product_category_3`, `google_product_category_4`, `google_product_category_5`, `google_product_category_6`, `media_type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsFilterValuesMap`
--
UPDATE `CatalogsCreativeAssetsFilterValuesMap` SET `custom_label_0` = ?, `custom_label_1` = ?, `custom_label_2` = ?, `custom_label_3` = ?, `custom_label_4` = ?, `google_product_category_0` = ?, `google_product_category_1` = ?, `google_product_category_2` = ?, `google_product_category_3` = ?, `google_product_category_4` = ?, `google_product_category_5` = ?, `google_product_category_6` = ?, `media_type` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsFilterValuesMap`
--
DELETE FROM `CatalogsCreativeAssetsFilterValuesMap` WHERE 0;

