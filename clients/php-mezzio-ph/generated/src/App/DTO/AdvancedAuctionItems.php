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
     * @DTA\Validator(name="Regex", options={"pattern":"/^\\d+$/"})
     * @var string|null
     */
    public $catalog_id;

    /**
     * Array with item bid options
     * @DTA\Data(field="items", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection319::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection319::class})
     * @var \App\DTO\Collection319|null
     */
    public $items;

}
