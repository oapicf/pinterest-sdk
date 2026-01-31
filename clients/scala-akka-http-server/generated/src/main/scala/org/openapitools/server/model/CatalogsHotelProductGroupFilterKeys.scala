package org.openapitools.server.model


/**
 * = catalogs_product_group_keys =
 *
 * @param PRICE  for example: ''null''
 * @param HOTEL_ID  for example: ''null''
 * @param BRAND  for example: ''null''
 * @param CUSTOM_LABEL_0  for example: ''null''
 * @param CUSTOM_LABEL_1  for example: ''null''
 * @param CUSTOM_LABEL_2  for example: ''null''
 * @param CUSTOM_LABEL_3  for example: ''null''
 * @param CUSTOM_LABEL_4  for example: ''null''
 * @param COUNTRY  for example: ''null''
 * @param TITLE_KEYWORDS  for example: ''null''
*/
final case class CatalogsHotelProductGroupFilterKeys (
  PRICE: CatalogsProductGroupPricingCurrencyCriteria,
  HOTEL_ID: CatalogsProductGroupMultipleStringCriteria,
  BRAND: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_0: CatalogsProductGroupFilterOperatorTypeCriteria,
  CUSTOM_LABEL_1: CatalogsProductGroupFilterOperatorTypeCriteria,
  CUSTOM_LABEL_2: CatalogsProductGroupFilterOperatorTypeCriteria,
  CUSTOM_LABEL_3: CatalogsProductGroupFilterOperatorTypeCriteria,
  CUSTOM_LABEL_4: CatalogsProductGroupFilterOperatorTypeCriteria,
  COUNTRY: CatalogsProductGroupMultipleCountriesCriteria,
  TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria
)

