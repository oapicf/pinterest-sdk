<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsItemValidationErrors
{
    /**
     * @DTA\Data(field="ADULT_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $adult_invalid = null;

    /**
     * @DTA\Data(field="ADWORDS_FORMAT_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $adwords_format_invalid = null;

    /**
     * @DTA\Data(field="AVAILABILITY_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $availability_invalid = null;

    /**
     * @DTA\Data(field="BLOCKLISTED_IMAGE_SIGNATURE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $blocklisted_image_signature = null;

    /**
     * @DTA\Data(field="DESCRIPTION_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $description_missing = null;

    /**
     * @DTA\Data(field="DUPLICATE_PRODUCTS", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $duplicate_products = null;

    /**
     * @DTA\Data(field="IMAGE_LINK_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $image_link_invalid = null;

    /**
     * @DTA\Data(field="IMAGE_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $image_link_length_too_long = null;

    /**
     * @DTA\Data(field="IMAGE_LINK_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $image_link_missing = null;

    /**
     * @DTA\Data(field="INVALID_DOMAIN", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $invalid_domain = null;

    /**
     * @DTA\Data(field="ITEMID_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $itemid_missing = null;

    /**
     * @DTA\Data(field="ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $item_main_image_download_failure = null;

    /**
     * @DTA\Data(field="LINK_FORMAT_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $link_format_invalid = null;

    /**
     * @DTA\Data(field="LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $link_length_too_long = null;

    /**
     * @DTA\Data(field="LIST_PRICE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $list_price_invalid = null;

    /**
     * @DTA\Data(field="MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $max_items_per_item_group_exceeded = null;

    /**
     * @DTA\Data(field="PARSE_LINE_ERROR", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $parse_line_error = null;

    /**
     * @DTA\Data(field="PINJOIN_CONTENT_UNSAFE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $pinjoin_content_unsafe = null;

    /**
     * @DTA\Data(field="PRICE_CANNOT_BE_DETERMINED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $price_cannot_be_determined = null;

    /**
     * @DTA\Data(field="PRICE_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $price_missing = null;

    /**
     * @DTA\Data(field="PRODUCT_LINK_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $product_link_missing = null;

    /**
     * @DTA\Data(field="PRODUCT_PRICE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $product_price_invalid = null;

    /**
     * @DTA\Data(field="TITLE_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $title_missing = null;

}
