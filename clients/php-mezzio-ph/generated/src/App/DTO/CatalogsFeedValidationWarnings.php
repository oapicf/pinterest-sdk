<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsFeedValidationWarnings
{
    /**
     * Some items have ad links that are formatted incorrectly.
     * @DTA\Data(field="AD_LINK_FORMAT_WARNING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_link_format_warning;

    /**
     * Some items have ad link URLs that are duplicates of the link URLs for those items.
     * @DTA\Data(field="AD_LINK_SAME_AS_LINK", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ad_link_same_as_link;

    /**
     * The title for some items were truncated because they contain too many characters.
     * @DTA\Data(field="TITLE_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $title_length_too_long;

    /**
     * The description for some items were truncated because they contain too many characters.
     * @DTA\Data(field="DESCRIPTION_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $description_length_too_long;

    /**
     * Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
     * @DTA\Data(field="GENDER_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $gender_invalid;

    /**
     * Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
     * @DTA\Data(field="AGE_GROUP_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $age_group_invalid;

    /**
     * Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
     * @DTA\Data(field="SIZE_TYPE_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $size_type_invalid;

    /**
     * Some items have size system values which are not one of the supported size systems.
     * @DTA\Data(field="SIZE_SYSTEM_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $size_system_invalid;

    /**
     * Some items have an invalid product link which contains invalid UTM tracking paramaters.
     * @DTA\Data(field="LINK_FORMAT_WARNING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $link_format_warning;

    /**
     * Some items have sale price values that are higher than the original price of the item.
     * @DTA\Data(field="SALES_PRICE_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $sales_price_invalid;

    /**
     * Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.
     * @DTA\Data(field="PRODUCT_CATEGORY_DEPTH_WARNING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $product_category_depth_warning;

    /**
     * Some items have adwords_redirect links that are formatted incorrectly.
     * @DTA\Data(field="ADWORDS_FORMAT_WARNING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $adwords_format_warning;

    /**
     * Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.
     * @DTA\Data(field="ADWORDS_SAME_AS_LINK", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $adwords_same_as_link;

    /**
     * Your feed contains duplicate headers.
     * @DTA\Data(field="DUPLICATE_HEADERS", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $duplicate_headers;

    /**
     * Ingestion completed early because there are no changes to your feed since the last successful update.
     * @DTA\Data(field="FETCH_SAME_SIGNATURE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $fetch_same_signature;

    /**
     * Some items have additional_image_link URLs that contain too many characters, so those items will not be published.
     * @DTA\Data(field="ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $additional_image_link_length_too_long;

    /**
     * Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.
     * @DTA\Data(field="ADDITIONAL_IMAGE_LINK_WARNING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $additional_image_link_warning;

    /**
     * Some items have image_link URLs that are formatted incorrectly and will not be published with those items.
     * @DTA\Data(field="IMAGE_LINK_WARNING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $image_link_warning;

    /**
     * Some items have shipping values that are formatted incorrectly.
     * @DTA\Data(field="SHIPPING_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $shipping_invalid;

    /**
     * Some items have tax values that are formatted incorrectly.
     * @DTA\Data(field="TAX_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $tax_invalid;

    /**
     * Some items have invalid shipping_weight values.
     * @DTA\Data(field="SHIPPING_WEIGHT_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $shipping_weight_invalid;

    /**
     * Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.
     * @DTA\Data(field="EXPIRATION_DATE_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $expiration_date_invalid;

    /**
     * Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.
     * @DTA\Data(field="AVAILABILITY_DATE_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $availability_date_invalid;

    /**
     * Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.
     * @DTA\Data(field="SALE_DATE_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $sale_date_invalid;

    /**
     * Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.
     * @DTA\Data(field="WEIGHT_UNIT_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $weight_unit_invalid;

    /**
     * Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.
     * @DTA\Data(field="IS_BUNDLE_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $is_bundle_invalid;

    /**
     * Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.
     * @DTA\Data(field="UPDATED_TIME_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $updated_time_invalid;

    /**
     * Some items have custom_label values that are too long, those items will be published without that custom label.
     * @DTA\Data(field="CUSTOM_LABEL_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $custom_label_length_too_long;

    /**
     * Some items have product_type values that are too long, those items will be published without that product type.
     * @DTA\Data(field="PRODUCT_TYPE_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $product_type_length_too_long;

    /**
     * Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.
     * @DTA\Data(field="TOO_MANY_ADDITIONAL_IMAGE_LINKS", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $too_many_additional_image_links;

    /**
     * Some items have invalid multipack values.
     * @DTA\Data(field="MULTIPACK_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $multipack_invalid;

    /**
     * The product count has increased or decreased significantly compared to the last successful ingestion.
     * @DTA\Data(field="INDEXED_PRODUCT_COUNT_LARGE_DELTA", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $indexed_product_count_large_delta;

    /**
     * Some items include additional_image_links that can&#39;t be found.
     * @DTA\Data(field="ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $item_additional_image_download_failure;

    /**
     * Some items are missing a google_product_category.
     * @DTA\Data(field="OPTIONAL_PRODUCT_CATEGORY_MISSING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $optional_product_category_missing;

    /**
     * Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.
     * @DTA\Data(field="OPTIONAL_PRODUCT_CATEGORY_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $optional_product_category_invalid;

    /**
     * Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.
     * @DTA\Data(field="OPTIONAL_CONDITION_MISSING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $optional_condition_missing;

    /**
     * Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
     * @DTA\Data(field="OPTIONAL_CONDITION_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $optional_condition_invalid;

    /**
     * Some items include invalid ios_deep_link values.
     * @DTA\Data(field="IOS_DEEP_LINK_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ios_deep_link_invalid;

    /**
     * Some items include invalid android_deep_link.
     * @DTA\Data(field="ANDROID_DEEP_LINK_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $android_deep_link_invalid;

    /**
     * Some items include utm_source values that are formatted incorrectly and have been automatically corrected.
     * @DTA\Data(field="UTM_SOURCE_AUTO_CORRECTED", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $utm_source_auto_corrected;

    /**
     * Some items include a currency that doesn&#39;t match the usual currency for the location where that product is sold or shipped.
     * @DTA\Data(field="COUNTRY_DOES_NOT_MAP_TO_CURRENCY", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $country_does_not_map_to_currency;

    /**
     * Some items include min_ad_price values that are formatted incorrectly.
     * @DTA\Data(field="MIN_AD_PRICE_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $min_ad_price_invalid;

    /**
     * Some items include incorrectly formatted GTINs.
     * @DTA\Data(field="GTIN_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $gtin_invalid;

    /**
     * Some items include inconsistent currencies in price fields.
     * @DTA\Data(field="INCONSISTENT_CURRENCY_VALUES", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $inconsistent_currency_values;

    /**
     * Some items include sales price that is much lower than the list price.
     * @DTA\Data(field="SALES_PRICE_TOO_LOW", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $sales_price_too_low;

    /**
     * Some items include incorrectly formatted shipping_width.
     * @DTA\Data(field="SHIPPING_WIDTH_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $shipping_width_invalid;

    /**
     * Some items include incorrectly formatted shipping_height.
     * @DTA\Data(field="SHIPPING_HEIGHT_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $shipping_height_invalid;

    /**
     * Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.
     * @DTA\Data(field="SALES_PRICE_TOO_HIGH", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $sales_price_too_high;

    /**
     * Some items include incorrectly formatted MPNs.
     * @DTA\Data(field="MPN_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $mpn_invalid;

}
