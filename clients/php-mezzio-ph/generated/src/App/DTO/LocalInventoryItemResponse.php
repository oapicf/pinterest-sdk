<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Local inventory item response
 */
class LocalInventoryItemResponse
{
    /**
     * Ad link for the item
     * @DTA\Data(field="ad_link", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $ad_link;

    /**
     * Availability status of the item
     * @DTA\Data(field="availability", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemAvailability::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemAvailability::class})
     * @var \App\DTO\ItemAvailability|null
     */
    public $availability;

    /**
     * The millisecond timestamp when the local inventory item was created
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_at;

    /**
     * The catalog item id in the merchant namespace
     * @DTA\Data(field="item_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_id;

    /**
     * The millisecond timestamp when the local inventory item was lastly modified by the merchant.
     * @DTA\Data(field="last_updated_time")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $last_updated_time;

    /**
     * The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars.
     * @DTA\Data(field="price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $price;

    /**
     * The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
     * @DTA\Data(field="sale_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $sale_price;

    /**
     * Store metadata for this local inventory item
     * @DTA\Data(field="store_metadata")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StoreMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StoreMetadata::class})
     * @var \App\DTO\StoreMetadata|null
     */
    public $store_metadata;

}
