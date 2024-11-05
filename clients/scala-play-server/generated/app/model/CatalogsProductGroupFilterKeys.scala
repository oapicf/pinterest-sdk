package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupFilterKeys.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsProductGroupFilterKeys(
  MIN_PRICE: CatalogsProductGroupPricingCriteria,
  MAX_PRICE: CatalogsProductGroupPricingCriteria,
  CURRENCY: CatalogsProductGroupCurrencyCriteria,
  ITEM_ID: CatalogsProductGroupMultipleStringCriteria,
  AVAILABILITY: CatalogsProductGroupMultipleStringCriteria,
  BRAND: CatalogsProductGroupMultipleStringCriteria,
  CONDITION: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_0: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_1: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_2: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_3: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_4: CatalogsProductGroupMultipleStringCriteria,
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
  PRODUCT_GROUP: CatalogsProductGroupMultipleStringCriteria
)

object CatalogsProductGroupFilterKeys {
  implicit lazy val catalogsProductGroupFilterKeysJsonFormat: Format[CatalogsProductGroupFilterKeys] = Json.format[CatalogsProductGroupFilterKeys]
}

