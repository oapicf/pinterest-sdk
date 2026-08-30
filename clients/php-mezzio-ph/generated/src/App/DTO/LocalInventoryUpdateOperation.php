<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Update operation for local inventory item
 */
class LocalInventoryUpdateOperation
{
    /**
     * @DTA\Data(field="attributes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RetailLocalInventoryItemAttributesOptional::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RetailLocalInventoryItemAttributesOptional::class})
     * @var \App\DTO\RetailLocalInventoryItemAttributesOptional|null
     */
    public $attributes;

    /**
     * Catalog item id in the merchant namespace
     * @DTA\Data(field="item_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_id;

    /**
     * @DTA\Data(field="operation")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $operation;

    /**
     * Store code for the local inventory item
     * @DTA\Data(field="store_code")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $store_code;

}
