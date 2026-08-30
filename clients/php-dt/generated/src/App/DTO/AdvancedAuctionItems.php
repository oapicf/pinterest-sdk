<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Response object containing item bid options
 */
class AdvancedAuctionItems
{
    /**
     * Response object of item bid options
     * @DTA\Data(field="catalog_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Match", options={"pattern":"/^\d+$/"})
     */
    public ?string $catalog_id = null;

    /**
     * Array with item bid options
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection319::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection319::class})
     */
    public ?\App\DTO\Collection319 $items = null;

}
