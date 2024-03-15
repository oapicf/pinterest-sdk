<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Object describing an item batch record to upsert items
 */
class ItemUpsertBatchRecord
{
    /**
     * The catalog item id in the merchant namespace
     * @DTA\Data(field="item_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $item_id = null;

    /**
     * @DTA\Data(field="attributes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemAttributes::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemAttributes::class})
     */
    public ?\App\DTO\ItemAttributes $attributes = null;

}
