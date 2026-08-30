package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsCreativeAssetsProductGroupFilterKeys.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsCreativeAssetsProductGroupFilterKeys(
  CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria,
  CUSTOM_LABEL_0: CatalogsProductGroupFilterOperatorTypeCriteria,
  CUSTOM_LABEL_1: CatalogsProductGroupFilterOperatorTypeCriteria,
  CUSTOM_LABEL_2: CatalogsProductGroupFilterOperatorTypeCriteria,
  CUSTOM_LABEL_3: CatalogsProductGroupFilterOperatorTypeCriteria,
  CUSTOM_LABEL_4: CatalogsProductGroupFilterOperatorTypeCriteria,
  GOOGLE_PRODUCT_CATEGORY_6: CatalogsProductGroupMultipleStringListCriteria,
  GOOGLE_PRODUCT_CATEGORY_5: CatalogsProductGroupMultipleStringListCriteria,
  GOOGLE_PRODUCT_CATEGORY_4: CatalogsProductGroupMultipleStringListCriteria,
  GOOGLE_PRODUCT_CATEGORY_3: CatalogsProductGroupMultipleStringListCriteria,
  GOOGLE_PRODUCT_CATEGORY_2: CatalogsProductGroupMultipleStringListCriteria,
  GOOGLE_PRODUCT_CATEGORY_1: CatalogsProductGroupMultipleStringListCriteria,
  GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria,
  MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria,
  TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria,
  LINK: CatalogsProductGroupFilterOperatorTypeCriteria
)

object CatalogsCreativeAssetsProductGroupFilterKeys {
  implicit lazy val catalogsCreativeAssetsProductGroupFilterKeysJsonFormat: Format[CatalogsCreativeAssetsProductGroupFilterKeys] = Json.format[CatalogsCreativeAssetsProductGroupFilterKeys]
}

