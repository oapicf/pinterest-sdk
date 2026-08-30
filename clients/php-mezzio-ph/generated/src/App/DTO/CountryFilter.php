<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CountryFilter
{
    /**
     * @DTA\Data(field="COUNTRY")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleCountriesCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleCountriesCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleCountriesCriteria|null
     */
    public $country;

}
