import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CatalogsFeedValidationWarnings
void main() {
  final instance = CatalogsFeedValidationWarningsBuilder();
  // TODO add properties to the builder and call build()

  group(CatalogsFeedValidationWarnings, () {
    // Some items have ad links that are formatted incorrectly.
    // int AD_LINK_FORMAT_WARNING
    test('to test the property `AD_LINK_FORMAT_WARNING`', () async {
      // TODO
    });

    // Some items have ad link URLs that are duplicates of the link URLs for those items.
    // int AD_LINK_SAME_AS_LINK
    test('to test the property `AD_LINK_SAME_AS_LINK`', () async {
      // TODO
    });

    // The title for some items were truncated because they contain too many characters.
    // int TITLE_LENGTH_TOO_LONG
    test('to test the property `TITLE_LENGTH_TOO_LONG`', () async {
      // TODO
    });

    // The description for some items were truncated because they contain too many characters.
    // int DESCRIPTION_LENGTH_TOO_LONG
    test('to test the property `DESCRIPTION_LENGTH_TOO_LONG`', () async {
      // TODO
    });

    // Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
    // int GENDER_INVALID
    test('to test the property `GENDER_INVALID`', () async {
      // TODO
    });

    // Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
    // int AGE_GROUP_INVALID
    test('to test the property `AGE_GROUP_INVALID`', () async {
      // TODO
    });

    // Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
    // int SIZE_TYPE_INVALID
    test('to test the property `SIZE_TYPE_INVALID`', () async {
      // TODO
    });

    // Some items have size system values which are not one of the supported size systems.
    // int SIZE_SYSTEM_INVALID
    test('to test the property `SIZE_SYSTEM_INVALID`', () async {
      // TODO
    });

    // Some items have an invalid product link which contains invalid UTM tracking paramaters.
    // int LINK_FORMAT_WARNING
    test('to test the property `LINK_FORMAT_WARNING`', () async {
      // TODO
    });

    // Some items have sale price values that are higher than the original price of the item.
    // int SALES_PRICE_INVALID
    test('to test the property `SALES_PRICE_INVALID`', () async {
      // TODO
    });

    // Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.
    // int PRODUCT_CATEGORY_DEPTH_WARNING
    test('to test the property `PRODUCT_CATEGORY_DEPTH_WARNING`', () async {
      // TODO
    });

    // Some items have adwords_redirect links that are formatted incorrectly.
    // int ADWORDS_FORMAT_WARNING
    test('to test the property `ADWORDS_FORMAT_WARNING`', () async {
      // TODO
    });

    // Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.
    // int ADWORDS_SAME_AS_LINK
    test('to test the property `ADWORDS_SAME_AS_LINK`', () async {
      // TODO
    });

    // Your feed contains duplicate headers.
    // int DUPLICATE_HEADERS
    test('to test the property `DUPLICATE_HEADERS`', () async {
      // TODO
    });

    // Ingestion completed early because there are no changes to your feed since the last successful update.
    // int FETCH_SAME_SIGNATURE
    test('to test the property `FETCH_SAME_SIGNATURE`', () async {
      // TODO
    });

    // Some items have additional_image_link URLs that contain too many characters, so those items will not be published.
    // int ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG
    test('to test the property `ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG`', () async {
      // TODO
    });

    // Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.
    // int ADDITIONAL_IMAGE_LINK_WARNING
    test('to test the property `ADDITIONAL_IMAGE_LINK_WARNING`', () async {
      // TODO
    });

    // Some items have image_link URLs that are formatted incorrectly and will not be published with those items.
    // int IMAGE_LINK_WARNING
    test('to test the property `IMAGE_LINK_WARNING`', () async {
      // TODO
    });

    // Some items have shipping values that are formatted incorrectly.
    // int SHIPPING_INVALID
    test('to test the property `SHIPPING_INVALID`', () async {
      // TODO
    });

    // Some items have tax values that are formatted incorrectly.
    // int TAX_INVALID
    test('to test the property `TAX_INVALID`', () async {
      // TODO
    });

    // Some items have invalid shipping_weight values.
    // int SHIPPING_WEIGHT_INVALID
    test('to test the property `SHIPPING_WEIGHT_INVALID`', () async {
      // TODO
    });

    // Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.
    // int EXPIRATION_DATE_INVALID
    test('to test the property `EXPIRATION_DATE_INVALID`', () async {
      // TODO
    });

    // Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.
    // int AVAILABILITY_DATE_INVALID
    test('to test the property `AVAILABILITY_DATE_INVALID`', () async {
      // TODO
    });

    // Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.
    // int SALE_DATE_INVALID
    test('to test the property `SALE_DATE_INVALID`', () async {
      // TODO
    });

    // Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.
    // int WEIGHT_UNIT_INVALID
    test('to test the property `WEIGHT_UNIT_INVALID`', () async {
      // TODO
    });

    // Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.
    // int IS_BUNDLE_INVALID
    test('to test the property `IS_BUNDLE_INVALID`', () async {
      // TODO
    });

    // Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.
    // int UPDATED_TIME_INVALID
    test('to test the property `UPDATED_TIME_INVALID`', () async {
      // TODO
    });

    // Some items have custom_label values that are too long, those items will be published without that custom label.
    // int CUSTOM_LABEL_LENGTH_TOO_LONG
    test('to test the property `CUSTOM_LABEL_LENGTH_TOO_LONG`', () async {
      // TODO
    });

    // Some items have product_type values that are too long, those items will be published without that product type.
    // int PRODUCT_TYPE_LENGTH_TOO_LONG
    test('to test the property `PRODUCT_TYPE_LENGTH_TOO_LONG`', () async {
      // TODO
    });

    // Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.
    // int TOO_MANY_ADDITIONAL_IMAGE_LINKS
    test('to test the property `TOO_MANY_ADDITIONAL_IMAGE_LINKS`', () async {
      // TODO
    });

    // Some items have invalid multipack values.
    // int MULTIPACK_INVALID
    test('to test the property `MULTIPACK_INVALID`', () async {
      // TODO
    });

    // The product count has increased or decreased significantly compared to the last successful ingestion.
    // int INDEXED_PRODUCT_COUNT_LARGE_DELTA
    test('to test the property `INDEXED_PRODUCT_COUNT_LARGE_DELTA`', () async {
      // TODO
    });

    // Some items include additional_image_links that can't be found.
    // int ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE
    test('to test the property `ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE`', () async {
      // TODO
    });

    // Some items are missing a google_product_category.
    // int OPTIONAL_PRODUCT_CATEGORY_MISSING
    test('to test the property `OPTIONAL_PRODUCT_CATEGORY_MISSING`', () async {
      // TODO
    });

    // Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.
    // int OPTIONAL_PRODUCT_CATEGORY_INVALID
    test('to test the property `OPTIONAL_PRODUCT_CATEGORY_INVALID`', () async {
      // TODO
    });

    // Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.
    // int OPTIONAL_CONDITION_MISSING
    test('to test the property `OPTIONAL_CONDITION_MISSING`', () async {
      // TODO
    });

    // Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
    // int OPTIONAL_CONDITION_INVALID
    test('to test the property `OPTIONAL_CONDITION_INVALID`', () async {
      // TODO
    });

    // Some items include invalid ios_deep_link values.
    // int IOS_DEEP_LINK_INVALID
    test('to test the property `IOS_DEEP_LINK_INVALID`', () async {
      // TODO
    });

    // Some items include invalid android_deep_link.
    // int ANDROID_DEEP_LINK_INVALID
    test('to test the property `ANDROID_DEEP_LINK_INVALID`', () async {
      // TODO
    });

    // Some items include utm_source values that are formatted incorrectly and have been automatically corrected.
    // int UTM_SOURCE_AUTO_CORRECTED
    test('to test the property `UTM_SOURCE_AUTO_CORRECTED`', () async {
      // TODO
    });

    // Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.
    // int COUNTRY_DOES_NOT_MAP_TO_CURRENCY
    test('to test the property `COUNTRY_DOES_NOT_MAP_TO_CURRENCY`', () async {
      // TODO
    });

    // Some items include min_ad_price values that are formatted incorrectly.
    // int MIN_AD_PRICE_INVALID
    test('to test the property `MIN_AD_PRICE_INVALID`', () async {
      // TODO
    });

    // Some items include incorrectly formatted GTINs.
    // int GTIN_INVALID
    test('to test the property `GTIN_INVALID`', () async {
      // TODO
    });

    // Some items include inconsistent currencies in price fields.
    // int INCONSISTENT_CURRENCY_VALUES
    test('to test the property `INCONSISTENT_CURRENCY_VALUES`', () async {
      // TODO
    });

    // Some items include sales price that is much lower than the list price.
    // int SALES_PRICE_TOO_LOW
    test('to test the property `SALES_PRICE_TOO_LOW`', () async {
      // TODO
    });

    // Some items include incorrectly formatted shipping_width.
    // int SHIPPING_WIDTH_INVALID
    test('to test the property `SHIPPING_WIDTH_INVALID`', () async {
      // TODO
    });

    // Some items include incorrectly formatted shipping_height.
    // int SHIPPING_HEIGHT_INVALID
    test('to test the property `SHIPPING_HEIGHT_INVALID`', () async {
      // TODO
    });

    // Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.
    // int SALES_PRICE_TOO_HIGH
    test('to test the property `SALES_PRICE_TOO_HIGH`', () async {
      // TODO
    });

    // Some items include incorrectly formatted MPNs.
    // int MPN_INVALID
    test('to test the property `MPN_INVALID`', () async {
      // TODO
    });

  });
}
