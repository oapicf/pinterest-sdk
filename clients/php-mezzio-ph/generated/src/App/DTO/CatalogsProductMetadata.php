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
     * @var string|null
     */
    public $item_id;

    /**
     * The parent ID of the product.
     * @DTA\Data(field="item_group_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_group_id;

    /**
     * @DTA\Data(field="availability")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NonNullableProductAvailabilityType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NonNullableProductAvailabilityType::class})
     * @var \App\DTO\NonNullableProductAvailabilityType|null
     */
    public $availability;

    /**
     * The price of the product.
     * @DTA\Data(field="price")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $price;

    /**
     * The discounted price of the product.
     * @DTA\Data(field="sale_price")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $sale_price;

    /**
     * @DTA\Data(field="currency")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NonNullableCatalogsCurrency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NonNullableCatalogsCurrency::class})
     * @var \App\DTO\NonNullableCatalogsCurrency|null
     */
    public $currency;

}
