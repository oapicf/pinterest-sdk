<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsItemValidationErrors
{
    /**
     * Item has an invalid adult value.
     * @DTA\Data(field="ADULT_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $adult_invalid = null;

    /**
     * Adword link contains too many characters.
     * @DTA\Data(field="ADWORDS_FORMAT_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $adwords_format_invalid = null;

    /**
     * Item is missing availability value in its product metadata, this item will not be published.
     * @DTA\Data(field="AVAILABILITY_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $availability_invalid = null;

    /**
     * Item will not be published because it doesn&#39;t meet Pinterest&#39;s Merchant Guidelines.
     * @DTA\Data(field="BLOCKLISTED_IMAGE_SIGNATURE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $blocklisted_image_signature = null;

    /**
     * Item is missing description in its product metadata, this item will not be published.
     * @DTA\Data(field="DESCRIPTION_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $description_missing = null;

    /**
     * This product is duplicated. The duplicate entry will not be published.
     * @DTA\Data(field="DUPLICATE_PRODUCTS", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $duplicate_products = null;

    /**
     * Image link is invalid.
     * @DTA\Data(field="IMAGE_LINK_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $image_link_invalid = null;

    /**
     * Item has image_link URL that contains too many characters, so the item will not be published.
     * @DTA\Data(field="IMAGE_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $image_link_length_too_long = null;

    /**
     * Item is missing an image link URL in its product metadata, this item will not be published.
     * @DTA\Data(field="IMAGE_LINK_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $image_link_missing = null;

    /**
     * Product link value doesn&#39;t match the verified domain associated with this account.
     * @DTA\Data(field="INVALID_DOMAIN", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $invalid_domain = null;

    /**
     * Main image can&#39;t be found.
     * @DTA\Data(field="ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $item_main_image_download_failure = null;

    /**
     * Item is missing item id in its product metadata, this item will not be published.
     * @DTA\Data(field="ITEMID_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $itemid_missing = null;

    /**
     * Link is invalid.
     * @DTA\Data(field="LINK_FORMAT_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $link_format_invalid = null;

    /**
     * Product link contains too many characters, this item will not be published.
     * @DTA\Data(field="LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $link_length_too_long = null;

    /**
     * Item has a list price formatting error, this item will not be published.
     * @DTA\Data(field="LIST_PRICE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $list_price_invalid = null;

    /**
     * Item exceed the maximum number of items per item group, this item will not be published.
     * @DTA\Data(field="MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $max_items_per_item_group_exceeded = null;

    /**
     * Item contains formating errors.
     * @DTA\Data(field="PARSE_LINE_ERROR", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $parse_line_error = null;

    /**
     * Item will not be published because it doesn&#39;t meet Pinterest&#39;s Merchant Guidelines.
     * @DTA\Data(field="PINJOIN_CONTENT_UNSAFE", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $pinjoin_content_unsafe = null;

    /**
     * Item price cannot be determined because the price, list price, and sale price are all different.
     * @DTA\Data(field="PRICE_CANNOT_BE_DETERMINED", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $price_cannot_be_determined = null;

    /**
     * Product is missing a price, this item will not be published.
     * @DTA\Data(field="PRICE_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $price_missing = null;

    /**
     * Item is missing a link URL in its product metadata, this item will not be published.
     * @DTA\Data(field="PRODUCT_LINK_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $product_link_missing = null;

    /**
     * Item has a price formatting error in its product metadata, this item will not be published.
     * @DTA\Data(field="PRODUCT_PRICE_INVALID", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $product_price_invalid = null;

    /**
     * Item is missing title in its product metadata, this item will not be published.
     * @DTA\Data(field="TITLE_MISSING", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsItemValidationDetails::class})
     */
    public ?\App\DTO\CatalogsItemValidationDetails $title_missing = null;

}
