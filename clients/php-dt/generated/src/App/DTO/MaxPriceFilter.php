<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MaxPriceFilter
{
    /**
     * @DTA\Data(field="MAX_PRICE")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupPricingCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupPricingCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupPricingCriteria $max_price = null;

}
