<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CurrencyFilter
{
    /**
     * @DTA\Data(field="CURRENCY")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupCurrencyCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupCurrencyCriteria::class})
     * @var \App\DTO\CatalogsProductGroupCurrencyCriteria|null
     */
    public $currency;

}
