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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupPricingCurrencyCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupPricingCurrencyCriteria::class})
     * @var \App\DTO\CatalogsProductGroupPricingCurrencyCriteria|null
     */
    public $price;

}
