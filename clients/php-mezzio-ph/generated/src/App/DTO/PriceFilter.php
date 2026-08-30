<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PriceFilter
{
    /**
     * @DTA\Data(field="PRICE")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PriceFilterPrice::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PriceFilterPrice::class})
     * @var \App\DTO\PriceFilterPrice|null
     */
    public $price;

}
