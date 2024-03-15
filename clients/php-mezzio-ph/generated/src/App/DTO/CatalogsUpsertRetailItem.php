<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * An item to be upserted
 */
class CatalogsUpsertRetailItem
{
    /**
     * The catalog item id in the merchant namespace
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
     * @DTA\Data(field="attributes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemAttributes::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemAttributes::class})
     * @var \App\DTO\ItemAttributes|null
     */
    public $attributes;

}
