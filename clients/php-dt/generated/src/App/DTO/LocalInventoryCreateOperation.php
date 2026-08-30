<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Create operation for local inventory item
 */
class LocalInventoryCreateOperation
{
    /**
     * @DTA\Data(field="attributes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RetailLocalInventoryItemAttributes::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RetailLocalInventoryItemAttributes::class})
     */
    public ?\App\DTO\RetailLocalInventoryItemAttributes $attributes = null;

    /**
     * Catalog item id in the merchant namespace
     * @DTA\Data(field="item_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $item_id = null;

    /**
     * @DTA\Data(field="operation")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $operation = null;

    /**
     * Store code for the local inventory item
     * @DTA\Data(field="store_code")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $store_code = null;

}
