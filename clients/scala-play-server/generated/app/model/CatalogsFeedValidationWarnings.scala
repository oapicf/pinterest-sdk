package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsFeedValidationWarnings.
  * @param AD_LINK_FORMAT_WARNING Some items have ad links that are formatted incorrectly.
  * @param AD_LINK_SAME_AS_LINK Some items have ad link URLs that are duplicates of the link URLs for those items.
  * @param TITLE_LENGTH_TOO_LONG The title for some items were truncated because they contain too many characters.
  * @param DESCRIPTION_LENGTH_TOO_LONG The description for some items were truncated because they contain too many characters.
  * @param GENDER_INVALID Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
  * @param AGE_GROUP_INVALID Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
  * @param SIZE_TYPE_INVALID Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
  * @param SIZE_SYSTEM_INVALID Some items have size system values which are not one of the supported size systems.
  * @param LINK_FORMAT_WARNING Some items have an invalid product link which contains invalid UTM tracking paramaters.
  * @param SALES_PRICE_INVALID Some items have sale price values that are higher than the original price of the item.
  * @param PRODUCT_CATEGORY_DEPTH_WARNING Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.
  * @param ADWORDS_FORMAT_WARNING Some items have adwords_redirect links that are formatted incorrectly.
  * @param ADWORDS_SAME_AS_LINK Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.
  * @param DUPLICATE_HEADERS Your feed contains duplicate headers.
  * @param FETCH_SAME_SIGNATURE Ingestion completed early because there are no changes to your feed since the last successful update.
  * @param ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG Some items have additional_image_link URLs that contain too many characters, so those items will not be published.
  * @param ADDITIONAL_IMAGE_LINK_WARNING Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.
  * @param IMAGE_LINK_WARNING Some items have image_link URLs that are formatted incorrectly and will not be published with those items.
  * @param SHIPPING_INVALID Some items have shipping values that are formatted incorrectly.
  * @param TAX_INVALID Some items have tax values that are formatted incorrectly.
  * @param SHIPPING_WEIGHT_INVALID Some items have invalid shipping_weight values.
  * @param EXPIRATION_DATE_INVALID Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.
  * @param AVAILABILITY_DATE_INVALID Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.
  * @param SALE_DATE_INVALID Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.
  * @param WEIGHT_UNIT_INVALID Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.
  * @param IS_BUNDLE_INVALID Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.
  * @param UPDATED_TIME_INVALID Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.
  * @param CUSTOM_LABEL_LENGTH_TOO_LONG Some items have custom_label values that are too long, those items will be published without that custom label.
  * @param PRODUCT_TYPE_LENGTH_TOO_LONG Some items have product_type values that are too long, those items will be published without that product type.
  * @param TOO_MANY_ADDITIONAL_IMAGE_LINKS Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.
  * @param MULTIPACK_INVALID Some items have invalid multipack values.
  * @param INDEXED_PRODUCT_COUNT_LARGE_DELTA The product count has increased or decreased significantly compared to the last successful ingestion.
  * @param ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE Some items include additional_image_links that can't be found.
  * @param OPTIONAL_PRODUCT_CATEGORY_MISSING Some items are missing a google_product_category.
  * @param OPTIONAL_PRODUCT_CATEGORY_INVALID Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.
  * @param OPTIONAL_CONDITION_MISSING Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.
  * @param OPTIONAL_CONDITION_INVALID Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
  * @param IOS_DEEP_LINK_INVALID Some items include invalid ios_deep_link values.
  * @param ANDROID_DEEP_LINK_INVALID Some items include invalid android_deep_link.
  * @param UTM_SOURCE_AUTO_CORRECTED Some items include utm_source values that are formatted incorrectly and have been automatically corrected.
  * @param COUNTRY_DOES_NOT_MAP_TO_CURRENCY Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.
  * @param MIN_AD_PRICE_INVALID Some items include min_ad_price values that are formatted incorrectly.
  * @param GTIN_INVALID Some items include incorrectly formatted GTINs.
  * @param INCONSISTENT_CURRENCY_VALUES Some items include inconsistent currencies in price fields.
  * @param SALES_PRICE_TOO_LOW Some items include sales price that is much lower than the list price.
  * @param SHIPPING_WIDTH_INVALID Some items include incorrectly formatted shipping_width.
  * @param SHIPPING_HEIGHT_INVALID Some items include incorrectly formatted shipping_height.
  * @param SALES_PRICE_TOO_HIGH Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.
  * @param MPN_INVALID Some items include incorrectly formatted MPNs.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsFeedValidationWarnings(
  AD_LINK_FORMAT_WARNING: Option[Int],
  AD_LINK_SAME_AS_LINK: Option[Int],
  TITLE_LENGTH_TOO_LONG: Option[Int],
  DESCRIPTION_LENGTH_TOO_LONG: Option[Int],
  GENDER_INVALID: Option[Int],
  AGE_GROUP_INVALID: Option[Int],
  SIZE_TYPE_INVALID: Option[Int],
  SIZE_SYSTEM_INVALID: Option[Int],
  LINK_FORMAT_WARNING: Option[Int],
  SALES_PRICE_INVALID: Option[Int],
  PRODUCT_CATEGORY_DEPTH_WARNING: Option[Int],
  ADWORDS_FORMAT_WARNING: Option[Int],
  ADWORDS_SAME_AS_LINK: Option[Int],
  DUPLICATE_HEADERS: Option[Int],
  FETCH_SAME_SIGNATURE: Option[CatalogsFeedValidationWarnings.FETCHSAMESIGNATURE.Value],
  ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG: Option[Int],
  ADDITIONAL_IMAGE_LINK_WARNING: Option[Int],
  IMAGE_LINK_WARNING: Option[Int],
  SHIPPING_INVALID: Option[Int],
  TAX_INVALID: Option[Int],
  SHIPPING_WEIGHT_INVALID: Option[Int],
  EXPIRATION_DATE_INVALID: Option[Int],
  AVAILABILITY_DATE_INVALID: Option[Int],
  SALE_DATE_INVALID: Option[Int],
  WEIGHT_UNIT_INVALID: Option[Int],
  IS_BUNDLE_INVALID: Option[Int],
  UPDATED_TIME_INVALID: Option[Int],
  CUSTOM_LABEL_LENGTH_TOO_LONG: Option[Int],
  PRODUCT_TYPE_LENGTH_TOO_LONG: Option[Int],
  TOO_MANY_ADDITIONAL_IMAGE_LINKS: Option[Int],
  MULTIPACK_INVALID: Option[Int],
  INDEXED_PRODUCT_COUNT_LARGE_DELTA: Option[Int],
  ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE: Option[Int],
  OPTIONAL_PRODUCT_CATEGORY_MISSING: Option[Int],
  OPTIONAL_PRODUCT_CATEGORY_INVALID: Option[Int],
  OPTIONAL_CONDITION_MISSING: Option[Int],
  OPTIONAL_CONDITION_INVALID: Option[Int],
  IOS_DEEP_LINK_INVALID: Option[Int],
  ANDROID_DEEP_LINK_INVALID: Option[Int],
  UTM_SOURCE_AUTO_CORRECTED: Option[Int],
  COUNTRY_DOES_NOT_MAP_TO_CURRENCY: Option[Int],
  MIN_AD_PRICE_INVALID: Option[Int],
  GTIN_INVALID: Option[Int],
  INCONSISTENT_CURRENCY_VALUES: Option[Int],
  SALES_PRICE_TOO_LOW: Option[Int],
  SHIPPING_WIDTH_INVALID: Option[Int],
  SHIPPING_HEIGHT_INVALID: Option[Int],
  SALES_PRICE_TOO_HIGH: Option[Int],
  MPN_INVALID: Option[Int]
)

object CatalogsFeedValidationWarnings {
  implicit lazy val catalogsFeedValidationWarningsJsonFormat: Format[CatalogsFeedValidationWarnings] = Json.format[CatalogsFeedValidationWarnings]

  // noinspection TypeAnnotation
  object FETCHSAMESIGNATURE extends Enumeration {
    val _1 = Value("1")

    type FETCHSAMESIGNATURE = Value
    implicit lazy val FETCHSAMESIGNATUREJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

