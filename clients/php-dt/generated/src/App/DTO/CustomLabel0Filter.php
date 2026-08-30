<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CustomLabel0Filter
{
    /**
     * @DTA\Data(field="CUSTOM_LABEL_0")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria::class})
     */
    public ?\App\DTO\CatalogsProductGroupFilterOperatorTypeCriteria $custom_label_0 = null;

}
