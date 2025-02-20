/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CatalogsFeedValidationWarnings {
    /// Some items have ad links that are formatted incorrectly.
    #[serde(rename = "AD_LINK_FORMAT_WARNING", skip_serializing_if = "Option::is_none")]
    pub ad_link_format_warning: Option<i32>,
    /// Some items have ad link URLs that are duplicates of the link URLs for those items.
    #[serde(rename = "AD_LINK_SAME_AS_LINK", skip_serializing_if = "Option::is_none")]
    pub ad_link_same_as_link: Option<i32>,
    /// The title for some items were truncated because they contain too many characters.
    #[serde(rename = "TITLE_LENGTH_TOO_LONG", skip_serializing_if = "Option::is_none")]
    pub title_length_too_long: Option<i32>,
    /// The description for some items were truncated because they contain too many characters.
    #[serde(rename = "DESCRIPTION_LENGTH_TOO_LONG", skip_serializing_if = "Option::is_none")]
    pub description_length_too_long: Option<i32>,
    /// Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
    #[serde(rename = "GENDER_INVALID", skip_serializing_if = "Option::is_none")]
    pub gender_invalid: Option<i32>,
    /// Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
    #[serde(rename = "AGE_GROUP_INVALID", skip_serializing_if = "Option::is_none")]
    pub age_group_invalid: Option<i32>,
    /// Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
    #[serde(rename = "SIZE_TYPE_INVALID", skip_serializing_if = "Option::is_none")]
    pub size_type_invalid: Option<i32>,
    /// Some items have size system values which are not one of the supported size systems.
    #[serde(rename = "SIZE_SYSTEM_INVALID", skip_serializing_if = "Option::is_none")]
    pub size_system_invalid: Option<i32>,
    /// Some items have an invalid product link which contains invalid UTM tracking paramaters.
    #[serde(rename = "LINK_FORMAT_WARNING", skip_serializing_if = "Option::is_none")]
    pub link_format_warning: Option<i32>,
    /// Some items have sale price values that are higher than the original price of the item.
    #[serde(rename = "SALES_PRICE_INVALID", skip_serializing_if = "Option::is_none")]
    pub sales_price_invalid: Option<i32>,
    /// Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.
    #[serde(rename = "PRODUCT_CATEGORY_DEPTH_WARNING", skip_serializing_if = "Option::is_none")]
    pub product_category_depth_warning: Option<i32>,
    /// Some items have adwords_redirect links that are formatted incorrectly.
    #[serde(rename = "ADWORDS_FORMAT_WARNING", skip_serializing_if = "Option::is_none")]
    pub adwords_format_warning: Option<i32>,
    /// Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.
    #[serde(rename = "ADWORDS_SAME_AS_LINK", skip_serializing_if = "Option::is_none")]
    pub adwords_same_as_link: Option<i32>,
    /// Your feed contains duplicate headers.
    #[serde(rename = "DUPLICATE_HEADERS", skip_serializing_if = "Option::is_none")]
    pub duplicate_headers: Option<i32>,
    /// Ingestion completed early because there are no changes to your feed since the last successful update.
    #[serde(rename = "FETCH_SAME_SIGNATURE", skip_serializing_if = "Option::is_none")]
    pub fetch_same_signature: Option<FetchSameSignature>,
    /// Some items have additional_image_link URLs that contain too many characters, so those items will not be published.
    #[serde(rename = "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG", skip_serializing_if = "Option::is_none")]
    pub additional_image_link_length_too_long: Option<i32>,
    /// Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.
    #[serde(rename = "ADDITIONAL_IMAGE_LINK_WARNING", skip_serializing_if = "Option::is_none")]
    pub additional_image_link_warning: Option<i32>,
    /// Some items have image_link URLs that are formatted incorrectly and will not be published with those items.
    #[serde(rename = "IMAGE_LINK_WARNING", skip_serializing_if = "Option::is_none")]
    pub image_link_warning: Option<i32>,
    /// Some items have shipping values that are formatted incorrectly.
    #[serde(rename = "SHIPPING_INVALID", skip_serializing_if = "Option::is_none")]
    pub shipping_invalid: Option<i32>,
    /// Some items have tax values that are formatted incorrectly.
    #[serde(rename = "TAX_INVALID", skip_serializing_if = "Option::is_none")]
    pub tax_invalid: Option<i32>,
    /// Some items have invalid shipping_weight values.
    #[serde(rename = "SHIPPING_WEIGHT_INVALID", skip_serializing_if = "Option::is_none")]
    pub shipping_weight_invalid: Option<i32>,
    /// Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.
    #[serde(rename = "EXPIRATION_DATE_INVALID", skip_serializing_if = "Option::is_none")]
    pub expiration_date_invalid: Option<i32>,
    /// Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.
    #[serde(rename = "AVAILABILITY_DATE_INVALID", skip_serializing_if = "Option::is_none")]
    pub availability_date_invalid: Option<i32>,
    /// Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.
    #[serde(rename = "SALE_DATE_INVALID", skip_serializing_if = "Option::is_none")]
    pub sale_date_invalid: Option<i32>,
    /// Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.
    #[serde(rename = "WEIGHT_UNIT_INVALID", skip_serializing_if = "Option::is_none")]
    pub weight_unit_invalid: Option<i32>,
    /// Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.
    #[serde(rename = "IS_BUNDLE_INVALID", skip_serializing_if = "Option::is_none")]
    pub is_bundle_invalid: Option<i32>,
    /// Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.
    #[serde(rename = "UPDATED_TIME_INVALID", skip_serializing_if = "Option::is_none")]
    pub updated_time_invalid: Option<i32>,
    /// Some items have custom_label values that are too long, those items will be published without that custom label.
    #[serde(rename = "CUSTOM_LABEL_LENGTH_TOO_LONG", skip_serializing_if = "Option::is_none")]
    pub custom_label_length_too_long: Option<i32>,
    /// Some items have product_type values that are too long, those items will be published without that product type.
    #[serde(rename = "PRODUCT_TYPE_LENGTH_TOO_LONG", skip_serializing_if = "Option::is_none")]
    pub product_type_length_too_long: Option<i32>,
    /// Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.
    #[serde(rename = "TOO_MANY_ADDITIONAL_IMAGE_LINKS", skip_serializing_if = "Option::is_none")]
    pub too_many_additional_image_links: Option<i32>,
    /// Some items have invalid multipack values.
    #[serde(rename = "MULTIPACK_INVALID", skip_serializing_if = "Option::is_none")]
    pub multipack_invalid: Option<i32>,
    /// The product count has increased or decreased significantly compared to the last successful ingestion.
    #[serde(rename = "INDEXED_PRODUCT_COUNT_LARGE_DELTA", skip_serializing_if = "Option::is_none")]
    pub indexed_product_count_large_delta: Option<i32>,
    /// Some items include additional_image_links that can't be found.
    #[serde(rename = "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE", skip_serializing_if = "Option::is_none")]
    pub item_additional_image_download_failure: Option<i32>,
    /// Some items are missing a google_product_category.
    #[serde(rename = "OPTIONAL_PRODUCT_CATEGORY_MISSING", skip_serializing_if = "Option::is_none")]
    pub optional_product_category_missing: Option<i32>,
    /// Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.
    #[serde(rename = "OPTIONAL_PRODUCT_CATEGORY_INVALID", skip_serializing_if = "Option::is_none")]
    pub optional_product_category_invalid: Option<i32>,
    /// Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.
    #[serde(rename = "OPTIONAL_CONDITION_MISSING", skip_serializing_if = "Option::is_none")]
    pub optional_condition_missing: Option<i32>,
    /// Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
    #[serde(rename = "OPTIONAL_CONDITION_INVALID", skip_serializing_if = "Option::is_none")]
    pub optional_condition_invalid: Option<i32>,
    /// Some items include invalid ios_deep_link values.
    #[serde(rename = "IOS_DEEP_LINK_INVALID", skip_serializing_if = "Option::is_none")]
    pub ios_deep_link_invalid: Option<i32>,
    /// Some items include invalid android_deep_link.
    #[serde(rename = "ANDROID_DEEP_LINK_INVALID", skip_serializing_if = "Option::is_none")]
    pub android_deep_link_invalid: Option<i32>,
    /// Some items include utm_source values that are formatted incorrectly and have been automatically corrected.
    #[serde(rename = "UTM_SOURCE_AUTO_CORRECTED", skip_serializing_if = "Option::is_none")]
    pub utm_source_auto_corrected: Option<i32>,
    /// Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.
    #[serde(rename = "COUNTRY_DOES_NOT_MAP_TO_CURRENCY", skip_serializing_if = "Option::is_none")]
    pub country_does_not_map_to_currency: Option<i32>,
    /// Some items include min_ad_price values that are formatted incorrectly.
    #[serde(rename = "MIN_AD_PRICE_INVALID", skip_serializing_if = "Option::is_none")]
    pub min_ad_price_invalid: Option<i32>,
    /// Some items include incorrectly formatted GTINs.
    #[serde(rename = "GTIN_INVALID", skip_serializing_if = "Option::is_none")]
    pub gtin_invalid: Option<i32>,
    /// Some items include inconsistent currencies in price fields.
    #[serde(rename = "INCONSISTENT_CURRENCY_VALUES", skip_serializing_if = "Option::is_none")]
    pub inconsistent_currency_values: Option<i32>,
    /// Some items include sales price that is much lower than the list price.
    #[serde(rename = "SALES_PRICE_TOO_LOW", skip_serializing_if = "Option::is_none")]
    pub sales_price_too_low: Option<i32>,
    /// Some items include incorrectly formatted shipping_width.
    #[serde(rename = "SHIPPING_WIDTH_INVALID", skip_serializing_if = "Option::is_none")]
    pub shipping_width_invalid: Option<i32>,
    /// Some items include incorrectly formatted shipping_height.
    #[serde(rename = "SHIPPING_HEIGHT_INVALID", skip_serializing_if = "Option::is_none")]
    pub shipping_height_invalid: Option<i32>,
    /// Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.
    #[serde(rename = "SALES_PRICE_TOO_HIGH", skip_serializing_if = "Option::is_none")]
    pub sales_price_too_high: Option<i32>,
    /// Some items include incorrectly formatted MPNs.
    #[serde(rename = "MPN_INVALID", skip_serializing_if = "Option::is_none")]
    pub mpn_invalid: Option<i32>,
}

impl CatalogsFeedValidationWarnings {
    pub fn new() -> CatalogsFeedValidationWarnings {
        CatalogsFeedValidationWarnings {
            ad_link_format_warning: None,
            ad_link_same_as_link: None,
            title_length_too_long: None,
            description_length_too_long: None,
            gender_invalid: None,
            age_group_invalid: None,
            size_type_invalid: None,
            size_system_invalid: None,
            link_format_warning: None,
            sales_price_invalid: None,
            product_category_depth_warning: None,
            adwords_format_warning: None,
            adwords_same_as_link: None,
            duplicate_headers: None,
            fetch_same_signature: None,
            additional_image_link_length_too_long: None,
            additional_image_link_warning: None,
            image_link_warning: None,
            shipping_invalid: None,
            tax_invalid: None,
            shipping_weight_invalid: None,
            expiration_date_invalid: None,
            availability_date_invalid: None,
            sale_date_invalid: None,
            weight_unit_invalid: None,
            is_bundle_invalid: None,
            updated_time_invalid: None,
            custom_label_length_too_long: None,
            product_type_length_too_long: None,
            too_many_additional_image_links: None,
            multipack_invalid: None,
            indexed_product_count_large_delta: None,
            item_additional_image_download_failure: None,
            optional_product_category_missing: None,
            optional_product_category_invalid: None,
            optional_condition_missing: None,
            optional_condition_invalid: None,
            ios_deep_link_invalid: None,
            android_deep_link_invalid: None,
            utm_source_auto_corrected: None,
            country_does_not_map_to_currency: None,
            min_ad_price_invalid: None,
            gtin_invalid: None,
            inconsistent_currency_values: None,
            sales_price_too_low: None,
            shipping_width_invalid: None,
            shipping_height_invalid: None,
            sales_price_too_high: None,
            mpn_invalid: None,
        }
    }
}
/// Ingestion completed early because there are no changes to your feed since the last successful update.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum FetchSameSignature {
    #[serde(rename = "1")]
    Variant1,
}

impl Default for FetchSameSignature {
    fn default() -> FetchSameSignature {
        Self::Variant1
    }
}

