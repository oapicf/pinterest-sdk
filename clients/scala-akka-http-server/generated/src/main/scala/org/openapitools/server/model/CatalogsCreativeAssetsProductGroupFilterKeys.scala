package org.openapitools.server.model


/**
 * = catalogs_product_group_keys =
 *
 * @param CREATIVE_ASSETS_ID  for example: ''null''
 * @param CUSTOM_LABEL_0  for example: ''null''
 * @param CUSTOM_LABEL_1  for example: ''null''
 * @param CUSTOM_LABEL_2  for example: ''null''
 * @param CUSTOM_LABEL_3  for example: ''null''
 * @param CUSTOM_LABEL_4  for example: ''null''
 * @param GOOGLE_PRODUCT_CATEGORY_6  for example: ''null''
 * @param GOOGLE_PRODUCT_CATEGORY_5  for example: ''null''
 * @param GOOGLE_PRODUCT_CATEGORY_4  for example: ''null''
 * @param GOOGLE_PRODUCT_CATEGORY_3  for example: ''null''
 * @param GOOGLE_PRODUCT_CATEGORY_2  for example: ''null''
 * @param GOOGLE_PRODUCT_CATEGORY_1  for example: ''null''
 * @param GOOGLE_PRODUCT_CATEGORY_0  for example: ''null''
 * @param MEDIA_TYPE  for example: ''null''
*/
final case class CatalogsCreativeAssetsProductGroupFilterKeys (
  CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_0: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_1: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_2: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_3: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_4: CatalogsProductGroupMultipleStringCriteria,
  GOOGLE_PRODUCT_CATEGORY_6: CatalogsProductGroupMultipleStringListCriteria,
  GOOGLE_PRODUCT_CATEGORY_5: CatalogsProductGroupMultipleStringListCriteria,
  GOOGLE_PRODUCT_CATEGORY_4: CatalogsProductGroupMultipleStringListCriteria,
  GOOGLE_PRODUCT_CATEGORY_3: CatalogsProductGroupMultipleStringListCriteria,
  GOOGLE_PRODUCT_CATEGORY_2: CatalogsProductGroupMultipleStringListCriteria,
  GOOGLE_PRODUCT_CATEGORY_1: CatalogsProductGroupMultipleStringListCriteria,
  GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria,
  MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria
)

