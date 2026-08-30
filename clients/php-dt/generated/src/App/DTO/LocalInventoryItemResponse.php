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
     */
    public ?string $ad_link = null;

    /**
     * Availability status of the item
     * @DTA\Data(field="availability", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemAvailability::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemAvailability::class})
     */
    public ?\App\DTO\ItemAvailability $availability = null;

    /**
     * The millisecond timestamp when the local inventory item was created
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_at = null;

    /**
     * The catalog item id in the merchant namespace
     * @DTA\Data(field="item_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $item_id = null;

    /**
     * The millisecond timestamp when the local inventory item was lastly modified by the merchant.
     * @DTA\Data(field="last_updated_time")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $last_updated_time = null;

    /**
     * The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars.
     * @DTA\Data(field="price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $price = null;

    /**
     * The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
     * @DTA\Data(field="sale_price", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $sale_price = null;

    /**
     * Store metadata for this local inventory item
     * @DTA\Data(field="store_metadata")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StoreMetadata::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StoreMetadata::class})
     */
    public ?\App\DTO\StoreMetadata $store_metadata = null;

}
