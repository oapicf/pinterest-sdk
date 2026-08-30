<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Age and gender distribution who engaged with this product category in the past 3 months
 */
class ProductCategoriesDemographic
{
    /**
     * Age demographic distribution
     * @DTA\Data(field="age")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection474::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection474::class})
     */
    public ?\App\DTO\Collection474 $age = null;

    /**
     * @DTA\Data(field="gender")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenderDemographics::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenderDemographics::class})
     */
    public ?\App\DTO\GenderDemographics $gender = null;

}
