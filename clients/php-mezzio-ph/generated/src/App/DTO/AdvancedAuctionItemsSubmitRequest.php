<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
 */
class AdvancedAuctionItemsSubmitRequest
{
    /**
     * Catalog id pertaining to all items
     * @DTA\Data(field="catalog_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $catalog_id;

    /**
     * Array of item bid option operations
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection320::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection320::class})
     * @var \App\DTO\Collection320|null
     */
    public $items;

}
