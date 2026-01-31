package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsHotelProductGroupFilterKeys.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsHotelProductGroupFilterKeys(
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

object CatalogsHotelProductGroupFilterKeys {
  implicit lazy val catalogsHotelProductGroupFilterKeysJsonFormat: Format[CatalogsHotelProductGroupFilterKeys] = Json.format[CatalogsHotelProductGroupFilterKeys]
}

