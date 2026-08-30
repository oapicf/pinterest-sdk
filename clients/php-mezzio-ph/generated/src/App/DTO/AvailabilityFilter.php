<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AvailabilityFilter
{
    /**
     * @DTA\Data(field="AVAILABILITY")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleStringCriteria::class})
     * @var \App\DTO\CatalogsProductGroupMultipleStringCriteria|null
     */
    public $availability;

}
