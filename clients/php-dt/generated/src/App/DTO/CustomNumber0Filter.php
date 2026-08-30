<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CustomNumber0Filter
{
    /**
     * @DTA\Data(field="CUSTOM_NUMBER_0")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupUint32Criteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupUint32Criteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupUint32Criteria $custom_number_0 = null;

}
