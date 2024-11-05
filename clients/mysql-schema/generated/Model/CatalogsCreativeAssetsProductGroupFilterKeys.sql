--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreativeAssetsProductGroupFilterKeys' definition.
--


--
-- SELECT template for table `CatalogsCreativeAssetsProductGroupFilterKeys`
--
SELECT `CREATIVE_ASSETS_ID`, `CUSTOM_LABEL_0`, `CUSTOM_LABEL_1`, `CUSTOM_LABEL_2`, `CUSTOM_LABEL_3`, `CUSTOM_LABEL_4`, `GOOGLE_PRODUCT_CATEGORY_6`, `GOOGLE_PRODUCT_CATEGORY_5`, `GOOGLE_PRODUCT_CATEGORY_4`, `GOOGLE_PRODUCT_CATEGORY_3`, `GOOGLE_PRODUCT_CATEGORY_2`, `GOOGLE_PRODUCT_CATEGORY_1`, `GOOGLE_PRODUCT_CATEGORY_0`, `MEDIA_TYPE` FROM `CatalogsCreativeAssetsProductGroupFilterKeys` WHERE 1;

--
-- INSERT template for table `CatalogsCreativeAssetsProductGroupFilterKeys`
--
INSERT INTO `CatalogsCreativeAssetsProductGroupFilterKeys`(`CREATIVE_ASSETS_ID`, `CUSTOM_LABEL_0`, `CUSTOM_LABEL_1`, `CUSTOM_LABEL_2`, `CUSTOM_LABEL_3`, `CUSTOM_LABEL_4`, `GOOGLE_PRODUCT_CATEGORY_6`, `GOOGLE_PRODUCT_CATEGORY_5`, `GOOGLE_PRODUCT_CATEGORY_4`, `GOOGLE_PRODUCT_CATEGORY_3`, `GOOGLE_PRODUCT_CATEGORY_2`, `GOOGLE_PRODUCT_CATEGORY_1`, `GOOGLE_PRODUCT_CATEGORY_0`, `MEDIA_TYPE`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsCreativeAssetsProductGroupFilterKeys`
--
UPDATE `CatalogsCreativeAssetsProductGroupFilterKeys` SET `CREATIVE_ASSETS_ID` = ?, `CUSTOM_LABEL_0` = ?, `CUSTOM_LABEL_1` = ?, `CUSTOM_LABEL_2` = ?, `CUSTOM_LABEL_3` = ?, `CUSTOM_LABEL_4` = ?, `GOOGLE_PRODUCT_CATEGORY_6` = ?, `GOOGLE_PRODUCT_CATEGORY_5` = ?, `GOOGLE_PRODUCT_CATEGORY_4` = ?, `GOOGLE_PRODUCT_CATEGORY_3` = ?, `GOOGLE_PRODUCT_CATEGORY_2` = ?, `GOOGLE_PRODUCT_CATEGORY_1` = ?, `GOOGLE_PRODUCT_CATEGORY_0` = ?, `MEDIA_TYPE` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreativeAssetsProductGroupFilterKeys`
--
DELETE FROM `CatalogsCreativeAssetsProductGroupFilterKeys` WHERE 0;

