<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CatalogsFeedValidationErrors
{
    /**
     * Pinterest couldn&#39;t download your feed.
     * @DTA\Data(field="FETCH_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $fetch_error = null;

    /**
     * Your feed wasn&#39;t ingested because it hasn’t changed in the previous 90 days.
     * @DTA\Data(field="FETCH_INACTIVE_FEED_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $fetch_inactive_feed_error = null;

    /**
     * Your feed includes data with an unsupported encoding format.
     * @DTA\Data(field="ENCODING_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $encoding_error = null;

    /**
     * Your feed includes data with formatting errors.
     * @DTA\Data(field="DELIMITER_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $delimiter_error = null;

    /**
     * Your feed is missing some required column headers.
     * @DTA\Data(field="REQUIRED_COLUMNS_MISSING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $required_columns_missing = null;

    /**
     * Some products are duplicated.
     * @DTA\Data(field="DUPLICATE_PRODUCTS", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $duplicate_products = null;

    /**
     * Some image links are formatted incorrectly.
     * @DTA\Data(field="IMAGE_LINK_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $image_link_invalid = null;

    /**
     * Some items are missing an item id in their product metadata, those items will not be published.
     * @DTA\Data(field="ITEMID_MISSING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $itemid_missing = null;

    /**
     * Some items are missing a title in their product metadata, those items will not be published.
     * @DTA\Data(field="TITLE_MISSING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $title_missing = null;

    /**
     * Some items are missing a description in their product metadata, those items will not be published.
     * @DTA\Data(field="DESCRIPTION_MISSING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $description_missing = null;

    /**
     * Some items are missing a link URL in their product metadata, those items will not be published.
     * @DTA\Data(field="PRODUCT_LINK_MISSING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $product_link_missing = null;

    /**
     * Some items are missing an image link URL in their product metadata, those items will not be published.
     * @DTA\Data(field="IMAGE_LINK_MISSING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $image_link_missing = null;

    /**
     * Some items are missing an availability value in their product metadata, those items will not be published.
     * @DTA\Data(field="AVAILABILITY_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $availability_invalid = null;

    /**
     * Some items have price formatting errors in their product metadata, those items will not be published.
     * @DTA\Data(field="PRODUCT_PRICE_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $product_price_invalid = null;

    /**
     * Some link values are formatted incorrectly.
     * @DTA\Data(field="LINK_FORMAT_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $link_format_invalid = null;

    /**
     * Your feed contains formatting errors for some items.
     * @DTA\Data(field="PARSE_LINE_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $parse_line_error = null;

    /**
     * Some adwords links contain too many characters.
     * @DTA\Data(field="ADWORDS_FORMAT_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $adwords_format_invalid = null;

    /**
     * We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
     * @DTA\Data(field="INTERNAL_SERVICE_ERROR", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $internal_service_error = null;

    /**
     * Your merchant domain needs to be claimed.
     * @DTA\Data(field="NO_VERIFIED_DOMAIN", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $no_verified_domain = null;

    /**
     * Some items have invalid adult values.
     * @DTA\Data(field="ADULT_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $adult_invalid = null;

    /**
     * Some items have image_link URLs that contain too many characters, so those items will not be published.
     * @DTA\Data(field="IMAGE_LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $image_link_length_too_long = null;

    /**
     * Some of your product link values don&#39;t match the verified domain associated with this account.
     * @DTA\Data(field="INVALID_DOMAIN", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $invalid_domain = null;

    /**
     * Your feed contains too many items, some items will not be published.
     * @DTA\Data(field="FEED_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $feed_length_too_long = null;

    /**
     * Some product links contain too many characters, those items will not be published.
     * @DTA\Data(field="LINK_LENGTH_TOO_LONG", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $link_length_too_long = null;

    /**
     * Your feed couldn&#39;t be validated because the xml file is formatted incorrectly.
     * @DTA\Data(field="MALFORMED_XML", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $malformed_xml = null;

    /**
     * Some products are missing a price, those items will not be published.
     * @DTA\Data(field="PRICE_MISSING", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $price_missing = null;

    /**
     * Your feed couldn&#39;t be validated because the file doesn&#39;t contain the minimum number of lines required.
     * @DTA\Data(field="FEED_TOO_SMALL", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $feed_too_small = null;

    /**
     * Some items exceed the maximum number of items per item group, those items will not be published.
     * @DTA\Data(field="MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $max_items_per_item_group_exceeded = null;

    /**
     * Some items&#39; main images can&#39;t be found.
     * @DTA\Data(field="ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $item_main_image_download_failure = null;

    /**
     * Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines.
     * @DTA\Data(field="PINJOIN_CONTENT_UNSAFE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $pinjoin_content_unsafe = null;

    /**
     * Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines.
     * @DTA\Data(field="BLOCKLISTED_IMAGE_SIGNATURE", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $blocklisted_image_signature = null;

    /**
     * Some items have list price formatting errors in their product metadata, those items will not be published.
     * @DTA\Data(field="LIST_PRICE_INVALID", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $list_price_invalid = null;

    /**
     * Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
     * @DTA\Data(field="PRICE_CANNOT_BE_DETERMINED", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $price_cannot_be_determined = null;

}
