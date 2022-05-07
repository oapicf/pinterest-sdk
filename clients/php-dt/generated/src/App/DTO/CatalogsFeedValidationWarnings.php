<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsFeedValidationWarnings
{
    /**
     * @DTA\Data(field="title_length_too_long", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $title_length_too_long;

    /**
     * @DTA\Data(field="description_length_too_long", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $description_length_too_long;

    /**
     * @DTA\Data(field="gender_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $gender_invalid;

    /**
     * @DTA\Data(field="age_group_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $age_group_invalid;

    /**
     * @DTA\Data(field="size_type_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $size_type_invalid;

    /**
     * @DTA\Data(field="link_format_warning", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $link_format_warning;

    /**
     * @DTA\Data(field="duplicate_products", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $duplicate_products;

    /**
     * @DTA\Data(field="duplicate_links", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $duplicate_links;

    /**
     * @DTA\Data(field="sales_price_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $sales_price_invalid;

    /**
     * @DTA\Data(field="product_category_depth_warning", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $product_category_depth_warning;

    /**
     * @DTA\Data(field="adwords_same_as_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $adwords_same_as_link;

    /**
     * @DTA\Data(field="duplicate_headers", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $duplicate_headers;

    /**
     * @DTA\Data(field="fetch_same_signature", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $fetch_same_signature;

    /**
     * @DTA\Data(field="adwords_format_warning", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $adwords_format_warning;

    /**
     * @DTA\Data(field="additional_image_link_warning", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $additional_image_link_warning;

    /**
     * @DTA\Data(field="image_link_warning", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $image_link_warning;

    /**
     * @DTA\Data(field="shipping_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $shipping_invalid;

    /**
     * @DTA\Data(field="tax_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $tax_invalid;

    /**
     * @DTA\Data(field="shipping_weight_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $shipping_weight_invalid;

    /**
     * @DTA\Data(field="expiration_date_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $expiration_date_invalid;

    /**
     * @DTA\Data(field="availability_date_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $availability_date_invalid;

    /**
     * @DTA\Data(field="sale_date_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $sale_date_invalid;

    /**
     * @DTA\Data(field="weight_unit_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $weight_unit_invalid;

    /**
     * @DTA\Data(field="is_bundle_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $is_bundle_invalid;

    /**
     * @DTA\Data(field="updated_time_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $updated_time_invalid;

    /**
     * @DTA\Data(field="custom_label_length_too_long", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $custom_label_length_too_long;

    /**
     * @DTA\Data(field="product_type_length_too_long", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $product_type_length_too_long;

    /**
     * @DTA\Data(field="too_many_additional_image_links", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $too_many_additional_image_links;

    /**
     * @DTA\Data(field="multipack_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $multipack_invalid;

    /**
     * @DTA\Data(field="indexed_product_count_large_delta", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $indexed_product_count_large_delta;

    /**
     * @DTA\Data(field="item_additional_image_download_failure", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $item_additional_image_download_failure;

    /**
     * @DTA\Data(field="optional_product_category_missing", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $optional_product_category_missing;

    /**
     * @DTA\Data(field="optional_product_category_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $optional_product_category_invalid;

    /**
     * @DTA\Data(field="optional_condition_missing", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $optional_condition_missing;

    /**
     * @DTA\Data(field="optional_condition_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $optional_condition_invalid;

    /**
     * @DTA\Data(field="ios_deep_link_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ios_deep_link_invalid;

    /**
     * @DTA\Data(field="android_deep_link_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $android_deep_link_invalid;

    /**
     * @DTA\Data(field="availability_normalized", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $availability_normalized;

    /**
     * @DTA\Data(field="condition_normalized", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $condition_normalized;

    /**
     * @DTA\Data(field="gender_normalized", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $gender_normalized;

    /**
     * @DTA\Data(field="size_type_normalized", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $size_type_normalized;

    /**
     * @DTA\Data(field="age_group_normalized", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $age_group_normalized;

    /**
     * @DTA\Data(field="utm_source_auto_corrected", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $utm_source_auto_corrected;

    /**
     * @DTA\Data(field="country_does_not_map_to_currency", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $country_does_not_map_to_currency;

    /**
     * @DTA\Data(field="min_ad_price_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $min_ad_price_invalid;

}
