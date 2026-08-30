<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Local inventory attributes for retail items (required fields for create/upsert)
 */
class RetailLocalInventoryItemAttributes
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
     * @DTA\Data(field="availability")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemAvailability::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemAvailability::class})
     * @var \App\DTO\ItemAvailability|null
     */
    public $availability;

    /**
     * The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars.
     * @DTA\Data(field="price")
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

}
