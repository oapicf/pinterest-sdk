<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class LocalInventoryItemsGetCreate
{
    /**
     * Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
     * @DTA\Data(field="item_filters")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection420::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection420::class})
     * @var \App\DTO\Collection420|null
     */
    public $item_filters;

}
