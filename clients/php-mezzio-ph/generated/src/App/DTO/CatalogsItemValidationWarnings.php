<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsItemValidationWarnings
{
    /**
     * @DTA\Data(field="AD_LINK_FORMAT_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $ad_link_format_warning;

    /**
     * @DTA\Data(field="AD_LINK_SAME_AS_LINK", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $ad_link_same_as_link;

    /**
     * @DTA\Data(field="ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $additional_image_link_length_too_long;

    /**
     * @DTA\Data(field="ADDITIONAL_IMAGE_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $additional_image_link_warning;

    /**
     * @DTA\Data(field="ADWORDS_FORMAT_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $adwords_format_warning;

    /**
     * @DTA\Data(field="ADWORDS_SAME_AS_LINK", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $adwords_same_as_link;

    /**
     * @DTA\Data(field="AGE_GROUP_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $age_group_invalid;

    /**
     * @DTA\Data(field="SIZE_SYSTEM_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $size_system_invalid;

    /**
     * @DTA\Data(field="ANDROID_DEEP_LINK_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $android_deep_link_invalid;

    /**
     * @DTA\Data(field="AVAILABILITY_DATE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $availability_date_invalid;

    /**
     * @DTA\Data(field="COUNTRY_DOES_NOT_MAP_TO_CURRENCY", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $country_does_not_map_to_currency;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $custom_label_length_too_long;

    /**
     * @DTA\Data(field="DESCRIPTION_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $description_length_too_long;

    /**
     * @DTA\Data(field="EXPIRATION_DATE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $expiration_date_invalid;

    /**
     * @DTA\Data(field="GENDER_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $gender_invalid;

    /**
     * @DTA\Data(field="GTIN_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $gtin_invalid;

    /**
     * @DTA\Data(field="IMAGE_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $image_link_warning;

    /**
     * @DTA\Data(field="IOS_DEEP_LINK_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $ios_deep_link_invalid;

    /**
     * @DTA\Data(field="IS_BUNDLE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $is_bundle_invalid;

    /**
     * @DTA\Data(field="ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $item_additional_image_download_failure;

    /**
     * @DTA\Data(field="LINK_FORMAT_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $link_format_warning;

    /**
     * @DTA\Data(field="MIN_AD_PRICE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $min_ad_price_invalid;

    /**
     * @DTA\Data(field="MPN_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $mpn_invalid;

    /**
     * @DTA\Data(field="MULTIPACK_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $multipack_invalid;

    /**
     * @DTA\Data(field="OPTIONAL_CONDITION_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $optional_condition_invalid;

    /**
     * @DTA\Data(field="OPTIONAL_CONDITION_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $optional_condition_missing;

    /**
     * @DTA\Data(field="OPTIONAL_PRODUCT_CATEGORY_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $optional_product_category_invalid;

    /**
     * @DTA\Data(field="OPTIONAL_PRODUCT_CATEGORY_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $optional_product_category_missing;

    /**
     * @DTA\Data(field="PRODUCT_CATEGORY_DEPTH_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $product_category_depth_warning;

    /**
     * @DTA\Data(field="PRODUCT_TYPE_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $product_type_length_too_long;

    /**
     * @DTA\Data(field="SALES_PRICE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $sales_price_invalid;

    /**
     * @DTA\Data(field="SALES_PRICE_TOO_LOW", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $sales_price_too_low;

    /**
     * @DTA\Data(field="SALES_PRICE_TOO_HIGH", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $sales_price_too_high;

    /**
     * @DTA\Data(field="SALE_DATE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $sale_date_invalid;

    /**
     * @DTA\Data(field="SHIPPING_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $shipping_invalid;

    /**
     * @DTA\Data(field="SHIPPING_HEIGHT_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $shipping_height_invalid;

    /**
     * @DTA\Data(field="SHIPPING_WEIGHT_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $shipping_weight_invalid;

    /**
     * @DTA\Data(field="SHIPPING_WIDTH_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $shipping_width_invalid;

    /**
     * @DTA\Data(field="SIZE_TYPE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $size_type_invalid;

    /**
     * @DTA\Data(field="TAX_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $tax_invalid;

    /**
     * @DTA\Data(field="TITLE_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $title_length_too_long;

    /**
     * @DTA\Data(field="TOO_MANY_ADDITIONAL_IMAGE_LINKS", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $too_many_additional_image_links;

    /**
     * @DTA\Data(field="UTM_SOURCE_AUTO_CORRECTED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $utm_source_auto_corrected;

    /**
     * @DTA\Data(field="WEIGHT_UNIT_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $weight_unit_invalid;

}
