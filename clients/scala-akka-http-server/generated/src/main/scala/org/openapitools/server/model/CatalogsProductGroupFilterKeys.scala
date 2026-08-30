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
 * @param MEDIA_TYPE  for example: ''null''
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
 * @param CUSTOM_NUMBER_0  for example: ''null''
 * @param CUSTOM_NUMBER_1  for example: ''null''
 * @param CUSTOM_NUMBER_2  for example: ''null''
 * @param CUSTOM_NUMBER_3  for example: ''null''
 * @param CUSTOM_NUMBER_4  for example: ''null''
 * @param TITLE_KEYWORDS  for example: ''null''
 * @param PINTEREST_PRODUCT_CATEGORIES  for example: ''null''
 * @param PRODUCT_GROUP  for example: ''null''
*/
final case class CatalogsProductGroupFilterKeys (
  MIN_PRICE: CatalogsProductGroupPricingCriteria,
  MAX_PRICE: CatalogsProductGroupPricingCriteria,
  CURRENCY: CatalogsProductGroupCurrencyCriteria,
  ITEM_ID: CatalogsProductGroupMultipleStringCriteria,
  AVAILABILITY: CatalogsProductGroupMultipleStringCriteria,
  BRAND: CatalogsProductGroupMultipleStringCriteria,
  CONDITION: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_0: CatalogsProductGroupFilterOperatorTypeCriteria,
  CUSTOM_LABEL_1: CatalogsProductGroupFilterOperatorTypeCriteria,
  CUSTOM_LABEL_2: CatalogsProductGroupFilterOperatorTypeCriteria,
  CUSTOM_LABEL_3: CatalogsProductGroupFilterOperatorTypeCriteria,
  CUSTOM_LABEL_4: CatalogsProductGroupFilterOperatorTypeCriteria,
  ITEM_GROUP_ID: CatalogsProductGroupMultipleStringCriteria,
  GENDER: CatalogsProductGroupMultipleGenderCriteria,
  MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria,
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
  GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria,
  CUSTOM_NUMBER_0: CatalogsProductGroupUint32Criteria,
  CUSTOM_NUMBER_1: CatalogsProductGroupUint32Criteria,
  CUSTOM_NUMBER_2: CatalogsProductGroupUint32Criteria,
  CUSTOM_NUMBER_3: CatalogsProductGroupUint32Criteria,
  CUSTOM_NUMBER_4: CatalogsProductGroupUint32Criteria,
  TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria,
  PINTEREST_PRODUCT_CATEGORIES: CatalogsProductGroupMultiplePinterestProductCategoryCriteria,
  PRODUCT_GROUP: CatalogsProductGroupMultipleStringCriteria
)

