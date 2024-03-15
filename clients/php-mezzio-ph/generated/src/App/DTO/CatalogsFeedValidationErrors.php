<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsFeedValidationErrors
{
    /**
     * Pinterest couldn&#39;t download your feed.
     * @DTA\Data(field="FETCH_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $fetch_error;

    /**
     * Your feed wasn&#39;t ingested because it hasn’t changed in the previous 90 days.
     * @DTA\Data(field="FETCH_INACTIVE_FEED_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $fetch_inactive_feed_error;

    /**
     * Your feed includes data with an unsupported encoding format.
     * @DTA\Data(field="ENCODING_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $encoding_error;

    /**
     * Your feed includes data with formatting errors.
     * @DTA\Data(field="DELIMITER_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $delimiter_error;

    /**
     * Your feed is missing some required column headers.
     * @DTA\Data(field="REQUIRED_COLUMNS_MISSING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $required_columns_missing;

    /**
     * Some products are duplicated.
     * @DTA\Data(field="DUPLICATE_PRODUCTS", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $duplicate_products;

    /**
     * Some image links are formatted incorrectly.
     * @DTA\Data(field="IMAGE_LINK_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $image_link_invalid;

    /**
     * Some items are missing an item id in their product metadata, those items will not be published.
     * @DTA\Data(field="ITEMID_MISSING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $itemid_missing;

    /**
     * Some items are missing a title in their product metadata, those items will not be published.
     * @DTA\Data(field="TITLE_MISSING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $title_missing;

    /**
     * Some items are missing a description in their product metadata, those items will not be published.
     * @DTA\Data(field="DESCRIPTION_MISSING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $description_missing;

    /**
     * Some items are missing a link URL in their product metadata, those items will not be published.
     * @DTA\Data(field="PRODUCT_LINK_MISSING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $product_link_missing;

    /**
     * Some items are missing an image link URL in their product metadata, those items will not be published.
     * @DTA\Data(field="IMAGE_LINK_MISSING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $image_link_missing;

    /**
     * Some items are missing an availability value in their product metadata, those items will not be published.
     * @DTA\Data(field="AVAILABILITY_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $availability_invalid;

    /**
     * Some items have price formatting errors in their product metadata, those items will not be published.
     * @DTA\Data(field="PRODUCT_PRICE_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $product_price_invalid;

    /**
     * Some link values are formatted incorrectly.
     * @DTA\Data(field="LINK_FORMAT_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $link_format_invalid;

    /**
     * Your feed contains formatting errors for some items.
     * @DTA\Data(field="PARSE_LINE_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $parse_line_error;

    /**
     * Some adwords links contain too many characters.
     * @DTA\Data(field="ADWORDS_FORMAT_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $adwords_format_invalid;

    /**
     * We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
     * @DTA\Data(field="INTERNAL_SERVICE_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $internal_service_error;

    /**
     * Your merchant domain needs to be claimed.
     * @DTA\Data(field="NO_VERIFIED_DOMAIN", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $no_verified_domain;

    /**
     * Some items have invalid adult values.
     * @DTA\Data(field="ADULT_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $adult_invalid;

    /**
     * Some items have image_link URLs that contain too many characters, so those items will not be published.
     * @DTA\Data(field="IMAGE_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $image_link_length_too_long;

    /**
     * Some of your product link values don&#39;t match the verified domain associated with this account.
     * @DTA\Data(field="INVALID_DOMAIN", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $invalid_domain;

    /**
     * Your feed contains too many items, some items will not be published.
     * @DTA\Data(field="FEED_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $feed_length_too_long;

    /**
     * Some product links contain too many characters, those items will not be published.
     * @DTA\Data(field="LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $link_length_too_long;

    /**
     * Your feed couldn&#39;t be validated because the xml file is formatted incorrectly.
     * @DTA\Data(field="MALFORMED_XML", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $malformed_xml;

    /**
     * Some products are missing a price, those items will not be published.
     * @DTA\Data(field="PRICE_MISSING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $price_missing;

    /**
     * Your feed couldn&#39;t be validated because the file doesn&#39;t contain the minimum number of lines required.
     * @DTA\Data(field="FEED_TOO_SMALL", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $feed_too_small;

    /**
     * Some items exceed the maximum number of items per item group, those items will not be published.
     * @DTA\Data(field="MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_items_per_item_group_exceeded;

    /**
     * Some items&#39; main images can&#39;t be found.
     * @DTA\Data(field="ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $item_main_image_download_failure;

    /**
     * Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines.
     * @DTA\Data(field="PINJOIN_CONTENT_UNSAFE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $pinjoin_content_unsafe;

    /**
     * Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines.
     * @DTA\Data(field="BLOCKLISTED_IMAGE_SIGNATURE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $blocklisted_image_signature;

    /**
     * Some items have list price formatting errors in their product metadata, those items will not be published.
     * @DTA\Data(field="LIST_PRICE_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $list_price_invalid;

    /**
     * Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
     * @DTA\Data(field="PRICE_CANNOT_BE_DETERMINED", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $price_cannot_be_determined;

}
