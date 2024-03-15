package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsItemValidationWarnings.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsItemValidationWarnings(
  AD_LINK_FORMAT_WARNING: Option[CatalogsItemValidationDetails],
  AD_LINK_SAME_AS_LINK: Option[CatalogsItemValidationDetails],
  ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG: Option[CatalogsItemValidationDetails],
  ADDITIONAL_IMAGE_LINK_WARNING: Option[CatalogsItemValidationDetails],
  ADWORDS_FORMAT_WARNING: Option[CatalogsItemValidationDetails],
  ADWORDS_SAME_AS_LINK: Option[CatalogsItemValidationDetails],
  AGE_GROUP_INVALID: Option[CatalogsItemValidationDetails],
  SIZE_SYSTEM_INVALID: Option[CatalogsItemValidationDetails],
  ANDROID_DEEP_LINK_INVALID: Option[CatalogsItemValidationDetails],
  AVAILABILITY_DATE_INVALID: Option[CatalogsItemValidationDetails],
  COUNTRY_DOES_NOT_MAP_TO_CURRENCY: Option[CatalogsItemValidationDetails],
  CUSTOM_LABEL_LENGTH_TOO_LONG: Option[CatalogsItemValidationDetails],
  DESCRIPTION_LENGTH_TOO_LONG: Option[CatalogsItemValidationDetails],
  EXPIRATION_DATE_INVALID: Option[CatalogsItemValidationDetails],
  GENDER_INVALID: Option[CatalogsItemValidationDetails],
  GTIN_INVALID: Option[CatalogsItemValidationDetails],
  IMAGE_LINK_WARNING: Option[CatalogsItemValidationDetails],
  IOS_DEEP_LINK_INVALID: Option[CatalogsItemValidationDetails],
  IS_BUNDLE_INVALID: Option[CatalogsItemValidationDetails],
  ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE: Option[CatalogsItemValidationDetails],
  LINK_FORMAT_WARNING: Option[CatalogsItemValidationDetails],
  MIN_AD_PRICE_INVALID: Option[CatalogsItemValidationDetails],
  MPN_INVALID: Option[CatalogsItemValidationDetails],
  MULTIPACK_INVALID: Option[CatalogsItemValidationDetails],
  OPTIONAL_CONDITION_INVALID: Option[CatalogsItemValidationDetails],
  OPTIONAL_CONDITION_MISSING: Option[CatalogsItemValidationDetails],
  OPTIONAL_PRODUCT_CATEGORY_INVALID: Option[CatalogsItemValidationDetails],
  OPTIONAL_PRODUCT_CATEGORY_MISSING: Option[CatalogsItemValidationDetails],
  PRODUCT_CATEGORY_DEPTH_WARNING: Option[CatalogsItemValidationDetails],
  PRODUCT_TYPE_LENGTH_TOO_LONG: Option[CatalogsItemValidationDetails],
  SALES_PRICE_INVALID: Option[CatalogsItemValidationDetails],
  SALES_PRICE_TOO_LOW: Option[CatalogsItemValidationDetails],
  SALES_PRICE_TOO_HIGH: Option[CatalogsItemValidationDetails],
  SALE_DATE_INVALID: Option[CatalogsItemValidationDetails],
  SHIPPING_INVALID: Option[CatalogsItemValidationDetails],
  SHIPPING_HEIGHT_INVALID: Option[CatalogsItemValidationDetails],
  SHIPPING_WEIGHT_INVALID: Option[CatalogsItemValidationDetails],
  SHIPPING_WIDTH_INVALID: Option[CatalogsItemValidationDetails],
  SIZE_TYPE_INVALID: Option[CatalogsItemValidationDetails],
  TAX_INVALID: Option[CatalogsItemValidationDetails],
  TITLE_LENGTH_TOO_LONG: Option[CatalogsItemValidationDetails],
  TOO_MANY_ADDITIONAL_IMAGE_LINKS: Option[CatalogsItemValidationDetails],
  UTM_SOURCE_AUTO_CORRECTED: Option[CatalogsItemValidationDetails],
  WEIGHT_UNIT_INVALID: Option[CatalogsItemValidationDetails]
)

object CatalogsItemValidationWarnings {
  implicit lazy val catalogsItemValidationWarningsJsonFormat: Format[CatalogsItemValidationWarnings] = Json.format[CatalogsItemValidationWarnings]
}

