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
*/
final case class CatalogsHotelProductGroupFilterKeys (
  PRICE: CatalogsProductGroupPricingCurrencyCriteria,
  HOTEL_ID: CatalogsProductGroupMultipleStringCriteria,
  BRAND: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_0: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_1: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_2: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_3: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_4: CatalogsProductGroupMultipleStringCriteria,
  COUNTRY: CatalogsProductGroupMultipleCountriesCriteria
)

