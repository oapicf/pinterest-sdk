package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedValidationWarnings._

case class CatalogsFeedValidationWarnings (
  /* Some items have ad links that are formatted incorrectly. */
  AD_LINK_FORMAT_WARNING: Option[Integer],
/* Some items have ad link URLs that are duplicates of the link URLs for those items. */
  AD_LINK_SAME_AS_LINK: Option[Integer],
/* The title for some items were truncated because they contain too many characters. */
  TITLE_LENGTH_TOO_LONG: Option[Integer],
/* The description for some items were truncated because they contain too many characters. */
  DESCRIPTION_LENGTH_TOO_LONG: Option[Integer],
/* Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. */
  GENDER_INVALID: Option[Integer],
/* Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. */
  AGE_GROUP_INVALID: Option[Integer],
/* Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. */
  SIZE_TYPE_INVALID: Option[Integer],
/* Some items have size system values which are not one of the supported size systems. */
  SIZE_SYSTEM_INVALID: Option[Integer],
/* Some items have an invalid product link which contains invalid UTM tracking paramaters. */
  LINK_FORMAT_WARNING: Option[Integer],
/* Some items have sale price values that are higher than the original price of the item. */
  SALES_PRICE_INVALID: Option[Integer],
/* Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences. */
  PRODUCT_CATEGORY_DEPTH_WARNING: Option[Integer],
/* Some items have adwords_redirect links that are formatted incorrectly. */
  ADWORDS_FORMAT_WARNING: Option[Integer],
/* Some items have adwords_redirect URLs that are duplicates of the link URLs for those items. */
  ADWORDS_SAME_AS_LINK: Option[Integer],
/* Your feed contains duplicate headers. */
  DUPLICATE_HEADERS: Option[Integer],
/* Ingestion completed early because there are no changes to your feed since the last successful update. */
  FETCH_SAME_SIGNATURE: Option[FETCHSAMESIGNATURE],
/* Some items have additional_image_link URLs that contain too many characters, so those items will not be published. */
  ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG: Option[Integer],
/* Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items. */
  ADDITIONAL_IMAGE_LINK_WARNING: Option[Integer],
/* Some items have image_link URLs that are formatted incorrectly and will not be published with those items. */
  IMAGE_LINK_WARNING: Option[Integer],
/* Some items have shipping values that are formatted incorrectly. */
  SHIPPING_INVALID: Option[Integer],
/* Some items have tax values that are formatted incorrectly. */
  TAX_INVALID: Option[Integer],
/* Some items have invalid shipping_weight values. */
  SHIPPING_WEIGHT_INVALID: Option[Integer],
/* Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date. */
  EXPIRATION_DATE_INVALID: Option[Integer],
/* Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date. */
  AVAILABILITY_DATE_INVALID: Option[Integer],
/* Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date. */
  SALE_DATE_INVALID: Option[Integer],
/* Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit. */
  WEIGHT_UNIT_INVALID: Option[Integer],
/* Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products. */
  IS_BUNDLE_INVALID: Option[Integer],
/* Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time. */
  UPDATED_TIME_INVALID: Option[Integer],
/* Some items have custom_label values that are too long, those items will be published without that custom label. */
  CUSTOM_LABEL_LENGTH_TOO_LONG: Option[Integer],
/* Some items have product_type values that are too long, those items will be published without that product type. */
  PRODUCT_TYPE_LENGTH_TOO_LONG: Option[Integer],
/* Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images. */
  TOO_MANY_ADDITIONAL_IMAGE_LINKS: Option[Integer],
/* Some items have invalid multipack values. */
  MULTIPACK_INVALID: Option[Integer],
/* The product count has increased or decreased significantly compared to the last successful ingestion. */
  INDEXED_PRODUCT_COUNT_LARGE_DELTA: Option[Integer],
/* Some items include additional_image_links that can't be found. */
  ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE: Option[Integer],
/* Some items are missing a google_product_category. */
  OPTIONAL_PRODUCT_CATEGORY_MISSING: Option[Integer],
/* Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy. */
  OPTIONAL_PRODUCT_CATEGORY_INVALID: Option[Integer],
/* Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences. */
  OPTIONAL_CONDITION_MISSING: Option[Integer],
/* Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. */
  OPTIONAL_CONDITION_INVALID: Option[Integer],
/* Some items include invalid ios_deep_link values. */
  IOS_DEEP_LINK_INVALID: Option[Integer],
/* Some items include invalid android_deep_link. */
  ANDROID_DEEP_LINK_INVALID: Option[Integer],
/* Some items include utm_source values that are formatted incorrectly and have been automatically corrected. */
  UTM_SOURCE_AUTO_CORRECTED: Option[Integer],
/* Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped. */
  COUNTRY_DOES_NOT_MAP_TO_CURRENCY: Option[Integer],
/* Some items include min_ad_price values that are formatted incorrectly. */
  MIN_AD_PRICE_INVALID: Option[Integer],
/* Some items include incorrectly formatted GTINs. */
  GTIN_INVALID: Option[Integer],
/* Some items include inconsistent currencies in price fields. */
  INCONSISTENT_CURRENCY_VALUES: Option[Integer],
/* Some items include sales price that is much lower than the list price. */
  SALES_PRICE_TOO_LOW: Option[Integer],
/* Some items include incorrectly formatted shipping_width. */
  SHIPPING_WIDTH_INVALID: Option[Integer],
/* Some items include incorrectly formatted shipping_height. */
  SHIPPING_HEIGHT_INVALID: Option[Integer],
/* Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price. */
  SALES_PRICE_TOO_HIGH: Option[Integer],
/* Some items include incorrectly formatted MPNs. */
  MPN_INVALID: Option[Integer])

object CatalogsFeedValidationWarnings {
  import DateTimeCodecs._
  sealed trait FETCHSAMESIGNATURE
  case object `1` extends FETCHSAMESIGNATURE

  object FETCHSAMESIGNATURE {
    def toFETCHSAMESIGNATURE(s: String): Option[FETCHSAMESIGNATURE] = s match {
      case "`1`" => Some(`1`)
      case _ => None
    }

    def fromFETCHSAMESIGNATURE(x: FETCHSAMESIGNATURE): String = x match {
      case `1` => "`1`"
    }
  }

  implicit val FETCHSAMESIGNATUREEnumEncoder: EncodeJson[FETCHSAMESIGNATURE] =
    EncodeJson[FETCHSAMESIGNATURE](is => StringEncodeJson(FETCHSAMESIGNATURE.fromFETCHSAMESIGNATURE(is)))

  implicit val FETCHSAMESIGNATUREEnumDecoder: DecodeJson[FETCHSAMESIGNATURE] =
    DecodeJson.optionDecoder[FETCHSAMESIGNATURE](n => n.string.flatMap(jStr => FETCHSAMESIGNATURE.toFETCHSAMESIGNATURE(jStr)), "FETCHSAMESIGNATURE failed to de-serialize")

  implicit val CatalogsFeedValidationWarningsCodecJson: CodecJson[CatalogsFeedValidationWarnings] = CodecJson.derive[CatalogsFeedValidationWarnings]
  implicit val CatalogsFeedValidationWarningsDecoder: EntityDecoder[CatalogsFeedValidationWarnings] = jsonOf[CatalogsFeedValidationWarnings]
  implicit val CatalogsFeedValidationWarningsEncoder: EntityEncoder[CatalogsFeedValidationWarnings] = jsonEncoderOf[CatalogsFeedValidationWarnings]
}
