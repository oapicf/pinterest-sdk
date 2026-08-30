<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Response object containing the results of an operation on an item bid option
 */
class AdvancedAuctionProcessedItems
{
    /**
     * Catalog id pertaining to all items
     * @DTA\Data(field="catalog_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $catalog_id;

    /**
     * Array of advanced auction processed items
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection321::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection321::class})
     * @var \App\DTO\Collection321|null
     */
    public $items;

}
