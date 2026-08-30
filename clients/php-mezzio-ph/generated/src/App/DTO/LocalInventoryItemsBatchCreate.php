<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Resource create operation model.
 */
class LocalInventoryItemsBatchCreate
{
    /**
     * Array of inventory operations. Up to 1000 items per request.
     * @DTA\Data(field="operations")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection417::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection417::class})
     * @var \App\DTO\Collection417|null
     */
    public $operations;

}
