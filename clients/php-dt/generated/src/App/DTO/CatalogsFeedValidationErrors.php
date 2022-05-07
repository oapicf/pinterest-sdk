<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsFeedValidationErrors
{
    /**
     * @DTA\Data(field="fetch_error", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $fetch_error;

    /**
     * @DTA\Data(field="fetch_inactive_feed_error", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $fetch_inactive_feed_error;

    /**
     * @DTA\Data(field="encoding_error", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $encoding_error;

    /**
     * @DTA\Data(field="delimiter_error", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $delimiter_error;

    /**
     * @DTA\Data(field="required_columns_missing", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $required_columns_missing;

    /**
     * @DTA\Data(field="image_link_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $image_link_invalid;

    /**
     * @DTA\Data(field="itemid_missing", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $itemid_missing;

    /**
     * @DTA\Data(field="title_missing", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $title_missing;

    /**
     * @DTA\Data(field="description_missing", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $description_missing;

    /**
     * @DTA\Data(field="product_category_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $product_category_invalid;

    /**
     * @DTA\Data(field="product_link_missing", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $product_link_missing;

    /**
     * @DTA\Data(field="image_link_missing", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $image_link_missing;

    /**
     * @DTA\Data(field="availability_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $availability_invalid;

    /**
     * @DTA\Data(field="product_price_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $product_price_invalid;

    /**
     * @DTA\Data(field="link_format_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $link_format_invalid;

    /**
     * @DTA\Data(field="parse_line_error", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $parse_line_error;

    /**
     * @DTA\Data(field="adwords_format_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $adwords_format_invalid;

    /**
     * @DTA\Data(field="product_category_missing", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $product_category_missing;

    /**
     * @DTA\Data(field="internal_service_error", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $internal_service_error;

    /**
     * @DTA\Data(field="no_verified_domain", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $no_verified_domain;

    /**
     * @DTA\Data(field="adult_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $adult_invalid;

    /**
     * @DTA\Data(field="invalid_domain", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $invalid_domain;

    /**
     * @DTA\Data(field="feed_length_too_long", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $feed_length_too_long;

    /**
     * @DTA\Data(field="link_length_too_long", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $link_length_too_long;

    /**
     * @DTA\Data(field="malformed_xml", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $malformed_xml;

    /**
     * @DTA\Data(field="redirect_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $redirect_invalid;

    /**
     * @DTA\Data(field="price_missing", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $price_missing;

    /**
     * @DTA\Data(field="feed_too_small", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $feed_too_small;

    /**
     * @DTA\Data(field="condition_invalid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $condition_invalid;

    /**
     * @DTA\Data(field="shopify_no_products", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $shopify_no_products;

    /**
     * @DTA\Data(field="max_items_per_item_group_exceeded", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_items_per_item_group_exceeded;

    /**
     * @DTA\Data(field="item_main_image_download_failure", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $item_main_image_download_failure;

    /**
     * @DTA\Data(field="pinjoin_content_unsafe", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $pinjoin_content_unsafe;

    /**
     * @DTA\Data(field="blocklisted_image_signature", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $blocklisted_image_signature;

}
