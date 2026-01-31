package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsHotelProductGroupFilterKeys.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsHotelProductGroupFilterKeys(
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

object CatalogsHotelProductGroupFilterKeys {
  implicit lazy val catalogsHotelProductGroupFilterKeysJsonFormat: Format[CatalogsHotelProductGroupFilterKeys] = Json.format[CatalogsHotelProductGroupFilterKeys]
}

