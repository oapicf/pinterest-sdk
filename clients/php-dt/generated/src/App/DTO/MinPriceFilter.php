<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MinPriceFilter
{
    /**
     * @DTA\Data(field="MIN_PRICE")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupPricingCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupPricingCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupPricingCriteria $min_price = null;

}
