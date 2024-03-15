<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Object describing an item batch record to update items
 */
class ItemUpdateBatchRecord
{
    /**
     * The catalog item id in the merchant namespace
     * @DTA\Data(field="item_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $item_id = null;

    /**
     * @DTA\Data(field="attributes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UpdatableItemAttributes::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\UpdatableItemAttributes::class})
     */
    public ?\App\DTO\UpdatableItemAttributes $attributes = null;

    /**
     * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
     * @DTA\Data(field="update_mask", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $update_mask = null;

}
