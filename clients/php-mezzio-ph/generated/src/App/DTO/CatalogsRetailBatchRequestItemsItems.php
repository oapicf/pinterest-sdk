<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CatalogsRetailBatchRequestItemsItems
{
    /**
     * @DTA\Data(field="attributes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemAttributesRequest::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemAttributesRequest::class})
     * @var \App\DTO\ItemAttributesRequest|null
     */
    public $attributes;

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
     * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
     * @DTA\Data(field="update_mask", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\UpdateMaskFieldType[]|null
     */
    public $update_mask;

    /**
     * The millisecond timestamp when the item was lastly modified by the merchant.
     * @DTA\Data(field="last_updated_time", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $last_updated_time;

}
