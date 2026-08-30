<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Retail product metadata entity
 */
class CatalogsRetailProductMetadata
{
    /**
     * @DTA\Data(field="availability")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ProductAvailability::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ProductAvailability::class})
     * @var \App\DTO\ProductAvailability|null
     */
    public $availability;

    /**
     * @DTA\Data(field="currency")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\NonNullableCatalogsCurrency::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\NonNullableCatalogsCurrency::class})
     * @var \App\DTO\NonNullableCatalogsCurrency|null
     */
    public $currency;

    /**
     * The parent ID of the product.
     * @DTA\Data(field="item_group_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_group_id;

    /**
     * The user-created unique ID that represents the product.
     * @DTA\Data(field="item_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_id;

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

}
