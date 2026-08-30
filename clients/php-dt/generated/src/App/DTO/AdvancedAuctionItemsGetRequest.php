<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Request object used to get bid options values for a batch of retail catalog items
 */
class AdvancedAuctionItemsGetRequest
{
    /**
     * Catalog id pertaining to the retail item
     * @DTA\Data(field="catalog_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $catalog_id = null;

    /**
     * A list of retail catalog items to fetch bid options for
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection316::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection316::class})
     */
    public ?\App\DTO\Collection316 $items = null;

}
