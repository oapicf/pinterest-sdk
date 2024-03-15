<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class GenderFilter
{
    /**
     * @DTA\Data(field="GENDER")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupMultipleGenderCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupMultipleGenderCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupMultipleGenderCriteria $gender = null;

}
