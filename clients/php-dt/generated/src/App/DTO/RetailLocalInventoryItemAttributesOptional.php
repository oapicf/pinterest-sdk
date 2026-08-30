<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Local inventory attributes for retail items (all fields optional for update/get)
 */
class RetailLocalInventoryItemAttributesOptional
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

}
