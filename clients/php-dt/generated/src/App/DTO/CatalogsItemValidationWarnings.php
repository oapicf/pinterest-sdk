<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsItemValidationWarnings
{
    /**
     * @DTA\Data(field="AD_LINK_FORMAT_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_link_format_warning = null;

    /**
     * @DTA\Data(field="AD_LINK_SAME_AS_LINK", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ad_link_same_as_link = null;

    /**
     * @DTA\Data(field="ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $additional_image_link_length_too_long = null;

    /**
     * @DTA\Data(field="ADDITIONAL_IMAGE_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $additional_image_link_warning = null;

    /**
     * @DTA\Data(field="ADWORDS_FORMAT_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $adwords_format_warning = null;

    /**
     * @DTA\Data(field="ADWORDS_SAME_AS_LINK", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $adwords_same_as_link = null;

    /**
     * @DTA\Data(field="AGE_GROUP_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $age_group_invalid = null;

    /**
     * @DTA\Data(field="SIZE_SYSTEM_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $size_system_invalid = null;

    /**
     * @DTA\Data(field="ANDROID_DEEP_LINK_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $android_deep_link_invalid = null;

    /**
     * @DTA\Data(field="AVAILABILITY_DATE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $availability_date_invalid = null;

    /**
     * @DTA\Data(field="COUNTRY_DOES_NOT_MAP_TO_CURRENCY", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $country_does_not_map_to_currency = null;

    /**
     * @DTA\Data(field="CUSTOM_LABEL_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $custom_label_length_too_long = null;

    /**
     * @DTA\Data(field="DESCRIPTION_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $description_length_too_long = null;

    /**
     * @DTA\Data(field="EXPIRATION_DATE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $expiration_date_invalid = null;

    /**
     * @DTA\Data(field="GENDER_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $gender_invalid = null;

    /**
     * @DTA\Data(field="GTIN_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $gtin_invalid = null;

    /**
     * @DTA\Data(field="IMAGE_LINK_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $image_link_warning = null;

    /**
     * @DTA\Data(field="IOS_DEEP_LINK_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $ios_deep_link_invalid = null;

    /**
     * @DTA\Data(field="IS_BUNDLE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $is_bundle_invalid = null;

    /**
     * @DTA\Data(field="ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $item_additional_image_download_failure = null;

    /**
     * @DTA\Data(field="LINK_FORMAT_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $link_format_warning = null;

    /**
     * @DTA\Data(field="MIN_AD_PRICE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $min_ad_price_invalid = null;

    /**
     * @DTA\Data(field="MPN_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $mpn_invalid = null;

    /**
     * @DTA\Data(field="MULTIPACK_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $multipack_invalid = null;

    /**
     * @DTA\Data(field="OPTIONAL_CONDITION_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $optional_condition_invalid = null;

    /**
     * @DTA\Data(field="OPTIONAL_CONDITION_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $optional_condition_missing = null;

    /**
     * @DTA\Data(field="OPTIONAL_PRODUCT_CATEGORY_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $optional_product_category_invalid = null;

    /**
     * @DTA\Data(field="OPTIONAL_PRODUCT_CATEGORY_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $optional_product_category_missing = null;

    /**
     * @DTA\Data(field="PRODUCT_CATEGORY_DEPTH_WARNING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $product_category_depth_warning = null;

    /**
     * @DTA\Data(field="PRODUCT_TYPE_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $product_type_length_too_long = null;

    /**
     * @DTA\Data(field="SALES_PRICE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $sales_price_invalid = null;

    /**
     * @DTA\Data(field="SALES_PRICE_TOO_LOW", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $sales_price_too_low = null;

    /**
     * @DTA\Data(field="SALES_PRICE_TOO_HIGH", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $sales_price_too_high = null;

    /**
     * @DTA\Data(field="SALE_DATE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $sale_date_invalid = null;

    /**
     * @DTA\Data(field="SHIPPING_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $shipping_invalid = null;

    /**
     * @DTA\Data(field="SHIPPING_HEIGHT_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $shipping_height_invalid = null;

    /**
     * @DTA\Data(field="SHIPPING_WEIGHT_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $shipping_weight_invalid = null;

    /**
     * @DTA\Data(field="SHIPPING_WIDTH_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $shipping_width_invalid = null;

    /**
     * @DTA\Data(field="SIZE_TYPE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $size_type_invalid = null;

    /**
     * @DTA\Data(field="TAX_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $tax_invalid = null;

    /**
     * @DTA\Data(field="TITLE_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $title_length_too_long = null;

    /**
     * @DTA\Data(field="TOO_MANY_ADDITIONAL_IMAGE_LINKS", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $too_many_additional_image_links = null;

    /**
     * @DTA\Data(field="UTM_SOURCE_AUTO_CORRECTED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $utm_source_auto_corrected = null;

    /**
     * @DTA\Data(field="WEIGHT_UNIT_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $weight_unit_invalid = null;

}
