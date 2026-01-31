package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupFilterKeys.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsProductGroupFilterKeys(
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
  PRODUCT_GROUP: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_NUMBER_0: CatalogsProductGroupUint32Criteria,
  CUSTOM_NUMBER_1: CatalogsProductGroupUint32Criteria,
  CUSTOM_NUMBER_2: CatalogsProductGroupUint32Criteria,
  CUSTOM_NUMBER_3: CatalogsProductGroupUint32Criteria,
  CUSTOM_NUMBER_4: CatalogsProductGroupUint32Criteria,
  TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria
)

object CatalogsProductGroupFilterKeys {
  implicit lazy val catalogsProductGroupFilterKeysJsonFormat: Format[CatalogsProductGroupFilterKeys] = Json.format[CatalogsProductGroupFilterKeys]
}

