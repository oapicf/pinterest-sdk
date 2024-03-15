<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsItemValidationErrors
{
    /**
     * @DTA\Data(field="ADULT_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $adult_invalid;

    /**
     * @DTA\Data(field="ADWORDS_FORMAT_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $adwords_format_invalid;

    /**
     * @DTA\Data(field="AVAILABILITY_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $availability_invalid;

    /**
     * @DTA\Data(field="BLOCKLISTED_IMAGE_SIGNATURE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $blocklisted_image_signature;

    /**
     * @DTA\Data(field="DESCRIPTION_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $description_missing;

    /**
     * @DTA\Data(field="DUPLICATE_PRODUCTS", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $duplicate_products;

    /**
     * @DTA\Data(field="IMAGE_LINK_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $image_link_invalid;

    /**
     * @DTA\Data(field="IMAGE_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $image_link_length_too_long;

    /**
     * @DTA\Data(field="IMAGE_LINK_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $image_link_missing;

    /**
     * @DTA\Data(field="INVALID_DOMAIN", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $invalid_domain;

    /**
     * @DTA\Data(field="ITEMID_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $itemid_missing;

    /**
     * @DTA\Data(field="ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $item_main_image_download_failure;

    /**
     * @DTA\Data(field="LINK_FORMAT_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $link_format_invalid;

    /**
     * @DTA\Data(field="LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $link_length_too_long;

    /**
     * @DTA\Data(field="LIST_PRICE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $list_price_invalid;

    /**
     * @DTA\Data(field="MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $max_items_per_item_group_exceeded;

    /**
     * @DTA\Data(field="PARSE_LINE_ERROR", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $parse_line_error;

    /**
     * @DTA\Data(field="PINJOIN_CONTENT_UNSAFE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $pinjoin_content_unsafe;

    /**
     * @DTA\Data(field="PRICE_CANNOT_BE_DETERMINED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $price_cannot_be_determined;

    /**
     * @DTA\Data(field="PRICE_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $price_missing;

    /**
     * @DTA\Data(field="PRODUCT_LINK_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $product_link_missing;

    /**
     * @DTA\Data(field="PRODUCT_PRICE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $product_price_invalid;

    /**
     * @DTA\Data(field="TITLE_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @var \App\DTO\CatalogsItemValidationDetails|null
     */
    public $title_missing;

}
