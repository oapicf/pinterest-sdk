<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Product metadata entity
 */
class CatalogsProductMetadata
{
    /**
     * The user-created unique ID that represents the product.
     * @DTA\Data(field="item_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $item_id = null;

    /**
     * The parent ID of the product.
     * @DTA\Data(field="item_group_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $item_group_id = null;

    /**
     * @DTA\Data(field="availability")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NonNullableProductAvailabilityType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NonNullableProductAvailabilityType::class})
     */
    public ?\App\DTO\NonNullableProductAvailabilityType $availability = null;

    /**
     * The price of the product.
     * @DTA\Data(field="price")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $price = null;

    /**
     * The discounted price of the product.
     * @DTA\Data(field="sale_price")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $sale_price = null;

    /**
     * @DTA\Data(field="currency")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NonNullableCatalogsCurrency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NonNullableCatalogsCurrency::class})
     */
    public ?\App\DTO\NonNullableCatalogsCurrency $currency = null;

}
