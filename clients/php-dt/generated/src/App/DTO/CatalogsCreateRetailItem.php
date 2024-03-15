<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An item to be created
 */
class CatalogsCreateRetailItem
{
    /**
     * The catalog item id in the merchant namespace
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
     * @DTA\Data(field="attributes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemAttributes::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemAttributes::class})
     */
    public ?\App\DTO\ItemAttributes $attributes = null;

}
