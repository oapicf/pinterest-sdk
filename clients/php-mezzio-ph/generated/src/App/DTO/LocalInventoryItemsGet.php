<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Model for getting local inventory items
 */
class LocalInventoryItemsGet
{
    /**
     * Array of local inventory items
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection421::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection421::class})
     * @var \App\DTO\Collection421|null
     */
    public $items;

}
