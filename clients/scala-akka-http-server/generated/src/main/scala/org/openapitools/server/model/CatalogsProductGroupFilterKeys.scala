package org.openapitools.server.model


/**
 * = catalogs_product_group_keys =
 *
 * @param MIN_PRICE  for example: ''null''
 * @param MAX_PRICE  for example: ''null''
 * @param CURRENCY  for example: ''null''
 * @param ITEM_ID  for example: ''null''
 * @param AVAILABILITY  for example: ''null''
 * @param BRAND  for example: ''null''
 * @param CONDITION  for example: ''null''
 * @param CUSTOM_LABEL_0  for example: ''null''
 * @param CUSTOM_LABEL_1  for example: ''null''
 * @param CUSTOM_LABEL_2  for example: ''null''
 * @param CUSTOM_LABEL_3  for example: ''null''
 * @param CUSTOM_LABEL_4  for example: ''null''
 * @param ITEM_GROUP_ID  for example: ''null''
 * @param GENDER  for example: ''null''
 * @param PRODUCT_TYPE_4  for example: ''null''
 * @param PRODUCT_TYPE_3  for example: ''null''
 * @param PRODUCT_TYPE_2  for example: ''null''
 * @param PRODUCT_TYPE_1  for example: ''null''
 * @param PRODUCT_TYPE_0  for example: ''null''
 * @param GOOGLE_PRODUCT_CATEGORY_6  for example: ''null''
 * @param GOOGLE_PRODUCT_CATEGORY_5  for example: ''null''
 * @param GOOGLE_PRODUCT_CATEGORY_4  for example: ''null''
 * @param GOOGLE_PRODUCT_CATEGORY_3  for example: ''null''
 * @param GOOGLE_PRODUCT_CATEGORY_2  for example: ''null''
 * @param GOOGLE_PRODUCT_CATEGORY_1  for example: ''null''
 * @param GOOGLE_PRODUCT_CATEGORY_0  for example: ''null''
*/
final case class CatalogsProductGroupFilterKeys (
  MIN_PRICE: CatalogsProductGroupPricingCriteria,
  MAX_PRICE: CatalogsProductGroupPricingCriteria,
  CURRENCY: CatalogsProductGroupCurrencyCriteria,
  ITEM_ID: CatalogsProductGroupCurrencyCriteria,
  AVAILABILITY: CatalogsProductGroupMultipleStringCriteria,
  BRAND: CatalogsProductGroupMultipleStringCriteria,
  CONDITION: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_0: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_1: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_2: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_3: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_4: CatalogsProductGroupMultipleStringCriteria,
  ITEM_GROUP_ID: CatalogsProductGroupMultipleStringCriteria,
  GENDER: CatalogsProductGroupMultipleStringCriteria,
  PRODUCT_TYPE_4: CatalogsProductGroupMultipleStringListCriteria,
  PRODUCT_TYPE_3: CatalogsProductGroupMultipleStringListCriteria,
  PRODUCT_TYPE_2: CatalogsProductGroupMultipleStringListCriteria,
  PRODUCT_TYPE_1: CatalogsProductGroupMultipleStringListCriteria,
  PRODUCT_TYPE_0: CatalogsProductGroupMultipleStringListCriteria,
  GOOGLE_PRODUCT_CATEGORY_6: CatalogsProductGroupMultipleStringListCriteria,
  GOOGLE_PRODUCT_CATEGORY_5: CatalogsProductGroupMultipleStringListCriteria,
  GOOGLE_PRODUCT_CATEGORY_4: CatalogsProductGroupMultipleStringListCriteria,
  GOOGLE_PRODUCT_CATEGORY_3: CatalogsProductGroupMultipleStringListCriteria,
  GOOGLE_PRODUCT_CATEGORY_2: CatalogsProductGroupMultipleStringListCriteria,
  GOOGLE_PRODUCT_CATEGORY_1: CatalogsProductGroupMultipleStringListCriteria,
  GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria
)

